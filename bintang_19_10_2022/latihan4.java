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
public class latihan4 {
    public static void main(String[] args) {
        String names[] = {"Beah", "Bianca", "Lance", "Beah"};
int count = 0;

        for (String name : names) {
            if (!name.equals("Beah")) {
                continue; //skip next statement
            }
            count++;
        }
System.out.println("There are " + count + " Beahs in the list"); 
    }
}
