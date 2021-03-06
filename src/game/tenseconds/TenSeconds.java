package game.tenseconds;

import java.util.Scanner;

public class TenSeconds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter を押したらスタートします。");

		scanner.nextLine();
		long startTime = System.currentTimeMillis();
		System.out.println("10秒たったら Enter を押してください。");

		scanner.nextLine();
		long endTime = System.currentTimeMillis();

		double second = (double)(endTime - startTime) / 1000.0;
		double differenceTime = (double)(second-10);
		System.out.println(second + "秒でした。(差:" + differenceTime + "秒)");

		scanner.close();
	}
}
