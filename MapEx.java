package demo;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student11 {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		//Implement your logic here and change the return statement accordingly
    	Map<String, Double> maxMin = new HashMap<String, Double>();
    	double maxVal= Collections.max(studentMarks.values());
    	double minVal = Collections.min(studentMarks.values());
    	
    	for(Entry<String,Double> entry1 : studentMarks.entrySet()) {
        		if(entry1.getValue() == maxVal) {
        			maxMin.put(entry1.getKey(), entry1.getValue());
        		}
    	}
        for(Entry<String,Double> entry2 : studentMarks.entrySet()) {
        	if(entry2.getValue() == minVal) {
    			maxMin.put(entry2.getKey(), entry2.getValue());
        	}
        }
		return maxMin;
    }

}

class MapEx {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student11.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}