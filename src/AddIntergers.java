/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eapar007
 */
import java.io.*;
import java.util.Scanner;
public class AddIntergers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream numbers = null;
        try {
            numbers = new FileInputStream("numbers.txt");
  
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
            System.exit(0);
        }
        Scanner scan = new Scanner(numbers);
        int sum = 0;
        while(scan.hasNextInt()){
            sum += scan.nextInt();
        }
        PrintWriter write = null;
        try{
            write = new PrintWriter(new FileOutputStream("numbers.txt",true));
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
            System.exit(0);
        }
        write.println("\n the sum is : " + sum);
        
        // TODO code application logic here
    }
    
}
