/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

/**
 *
 * @author henrymeier
 */
import java.util.Scanner;
//imported scanner class

public class AssignmentOne {
//java class
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //main method
        Scanner henryscan = new Scanner(System.in);  
// Create the Scanner object

      System.out.println("Student ID:");
       int studentid = henryscan.nextInt();
       //query student id
       
       System.out.print("Name:");
       System.out.println();
       String input = henryscan.nextLine();
       
       //query name
       System.out.println("Major:");
       String major = henryscan.nextLine();
       //query major
       
       System.out.println("Academic Year:");
       String academicyear = henryscan.nextLine();
       //query academic year
       System.out.println("Class:");
       String Class = henryscan.nextLine();
       //query class
       System.out.println();
       System.out.println("Sudent ID: " + studentid);
       System.out.println("Name: " + input);
       System.out.println("Major: " + major);
       System.out.println("Academic Year: " + academicyear);
       System.out.println("Class: " + Class);
              
        
    }
    
}
