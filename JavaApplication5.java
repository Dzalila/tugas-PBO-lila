/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;
/**
 *
 * @author DZALILA MUSTAFA
 */
public class JavaApplication5 {
    public static void main(String[] args) {
        // membuat program untuk mngecek bilangan genap dan ganjil
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Sebuah Angka : ");
          int angka = input.nextInt();
          
          //Ganjil -> jika angka % 2 = 1
          //Genap  -> jika angka % 2 = 0
          if(angka % 2 == 0){
              System.out.println("Angka " + angka + "Adalah Bilangan Genap");
          }else{
              System.out.println("Angka " + angka + "Adalah Bilangan Ganjil");
          }
    }
    
}
