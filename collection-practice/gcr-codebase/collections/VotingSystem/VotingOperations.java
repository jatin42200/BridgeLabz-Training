package VotingSystem;

import java.util.*;

public class VotingOperations {
	
	HashMap<String,Integer> voteMap = new HashMap<>();
	LinkedHashMap<String,Integer> voteOrder = new LinkedHashMap<>();
	
	public void castVote(String name) {
		voteMap.put(name, voteMap.getOrDefault(name, 0)+1);
		voteOrder.put(name, voteOrder.getOrDefault(name, 0)+1);
	}
	
	//unordered vote display
	public void displayVote() {
		for(Map.Entry<String, Integer> vote : voteMap.entrySet()) {
			System.out.println(vote.getKey() + " -> " + vote.getValue());
			
		}
	}
	
	public void displayVoteOrder() {
		for(Map.Entry<String, Integer> vote : voteOrder.entrySet()) {
			System.out.println(vote.getKey() + " -> " + vote.getValue());
			
		}
	}
	
	// Display sorted results (TreeMap)
    public void displaySortedResults() {
        System.out.println("\nSorted Results (TreeMap):");
        TreeMap<String,Integer> sortedMap = new TreeMap<>();
        
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
        	sortedMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String,Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
