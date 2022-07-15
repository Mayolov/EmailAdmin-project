/**
 * Mayolo Valencia
 * 
 * EmailApp
 * 
 * A users name is input to the Email object params
 * User is asked to input their department and a
 * email & password is generated for them and displayed
 */
public class EmailApp {
    public static void main(String[] args) {

        Email em1 = new Email("Jon", "Smith");
        System.out.println(em1.showInfo());
    }

}