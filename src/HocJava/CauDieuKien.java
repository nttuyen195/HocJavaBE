package HocJava;

import java.util.Scanner;

public class CauDieuKien {
	public static void main(String[] args) {
//		dưới 10m không đóng thuế
//		từ 10m đến 15m: đóng 10%
//		từ 15m đến 30m: đóng 20%
//		trên 30m đóng thuế: 50%
//		int score = 5;
//		if(score > 5){
//			System.out.println("đủ điểm qua môn");
//		} else {
//			System.out.println("Tạch môn");
//		}
//		System.out.println("run here: " + (score >5));
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào lương tháng này:");
		int tax = sc.nextInt();
		if (tax < 10) {
			System.out.println("không cần đóng thuế");
		} else if (10 <= tax && tax <= 15) {
			System.out.println("Thuế 10%");
		} else if (15 <= tax && tax <= 30) {
			System.out.println("Thuế 20%");
		} else {
			System.out.println("thuế 50%");
		}
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("Lựa chọn của bạn là : ");
		int value = sc.nextInt();
		switch (value) {
		case 1:
			System.out.println("bạn đã lựa chọn phép cộng");
			break;
		case 2:
			System.out.println("bạn đã lựa chọn phép trừ");
			break;
		default:
			System.out.println("bạn lựa chọn thoát chương trình");
			System.exit(0);
		}
		sc.close();
	}

}
