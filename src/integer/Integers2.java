package integer;

public class Integers2 {

	public static void main(String[] args) {
		int[] powers = new int[5];
		
		for(int i = 0; i < powers.length; i++) {
			powers[i] = (int) Math.pow(2,  i + 1);
		}
		
		for(int num : powers) {
			System.out.println(num);
		}
		
		System.out.println();
		
		for(int num = powers.length - 1; num >= 0; num--) {
			System.out.println(powers[num]);
		}
	}
}
