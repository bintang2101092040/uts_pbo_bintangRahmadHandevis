/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang_19_10_2022;

/**
 *
 * @author lenovo
 */
public class latihan3 {
    
    public static void main(String[] args) {
            String names[] = {"Beah", "Bianca", "Lance", "Belle",
 "Nico", "Yza", "Gem", "Ethan"};
String searchName = "Yza";
boolean foundName = false;
int i=0;

        for (String name : names) {
            if (name.equals(searchName)) {
                foundName = true;
                break;     }
        }
if( foundName ){
 System.out.println( searchName + " found!" );
}
else{
 System.out.println( searchName + " not found." );
} 
    }
}
