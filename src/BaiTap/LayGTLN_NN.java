package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class LayGTLN_NN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào giá trị mảng: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("nhập phần tử ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("array ban đầu: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("array sắp xếp: " + Arrays.toString(a));
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		sc.close();
	}
}
