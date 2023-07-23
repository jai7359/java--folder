// patterns to solve about the logic 
import java.util.*;
public class folder6 {
    public static void main(String[] args) {
        //   *
        //   **
        //   ***
        //   ****
        //   *****
        // int line;
        // for( line =1; line<= 4; line ++){
        //     for (int star =1; star<= line ;star++){
        //         System.out.print("1");

        //     }
        //     System.out.println();
        // }
 

        // inverted star pattern
        // int line;
        // for( line =1; line<= 4; line ++){
        //     for (int star =1; star<= 4-line+1 ;star++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        // print half - pyramid pattern 
                int line;
        for( line =1; line<= 4; line ++){
            for (int star =1; star<= 4-line+1 ;star++){
                System.out.print("*");

            }
            System.out.println();
        }
 
    }
    
}
 