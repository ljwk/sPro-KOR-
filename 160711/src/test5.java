import java.util.Random;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[10];
		int count = 0;

		for (int tmp; count < n.length; count++) {
			boolean t;
			do {
				t = false;
				tmp = new Random().nextInt(20) + 1;
				for (int i = 0; i < count; i++) {
					if (tmp == n[i]) {
						t = true;
						break;
					}
				}
			} while (t);
			n[count] = tmp;
		}

		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i; j < n.length; j++) {
				if (n[i] > n[j]) {
					int tmp = n[j];
					n[j] = n[i];
					n[i] = tmp;
				}
			}
		}

		for (int i = 0; i < n.length; i++) {
			System.out.printf("%d \t", n[i]);
		}
	}
}