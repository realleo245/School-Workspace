import java.util.Scanner;

public class RestOfJava {
	public static void main(String[] args) {
		MyInterface add = (a, b) -> { return a + b; };
		MyInterface mult = (a,b) -> { return a * b; };
		
		System.out.println("1+2="  + calc(add, 1, 2));
		System.out.println("1*2=" + calc(mult, 1, 2));
		System.out.println(varArgSum(1));
		System.out.println(varArgSum(1, 2, 3, 4, 5));
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(varArgSum(arr));
		
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		String evenOdd = num % 2 == 0 ? "even" : "odd";
		System.out.println(num + " is " + evenOdd);
	}


	public static int calc(MyInterface f, int x, int y) {
		return f.doMath(x, y);
	}
	
	public static int varArgSum(int... nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
}
