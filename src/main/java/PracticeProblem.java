public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(validIndex(new int[]{5, 8, 2, 4}, 2));
		System.out.println(validIndex(new int[]{5, 8, 2, 4}, 5));
		System.out.println(divide(5, 4));
		System.out.println(divide(8, 0));
		System.out.println(safeConvertStringtoInt("123"));
		System.out.println(safeConvertStringtoInt("Hello"));
	}

	//q1
	public static boolean validIndex(int[] array1, int num1) {
		try {
			array1[num1] = 0;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	//q2
	public static int divide(int num2, int num3){
		try {
			int a = num2/num3;
		}
		catch (ArithmeticException e) {
			return 0;
		}
		return num2/num3;
	}

	//q3
	public static int safeConvertStringtoInt(String word) {
		int num4 = 0;
		try {
			num4 = Integer.parseInt(word);
		}
		catch (NumberFormatException e) {
			return 0;
		}
		return num4;
		
	}

	

}
