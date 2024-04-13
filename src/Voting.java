/**
 * Voting and displaying the result
 * @author Mohammad Yarahmadi
 * @author yarahmadi0077@aut.ac.ir
 * @version 1.0.1
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
}
