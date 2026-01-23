package VotingSystem;

public class VotingApp {

	public static void main(String[] args) {
		VotingOperations votingSystem = new VotingOperations();

        votingSystem.castVote("Ankit");
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Harsh");
        votingSystem.castVote("Krishna");
        votingSystem.castVote("Harsh");
        votingSystem.castVote("Harsh");

        votingSystem.displayVote();
        votingSystem.displayVoteOrder();
        votingSystem.displaySortedResults();

	}

}
