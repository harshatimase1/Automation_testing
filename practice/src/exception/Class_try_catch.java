package exception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Class_try_catch {

	public static void main(String[] args) {
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Exception Handled");
		}
	}
}
