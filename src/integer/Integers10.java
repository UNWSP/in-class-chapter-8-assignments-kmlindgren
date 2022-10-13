package integer;

public class Integers10 {

	public static void main(String[] args) {
		int[] tenMult = {10, 20, 30, 40, 50, 60};
		
		for(int num : tenMult) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
		
		for(int num = tenMult.length - 1; num >= 0; num--) {
			System.out.print(tenMult[num] + ", ");
		}
		
		System.out.println();
		
		int sum = 0;
		
		for (int num = 0; num < tenMult.length; num++)
            sum += tenMult[num];
		
		System.out.println("Sum: " + sum);
		
		int avg = sum / tenMult.length;
		
		System.out.print("Average: " + avg);
	}

}
