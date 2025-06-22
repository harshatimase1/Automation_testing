package robot_class;

import java.awt.AWTException;

import dynamic_code.Dynamic_Robot_class;

public class Robot_class_with_dynamiccode extends Dynamic_Robot_class {

	public static void main(String[] args) throws AWTException {

		launch_Browser("chrome");
		Hiturl("https://www.ilovepdf.com/pdf_to_word%0A");

		upload_file("//a[@id='pickfiles']",
				"\"C:\\Users\\Harsha Timase\\Desktop\\Harsha all docs\\Documents_Harsha\\SSC Marksheet.pdf\"");
	}

}
