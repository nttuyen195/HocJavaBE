package HocJava;

import java.util.Scanner;

public class BaiLap1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên của bạn là: ");
		String name = scanner.nextLine();
		System.out.println("Tuổi của bạn là: ");
		int age = scanner.nextInt();
		System.out.println(name + " có tuổi " + age);
		scanner.close();
	}

}
