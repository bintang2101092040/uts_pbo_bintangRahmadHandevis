/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang_02_11_2022;

/**
 *
 * @author lenovo
 */
public class latihan2 {
    public static void main(String[] args) {
        latihan1 student1 = new latihan1();
        student1.setName("bintang");
        student1.setAddress("padang");
        student1.setAge(22);
        student1.setMathGrade(80);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(90);
        
        System.out.println("Nama          :"+student1.getName());
        System.out.println("Alamat        :"+student1.getAddress());
        System.out.println("Umur          :"+student1.getAge());
        System.out.println("Matematika    :"+student1.getMathGrade());
        System.out.println("B.Inggris     :"+student1.getEnglishGrade());
        System.out.println("Pengetahuan   :"+student1.getScienceGrade());
        System.out.println("Rata-rata    :"+student1.getAverage());
        
         latihan1 student2 = new latihan1();
        student2.setName("ani");
        student2.setAddress("bukittinggi");
        student2.setAge(18);
        student2.setMathGrade(100);
        student2.setEnglishGrade(90);
        student2.setScienceGrade(100);
        
        student2.print("");
        student2.print(student2.getEnglishGrade(),student2.getMathGrade(),student2.getScienceGrade());
    }
}
