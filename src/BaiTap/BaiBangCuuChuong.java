package BaiTap;

import java.util.Scanner;

public class BaiBangCuuChuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên bất kì: ");
		int x = sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", x, i, x * i);
		}
		sc.close();
	}
}
