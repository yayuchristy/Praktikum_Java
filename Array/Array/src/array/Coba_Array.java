/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author DELTACOM
 */
import java.util.Scanner;
public class Coba_Array {
 public static void main (String[] args){
   int i;
   int[] hitung;
   hitung = new int[5];
   Scanner Keyboard = new Scanner (System.in);
   System.out.println("Masukan 5 angka bulat :");
   
   for (i=0; i<=4; i++)
    hitung[i]=Keyboard.nextInt();
   System.out.println();
   System.out.println("Nilai yang dimasukan dari AKHIR ke AWAL : ");
   for (i=0; i<=4; i++)
    System.out.println(hitung[4-i]);   
       
 
 }   
    
}
