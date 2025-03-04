
class Notes {
	public static void main(String[] args) {
		//Try Catch

		//Try code block - if at any point it throws an exception we jump to the catch block
		int arr[] = new int[2];

		try {
			//index out of bounds
			arr[-1] = 5; //as soon as an exception is reached, the rest of the try code is not executed.
			
			
			int a = 10/0;

			int num4 = Integer.parseInt("Hello");
		}


		// System.out.println("3"); - code cannot come between try and catch
		
		//Catch runs only when an exception is thrown in the try block
		
		//catches are checked in order when an exception is thrown, so the bottom ones will not execute if a top one deals with it first
			
		catch (ArithmeticException aE) {
			System.out.println("You tried to divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException aIE){
			System.out.println(aIE);
			System.out.println("Haha your code failed");
		}
		catch (NumberFormatException nFE) {
			System.out.println("Thats not an int");
		}
		catch (Exception e) { //works kind of like an else that catches all remaining exceptions
			System.out.println("Some exception");
		}

		System.out.println("My code is still running");
	}
}
