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
public class test {
    public static void main(String[] args) {
            int[][] numbers = {{1, 2, 3},
 {4, 5, 6},
 {7, 8, 9}};

int searchNum = 5;
boolean foundNum = false;

searchLabel:
for( int i=0; i<numbers.length; i++ ){
 for( int j=0; j<numbers[i].length; j++ ){
 if( searchNum == numbers[i][j] ){
 foundNum = true;
 break searchLabel;
 }
 }
}

if( foundNum ){
 System.out.println( searchNum + " found!" );
}
else{
 System.out.println( searchNum + " not found!" );
} 
    }
}
