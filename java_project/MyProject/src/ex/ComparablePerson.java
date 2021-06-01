package ex;

public class ComparablePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showData() {
		System.out.printf("%s, %d \n", this.name, this.age);
	}

	@Override
	public int compareTo(Person o) {
//		if(this.age>o.age) {
//			return 10000; // 양수
//		} else if(this.age<o.age) {
//			return -1; // 음수
//		} else {
//			return 0;
//		}
		
		return this.age-o.age*-1;
	}
	
	
}









