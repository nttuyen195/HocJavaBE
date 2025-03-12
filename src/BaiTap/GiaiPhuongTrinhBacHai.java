package BaiTap;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số nguyên a:");
		int a = sc.nextInt();
		System.out.println("nhập vào số nguyên b:");
		int b = sc.nextInt();
		System.out.println("nhập vào số nguyên c:");
		int c = sc.nextInt();
		System.out.printf("Giải phương trình bậc hai = %dx^2 + %dx + %d \n", a, b, c);
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("phương trình có vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("phương trình vô nghiệm");
			} else {
				float x0 = (float) -c / b;
				System.out.printf("phương trình có nghiệm = %.3f \n", x0);
			}
		} else {
			int delta = (b ^ 2) - (4 * a * c);
			if (delta < 0) {
				System.out.println("phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.3f \n", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("phương trình có 2 nghiệm x1 = %.3f x2 = %.3f", x1, x2);
			}
		}
		sc.close();
	}
}
