package database_testing;

import dynamic_code.database_testing;

public class Facebook extends database_testing {

	public static void main(String[] args) throws Throwable {

		launch_Browser("chrome");
		takescreenshot("Browser launch");

		Hiturl("https://www.facebook.com/");
		takescreenshot("facebook_url");

		database_connection("stp", "select email,password from facebook where sr_no =2;");

		database_coloum("email", "//input[@id='email']");
		takescreenshot("email_entered");

		database_coloum("password", "");
		takescreenshot("password");

	}

}
