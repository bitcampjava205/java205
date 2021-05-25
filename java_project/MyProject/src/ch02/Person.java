package ch02;

public class Person {
	
	// 클래스의 구성 -> 인스턴스 변수, 메소드
	
	
	// ① 회원이름을 저장하는 변수
	String name; // 초기화를 생략 가능
	
	// ② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
	String memberPhonNum = "000-0000-0000";
	
	// ③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
	String perNum1 = "700000-0000000";
	long perNum2 = 7000000000000L;
	
	// 인스턴스 변수들의 데이터를 출력하는 메소드
	void showData() { 
		System.out.println("회원 이름 : " + this.name);
		System.out.println("회원의 주민번호1 : " + perNum1 );
		System.out.println("회원의 주민번호2 : " + perNum2 );
	}
	
	public static void main(String[] args) {
		
		// Person 인스턴스 생성
		Person person = new Person();
		
		System.out.println("이름 : " + person.name );
		person.name = "손흥민";
		person.showData();
		
	}
	
	
	

}







