import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomPick {

	public static void main(String[] args) {

		String[] names = { 
				"황지원", "김아름", "정소연", "위세라", "김훈", "이재훈", 
				"곽민주", "채호연", "조성덕", "윤병우", "이현우", "김용민", 
				"신은경", "김은비", "도용성", "김승민", "이우리", "박상명", 
				"김명호", "김은선", "정다예", "류한성" };
		
		List<String> members = new ArrayList<>();
		
		for(int i=0; i<names.length; i++) {
			members.add(names[i]);
		}
		
		Collections.shuffle(members);
		
		System.out.println(members);
		
		
		
		

	}

}
 