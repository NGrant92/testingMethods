/**
 * Created by User on 08/04/2017.
 */
import java.lang.Math;
public class roundingInts {

    public static void main(String[] args)
    {
        //calls the board.BoardDisplay method when class is run
        new roundingInts();
    }

    public roundingInts() {
        int num = 25;
        int testio = num / 2;

        /*
        testing the possible ways to round up an integer
         */
        if (num % 2 != 0) {
            //the below method adds 1 to an integer as it is rounded down if X.5
            System.out.println(testio + 1);

            //the following prints the result as a double which makes it unusable if integers are required elsewhere
            System.out.println(Math.ceil(testio));

            //this goldielocks makes rounds it and keeps it as an integer
            //fig/2.0 rounds up and fig/2 rounds down
            int result = (int) Math.ceil(num / 2.0);
            System.out.println(result);

        }
        else {
            System.out.println(testio);
        }
    }
}
