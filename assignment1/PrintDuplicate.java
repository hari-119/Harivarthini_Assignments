package week1.assignment1;

	import java.util.HashMap;
	import java.util.Map;

	public class PrintDuplicate 
	{
	    private int[] num = {2, 5, 7, 7, 5, 9, 2, 3};

	    public void findAndPrintDuplicates() {
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        
	        for (int i : num) {
	            if (frequencyMap.containsKey(i)) {
	                frequencyMap.put(i, frequencyMap.get(i) + 1);
	            } else {
	                frequencyMap.put(i, 1);
	            }
	        }
	        System.out.println("Duplicate values:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
	}

