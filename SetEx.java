package Demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
//		Set <Integer> s = new HashSet<>();
//		System.out.println(s.add(12));
//		System.out.println(s.add(143));
//		System.out.println(s.add(55));
//		System.out.println(s.add(426));
//		System.out.println(s.add(12));
//		System.out.println(s.add(125));
//		System.out.println(s);
//		
//		for(Integer i : s) {
//			System.out.println(i);
//		}
//		
//		Iterator<Integer> i1 = s.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//
//		s.remove(12);
//		System.out.println(s);
		
		
		
		Set <Trainee> s = new HashSet<>();
		s.add(new Trainee(12));
		s.add(new Trainee(152));
		s.add(new Trainee(125));
		s.add(new Trainee(12));
		
		System.out.println(s);
		
	}

}
