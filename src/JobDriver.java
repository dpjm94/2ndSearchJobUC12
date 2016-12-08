import javax.swing.*;
import java.util.HashMap;

/**
 * Created by donalmaher on 07/12/2016.
 */
public class JobDriver {

    public static final String[] employType = {"CONTRACT","JOBSHARE","PARTTIME","PERMANENT","SEASONAL","TEMPORARY"};
    public static void main(String args[]){

        JFrame frame = new JFrame("Input Dialog Example ");

        String Jobb = (String) JOptionPane.showInputDialog(frame,
                "What employee type do you want?",
                "Employee Type",
                JOptionPane.QUESTION_MESSAGE,
                null,
                employType,
                employType[0]);

        System.out.printf("Employee Type is %s.\n", Jobb);
        System.exit(0);


    }
}
