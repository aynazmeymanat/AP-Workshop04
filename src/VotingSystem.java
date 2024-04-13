/**
 * Managing voting and results
 * @author Mohammad Yarahmadi
 * @author yarahmadi0077@aut.ac.ir
 * @version 1.0.2
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
    /**
     * This is a method makes a new voting.
     * use Voteing.java
     *
     * @param question
     * @param isAnonymous
     * @param type
     * @param choices
     * @param newVoting.
     *
     */
    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices){
        Voting newVoting = new Voting(type, question, isAnonymous);

        for (String i: choices) {
            newVoting.createChoice(i);
        }

        votingList.add(newVoting);
    }
    /**
     * This is a method prints results.
     *
     * @param index
     * @param tmp
     *
     */
    public void printResults(int index){
        int tmp = votingList.size() ;
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }
        else {
            System.out.println("Voting (" + index + ")");
            votingList.get(index).printResults();
        }
    }
    /**
     * This is a method prints voter list.
     *
     * @param index
     * @param tmp
     *
     */
    public void printVoters(int index) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }
        System.out.println("voters " + index);
        votingList.get(index).printVoters();
    }
    /**
     * This is a method prints final results.
     * use
     * @param index
     * @param tmp
     * @param choices
     *
     */
    public void printVoting(int index) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }

        System.out.println(votingList.get(index).getQuestion());
        System.out.println("--------------------------------------------");
        ArrayList<String> choices = votingList.get(index).getChoices();

        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i + ": " + choices.get(i));
        }
    }

    /**
     * This is a method for the mode where the vote is not anonymous
     * and the input parameter of this method it includes the voter and his chosen options.
     *
     * use Person.java
     *
     * @param index
     * @param voter
     * @param choices
     * @param tmp
     *
     */
    public void vote(int index, Person voter, ArrayList<String> choices) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }

        votingList.get(index).vote(voter, choices);
    }
    /**
     * overloaded pervious method for anonymous communication mode
     * and a random option should be generated and selected:
     *
     * use Person.java
     *
     * @param index
     * @param person
     * @param tmp
     *
     */
    public void vote(int index, Person person) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }

        votingList.get(index).vote(person);
    }
}
