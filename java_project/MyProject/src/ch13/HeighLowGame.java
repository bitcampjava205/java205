package ch13;

import java.util.Random;
import java.util.Scanner;

public class HeighLowGame {

	//static boolean check = true;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1~100 사이의 숫자를 맞추면 됩니다.");
		
		Random random = new Random();
		int num = random.nextInt(100);
		System.out.println("랜덤 숫자 : " + num);
		
		CountDownThread downThread = new CountDownThread();
		downThread.start();

		while (true) {
			System.out.println("숫자를 입력해주세요.");
			int userNum = Integer.parseInt(scanner.nextLine()); 
			if(userNum>num) {
				System.out.println("높은 숫자 입니다.");
			} else if(userNum<num) {
				System.out.println("낮은 숫자 입니다.");
			} else {
				System.out.println("정답입니다. !!! 승리~!!");
				System.exit(0);
			}
		}

	}

}

class CountDownThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("10초가 지나 게임에 패했습니다.");
		System.exit(0);
	}

}
