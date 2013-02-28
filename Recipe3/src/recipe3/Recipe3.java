package recipe3;

import java.io.*;

/**
 *
 * @author jakewebbee
 * @author jenkinsmaneuver
 * @author John
 */
public class Recipe3 {
    public static void main(String[] args) {
        try{
            String fileName = "/debug.txt";
            FileWriter output = new FileWriter(getClass().getResource(fileName));
            BufferedWriter debugOut = new BufferedWriter(output);
            System.out.println("Hi...");
            debugOut.write("Hello World");
            debugOut.close();
            System.out.println("Hi!");
        }catch(IOException e){
            e.printStackTrace();
        }
        
        //Create GUI here 
    }
}
