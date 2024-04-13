/**
 * Voting and displaying the result
 * @author Mohammad Yarahmadi
 * @author yarahmadi0077@aut.ac.ir
 * @version 1.0.2
 * @since 2024/04/13
 */

public class Voting {
    private int type;
    private String question;
    private HashMap<String,HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    /**
     * constructor for class Voting
     */
    public Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
        this.choices = new HashMap<String, HashSet<Vote>>();
        this.voters = new ArrayList<Person>();
    }

    /**
     * Gets the question
     *
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the question.
     *
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Gets the Choices
     * save and add a new choice in an ArrayList
     *
     * @param options.
     *
     * @return ArrayList
     */
    public ArrayList<String> getChoices(){
        ArrayList<String> options = new ArrayList<String>();
        for (String s : choices.keySet()) {
            options.add(s);
        }
        return options;
    }

    /**
     * This is a method which makes Choices.
     *
     * @param chioce.
     * @param options.
     *
     */
    public void createChoice(String choice) {
        HashSet<Vote> options = new HashSet<Vote>();
        choices.put(choice, options);
    }

    /**
     * This is a method which it checks how many candidates the voter can vote.
     * use Vote.java
     *
     * @param voter
     * @param voter_choices
     * @param type
     * @param newVote
     * @param options.
     *
     */
    public void vote(Person voter, ArrayList<String> voter_choices){
        if (type == 1 && voter_choices.size() > 1)
            System.out.printf("you can just vote to one option!\n" +
                    "------------------------------------------\n");
        else {
            for (String s: voter_choices) {
                Vote newVote = new Vote(voter, "1402/12/21");
                choices.get(s).add(newVote);
            }
        }
    }
    /**
     * This is a method which it votes to candditate in random mode.
     *
     * @param person
     * @param rand
     * @param randChoices
     * @param newVote
     *
     */
    public void vote(Person person){
        Random rand = new Random() ;
        ArrayList<String> choices = getChoices();
        int randChoice = rand.nextInt(choices.size());
        Vote newVote = new Vote(person, "1402/12/21");
        this.choices.get(randChoice).add(newVote);
    }

    /**
     * This is a method which it prints only results.
     *
     * @param nothing
     *
     */
    public void printResults(){
        for (String i: choices.keySet()) {
            System.out.println(i + ": " + choices.get(i).size());
        }
    }

    /**
     * This is a method which it prints who each person voted.
     * if voting isAnonymous prevents to print anything.
     * use Person.java
     *
     * @param nothing
     *
     */
    public void printVoters() {
        if (!isAnonymous) {
            for (String choice : choices.keySet()) {
                System.out.println(choice + ": ");
                for (Vote vote : choices.get(choice)) {
                    Person voter = vote.getVoter();
                    System.out.println(voter.getFirstname() + " " + voter.getLastname());
                }
            }
        } else {
            System.out.println("This voting is Anonymous!");
        }
    }
}
