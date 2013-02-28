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
            File debugFile = new File("debug.txt");
            FileWriter output = new FileWriter(debugFile);
            PrintWriter debugOut = new PrintWriter(output);
            debugOut.println("Hello World");
            debugOut.close();
            System.out.println("Hi!");
        }catch(IOException e){
            e.printStackTrace();
        }
        
        //Create GUI here 
        
    }
}
