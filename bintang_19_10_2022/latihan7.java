/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang_19_10_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lenovo
 */
public class latihan7 {
    public static void main( String[] args ) throws IOException
 {
     BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
 int grade = 0;
 
 System.out.print("grade:");
 grade = Integer.parseInt(dataIn.readLine());
    
    switch(grade){
        case 1:
            System.out.println( " " +grade );
            break;
        case 2:
            System.out.println(" " + grade );
            break;
        case 3:
            System.out.println(" " + grade  );
            break;
        case 4:
            System.out.println(" " + grade  );
            break;
        case 5:
            System.out.println(" " + grade  );
            break;
        case 6:
            System.out.println(" " + grade  );
            break;
        case 7:
            System.out.println(" " + grade  );
            break;
        case 8:
            System.out.println(" " + grade  );
            break;
        case 9:
            System.out.println(" " + grade  );
            break;
        case 10:
            System.out.println(" " + grade  );
            break;
        default:
            System.out.println("invalid number.");
    }
 } 
}
