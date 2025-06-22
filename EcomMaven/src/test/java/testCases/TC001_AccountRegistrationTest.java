package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_account_registration() throws InterruptedException {
		logger.info("***** HB Starting TC001_AccountRegistrationTest *****");

		try {
			HomePage hp = new HomePage(driver);

			hp.clickMyAccount();

			logger.info("***** Clicked on My account link *****");

			hp.clickResister();
			logger.info("***** Clicked on Register link *****");

			AccountRegistrationPage reg = new AccountRegistrationPage(driver);
			logger.info("***** Entered registration info *****");

			reg.setFirstName(randomAlphabets());
			reg.setLastName(randomAlphabets());

			reg.setEmail(randomAlphaNumric() + "@test.com");
			reg.setTelephone(randomNumric());

			String pswd = randomNumric();
			reg.setPassword(pswd);
			reg.setConfirmPassword(pswd);

			reg.setPrivacyPolicy();
			logger.info("***** Privacy policy selected *****");
			reg.clickContinue();
			logger.info("***** Clicked on Continue button *****");

			String actualMsg = reg.getConfirmationMsg();

			if (actualMsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);

			} else {
				logger.error("Test failed");
				logger.debug("Debug logs");
				Assert.assertTrue(false);
			}
			// assertEquals(actualMsg, "Your Account Has Been Created!");
		}

		catch (Exception e) {

			Assert.fail();
		}

		logger.info("***** Completed TC001_AccountRegistrationTest *****");
	}

}
