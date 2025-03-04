
class Notes {
	public static void main(String[] args) {
		
		//Try Catch

		//Try code block - if at any point your code throws an exception, we jump to catch instead of crashing

		int arr[] = new int[2];
		try { //as soon as an exception happens, the rest of the try is skipped
			arr[-1] = 0;
			int a = 5/0;
			int num = Integer.parseInt("Hello");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println("YOU CANT DIVIDE BY ZEROOOO");
		}
		catch (NumberFormatException e) {
			System.out.println("You can only enter numberrrsss");
		}
		catch (Exception e) { //avoid if you know what exceptions to expect
			System.out.println(e);
		}

		System.out.println("Code after exception");

	}
}
