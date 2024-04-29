import java.util.Objects;
/**
 * Voters details
 * @author Aynaz Meymanat
 * @author aynazmeymanat@aut.ac.ir
 * @version 1.0.1
 * @since 2024/04/14
 */
class Vote {
    //fields
    private final Person voter ;
    private final String date  ;

    /**
     * constructor for class Vote
     */
    public Vote(Person voter, String date) {
        this.voter = voter;
        this.date = date;
    }

    /**
     * Gets the voter
     *
     * @return voter
     */
    public Person getVoter() {
        return voter;
    }

    /**
     * Gets the Date
     *
     * @return Date
     */

}
