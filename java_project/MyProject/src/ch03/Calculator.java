package ch03;

import java.util.Scanner;

// java.lang.*

public class Calculator {

	// 클래스 이름 -> 대문자 시작 케멀 케이스
	// 변수 이름 -> 소문자 시작 케멀 케이스
	// 상수 -> 모두 대문자
	double pi1 = 3.14d;
	float pi2 = 3.14f;
	final float PI = 3.14f; // 상수
	

	// ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	long plus(int num1, int num2) {
		// long result = num1 + num2;
		// return result;
		return (long) num1 + num2;
	}

	// ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	long minus(int num1, int num2) {
		return (long) num1 - num2;
	}

	// ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	long multi(int num1, int num2) {
		return (long) num1 * num2;
	}

	// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기 연산 후 출력하는 메소드를 정의
	float div(int num1, int num2) {
		return (float) num1 / num2; // (float)int / int -> int
	}

	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	float circum(float r) {
		return 2 * PI * r; // int * float * float
	}

	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	// 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	float cirArea(float r) {
		return PI * r * r;
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		System.out.println(cal.PI);
		
		System.out.println("1 + 2 = " + cal.plus(1, 2));
		
		
		// Scanner : 자원을 프로그램 으로 받아오는 역할
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("덧셈을 합니다.\n숫자1을 입력해주세요. ");
		int num1 = scanner.nextInt();
		System.out.println("숫자2를 입력해주세요.");
		int num2 = scanner.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + cal.plus(num1, num2));
		
		System.out.println("------------------------------");
		
		System.out.println("반지름을 입력해주세요.");
		float r = scanner.nextFloat();
		
		System.out.println("입력 받은 반지름의 길이 : " + r);
		System.out.println("원의 둘레 : " + cal.circum(r));
		System.out.println("원의 넓이 : " + cal.cirArea(r));
		
		
		 
		
		
		
		

	}

	// ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.

	// ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main()
	// 메소드
	// 에 추가해봅시다.

}
