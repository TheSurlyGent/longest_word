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
import java.util.logging.Level;
import java.util.logging.Logger;
public class LongestWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream file = null;
        System.out.println("Enter File Name to read : ");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();
        try {
            file = new FileInputStream(fileName);
            // TODO code application logic here
        } catch (FileNotFoundException ex) {
           System.out.println("File does not exist!");
           System.exit(0);
        }
        Scanner fileScan = new Scanner(file);
        String current = " ";
        String longest = " ";
        while(fileScan.hasNext()){
            current =  fileScan.next();
            if(current.length() > longest.length())
                longest = current;
        }
        System.out.println("The longest word in " + fileName + " is: " + longest);
    }
    
}
