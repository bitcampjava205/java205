package ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FootballPlayer implements Comparable<FootballPlayer> {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// 팀과 이름 그리고 나이가 같으면 같은 선수라 판단
		boolean chk = false;

		if (obj != null && obj instanceof FootballPlayer) {
			FootballPlayer player = (FootballPlayer) obj;
			if (this.team.equals(player.team) && this.name.equals(player.name) && this.age == player.age) {
				chk = true;
			}
		}

		return chk;
	}

	@Override
	public int hashCode() {
		return age % 10;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		// 팀 이름순으로 정렬하고,
		// 같은 팀의 선수들은 이름 순으로 정렬하고,
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		int result = this.team.compareTo(o.getTeam());  // 음수 / 양수 / 0
		if(result == 0) {
			result = this.name.compareTo(o.getName());
			if(result == 0) {
				result = this.number-o.getNumber();
			}
		}
		
		return result;
	}

	public static void main(String[] args) {

		// 1.축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서
		// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		// List<FootballPlayer> players = new ArrayList<>();

		// 2.축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고
		// 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		//Set<FootballPlayer> players = new HashSet<FootballPlayer>();

		// 3. TreeSet<E>을 이용해서
		// 팀 이름순으로 정렬하고,
		// 같은 팀의 선수들은 이름 순으로 정렬하고,
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		TreeSet<FootballPlayer> players = new TreeSet<>();

		// 데이터 저장
		players.add(new FootballPlayer("Son1", 7, "Tot", 27));
		players.add(new FootballPlayer("Park1", 7, "Man", 37));
		players.add(new FootballPlayer("Son1", 9, "Tot", 27));
		players.add(new FootballPlayer("Son2", 20, "Tot", 17));
		players.add(new FootballPlayer("Park2", 20, "Man", 31));
		players.add(new FootballPlayer("Park2", 21, "Man", 31));

		System.out.println("요소의 개수 : " + players.size());

		// 정렬
		Iterator<FootballPlayer> itr = players.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 4.축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 
		//   Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.
		HashMap<Integer, FootballPlayer> players2 = new HashMap<>();
		
		players2.put(7, new FootballPlayer("Son", 7, "Tot", 27));
		players2.put(10, new FootballPlayer("Kane", 10, "Tot", 26));
		players2.put(20, new FootballPlayer("Kane2", 20, "Tot", 16));
		
		System.out.println("-------------------");
		
		Set<Integer> set  = players2.keySet();
		
		Iterator<Integer> itr2 = set.iterator();
		while(itr2.hasNext()) {
			System.out.println(players2.get(itr2.next()));
		}
		
		
		
		

	}

}
