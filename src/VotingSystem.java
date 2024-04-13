/**
 * Managing voting and results
 * @author Mohammad Yarahmadi
 * @author yarahmadi0077@aut.ac.ir
 * @version 1.0.1
 * @since 2024/04/13
 */

public class VotingSystem {

    private ArrayList<Voting> votingList ;

    /**
     * constructor for class VotingSystem
     */
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    /**
     * Gets the VotingList
     *
     * @return votingList
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    /**
     * Gets the Voting
     * use Voting.java
     *
     * @param index
     * @return votingList
     */
    public Voting getVoting(int index) {
        return votingList.get(index);
    }
}
