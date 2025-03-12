package HocJava;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello world Java");
//		int a = 6;
//		int b = 8;
//		int c = a + b;
//		System.out.println("Sum: " + c);
//		int age = 23;
//		String name = "Nguyễn Trọng Tuyên";
//		System.out.println("My age in: " + age + ", name is " + name);
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Bạn tên là gì: ");
//		String Ten = scanner.nextLine();
//		System.out.println("bạn bao nhiêu tuổi ");
//		int Tuoi = scanner.nextInt();
//		System.out.println("Tôi tên là " + Ten + ", tuổi của tôi là " + Tuoi);
		System.out.println("FistNumber");
		int FistNumber = scanner.nextInt();
		System.out.println("SecondNumber");
		int SecondNumber = scanner.nextInt();
		System.out.println("min: " + Math.min(FistNumber, SecondNumber));
		scanner.close();
	}
}
