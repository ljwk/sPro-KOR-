import java.util.Random;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] na = new int[10];
		int count = 0;

		for (; count < 10; count++)
			na[count] = new Random().nextInt(20) + 1;

		for (count = 0; count < 10; count++)
			System.out.printf("%d : %d\n", count + 1, na[count]);
	}
}