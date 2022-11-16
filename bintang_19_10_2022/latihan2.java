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
public class latihan2 {
    public static void main( String[] args ) throws IOException
 {
     BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
 int grade = 0;
 
 System.out.print("grade:");
 grade = Integer.parseInt(dataIn.readLine());
    
    switch(grade){
        case 100:
            System.out.println( "Excellent!" );
            break;
        case 90:
            System.out.println("Good job!" );
            break;
        case 80:
            System.out.println("Study harder!" );
            break;
        default:
            System.out.println("Sorry, you failed.");
    }
 } 
}
