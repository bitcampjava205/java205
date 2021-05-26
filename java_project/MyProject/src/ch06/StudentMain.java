package ch06;

public class StudentMain {

	public static void main(String[] args) {
		// 3.main()메소드에 아래 내용을 정의해봅시다.
		// ①Student 타입의 배열을 선언하고, 
		//  요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] students = new Student[10];
		
		
		// ②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		students[0] = new Student("홍길동1", 100, 10, 100);
		students[1] = new Student("홍길동2", 80, 20, 90);
		students[2] = new Student("홍길동3", 70, 30, 80);
		students[3] = new Student("홍길동4", 30, 40, 70);
		students[4] = new Student("홍길동5", 80, 50, 60);
		students[5] = new Student("홍길동6", 90, 60, 50);
		students[6] = new Student("홍길동7", 60, 70, 40);
		students[7] = new Student("홍길동8", 70, 80, 30);
		students[8] = new Student("홍길동9", 30, 90, 20);
		students[9] = new Student("홍길동10", 60, 100, 10);
		
		
		// ③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		System.out.println("이름 \t\t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println("=========================================================");
		for(int i=0; i<students.length; i++) {
			System.out.print(students[i].getName());
			System.out.print("\t\t");
			System.out.print(students[i].getKor());
			System.out.print("\t");
			System.out.print(students[i].getEng());
			System.out.print("\t");
			System.out.print(students[i].getMath());
			System.out.print("\t");
			System.out.print(students[i].getSum());
			System.out.print("\t");
			System.out.println(students[i].getAvg());
			
		}
		

	}

}
