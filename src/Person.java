/**
 * Voters details
 * @author Aynaz Meymanat
 * @author aynazmeymanat@aut.ac.ir
 * @version 1.0.4
 * @since 2024/04/14
 */

public class Person {
    //fields
    private String firstname;
    private String lastname ;

    /**
     * constructor for class Person
     */
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    /**
     * Gets the firstname
     *
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Gets the lastname
     *
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @return person details as one string
     */
    public String toString(){
        return firstname + " " + lastname ;
    }
}
