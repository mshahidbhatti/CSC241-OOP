public class FindMaxPro{

	byte max(byte num1, byte num2){
		return num1<num2?num2:num1;
	}

	short max(short num1, short num2){
		return num1<num2?num2:num1;
	}

	char max(char num1, char num2){
		System.out.println("char max is called");

		return num1<num2?num2:num1;
	}

	long max(long num1, long num2){
		return num1<num2?num2:num1;
	}

/*	int max(int num1, int num2){
		return num1<num2?num2:num1;
	}*/

	public float max(float num1, float num2){
		System.out.println("float max is called");
		return num1<num2?num2:num1;	
	}

	public double max(double num1, double num2){
		return num1<num2?num2:num1;	
	}

	public String max(String num1, String num2){
		return num2.compareTo(num1)<num1.compareTo(num2)?num1:num2;
	}

}