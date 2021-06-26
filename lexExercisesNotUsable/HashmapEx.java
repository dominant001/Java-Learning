package lexExercisesNotUsable;



import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		//Implement your logic here and change the return statement accordingly
    	Map<String , Double> maxMinScore = new HashMap<String, Double>();
		for(Map.Entry<String , Double> kv : studentMarks.entrySet() ){
			int count = 1;
			if(kv.getValue()>100) {
				maxMinScore.put(kv.getKey(),kv.getValue());
				count+=1;
			}
			
//			double max = kv.getValue().MAX_VALUE;
//			double min = kv.getValue().MIN_VALUE;
//			maxMinScore.put(kv.getKey(),max);
//			maxMinScore.put(kv.getKey(),min);
			
		}
		return maxMinScore;
	}

}

class HashmapEx {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}
