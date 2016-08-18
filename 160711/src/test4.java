import java.util.Random;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] na = new int[10];
		int count = 0;

		for (int tmp = 0; count < 10; count++) {
			boolean t;
			do {
				t = false;
				tmp = new Random().nextInt(20) + 1;
				for (int i = 0; i < count; i++) {
					if (tmp == na[i]) {
						t = true;
						break;
					}
				}
			} while (t);
			na[count] = tmp;
		}
		for (count = 0; count < 10; count++)
			System.out.printf("%d : %d\n", count + 1, na[count]);
	}
}