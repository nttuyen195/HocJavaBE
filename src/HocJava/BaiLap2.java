package HocJava;

import java.util.Scanner;

public class BaiLap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chiều dài: ");
		int Chieudai = sc.nextInt();
		System.out.println("Chiều rộng: ");
		int Chieurong = sc.nextInt();
		int Chuvi = (Chieudai + Chieurong) * 2;
		int Dientich = Chieudai * Chieurong;
		int Canhnhonhat = Math.min(Chieudai, Dientich);
		System.out.println(
				"Diện tích là: " + Dientich + "\n" + "Chu vi là: " + Chuvi + "\n" + "Cạnh nhỏ nhất: " + Canhnhonhat);

	}
}
