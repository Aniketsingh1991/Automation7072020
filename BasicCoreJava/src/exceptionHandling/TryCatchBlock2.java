package exceptionHandling;

public class TryCatchBlock2 {

	private static Functions fun;

	public static void main(String[] args) {
		try {
			// 1step : click on download button

			int a = 10;
			int b = 1;
			System.out.println(a / b);

			// 2step : Click on latest stable version

			String[] str = new String[2];
			str[2] = "Anand";

			// 3step : Click on latest stable version
			fun.fun1();

		} catch (ArithmeticException e) {
			System.out.println("ArithmaticException Occurred:" + e.getLocalizedMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:" + e.getLocalizedMessage());

		} catch (NullPointerException e) {
			System.out.println("NullPointerException Occurred:" + e.getLocalizedMessage());

		} catch (Exception e) {
			System.out.println("Exception Occurred:" + e.getLocalizedMessage());
		}

	}
}
