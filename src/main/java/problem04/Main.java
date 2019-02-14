package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static int strike;
	static int ball;
	static int testcase=1;
	
	public static void main(String[] args) {

		Random randomGenerator = new Random();
		int randomInteger = randomGenerator.nextInt(1000);

		

		
		//콘솔창 테스트시 사용자 입력수는 숫자를 하나씩 입력후 엔터 (총 3번)
		while (strike < 3) {

			int computer[] = new int[3]; // 컴퓨터가 정한 값
			int user[] = new int[3]; //유저가 정한 값

			while (computer[0] == 0) {
				computer[0] = randomGenerator.nextInt(10);
			}

			while (computer[0] == computer[1] || computer[1] == 0) {
				computer[1] = randomGenerator.nextInt(10);
			}

			while (computer[0] == computer[2] || computer[1] == computer[2] || computer[2] == 0) {
				computer[2] = randomGenerator.nextInt(10);
			}
			
			// 위  while문은 각 숫자의 중복을 방지하기 위해 케이스를 나눔, 만약 숫자 1이 첫번째자리수에 나왔는데 3번째 자리에 또 1이나온다면 볼과 스트라이크가 동시에 올라가는 상황발생방지 
			System.out.println("컴퓨터 난수 확인");
			for(int i = 0; i<3; i++) {
				System.out.print(computer[i]);
			}
			System.out.println();

			Scanner s = new Scanner(System.in);
			
			
			for (int i = 0; i < user.length; i++) {
				user[i] = s.nextInt();

				while (user[i] >= 10 || user[i] <= 0) {
					user[i] = s.nextInt();
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					if (computer[i] == user[j]) {

						if (i == j) {
							strike += 1;
						} else {
							ball += 1;
						}
					}

				}
			}
			if (strike == 3) { 
				System.out.println(testcase++ +" - S:" + strike +", "+ "B:" + ball +", "+ "O:" + (3 - strike - ball));
				System.out.println("(종료)");
				System.exit(0); 
			} else {
				System.out.println(testcase++ +" - S:" + strike +", "+ "B:" + ball +", "+ "O:" + (3 - strike - ball));
				strike = 0;
				ball = 0;
			}

		}
	}
}