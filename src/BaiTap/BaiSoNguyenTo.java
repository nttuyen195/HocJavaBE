package BaiTap;

import java.util.Scanner;

public class BaiSoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số nguyên bất kì: ");
		int value = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= value - 1; i++) {
			if (value % i == 0) {
				System.out.println("ước số khác: " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d là số nguyên tố: ", value);
		} else {
			System.out.printf("%d là số không phải là số nguyên tố", value);
		}
		sc.close();
	}
}
