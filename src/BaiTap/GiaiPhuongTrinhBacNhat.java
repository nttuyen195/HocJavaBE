package BaiTap;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số nguyên a:");
		int a = sc.nextInt();
		System.out.println("nhập vào số nguyên b:");
		int b = sc.nextInt();
		System.out.printf("giải phương trình bậc nhất: %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("phương trình có nghiệm = %.3f ", x);
		}
		sc.close();
	}
}
