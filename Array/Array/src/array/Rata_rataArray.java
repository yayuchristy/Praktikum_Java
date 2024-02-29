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
public class Rata_rataArray {
 public static void main (String[] args){
  Scanner in = new Scanner(System.in);  
  int i;
  double Rerata,nilai_max, nilai_min; 
  double[] hitung;  
  hitung = new double [5];
  System.out.println("Masukan 5 data bulat :");
  
    for ( i=0; i<=4; i++){
        System.out.print("Data ke"+(i+1)+":");
         hitung[i]=in.nextInt(); }
  System.out.println();
     for(i=0; i<=4; i++)
        System.out.println("Data ke "+(i+1)+" adalah " + hitung [4-i]);
  
  Rerata = (hitung[0] + hitung[1] + hitung[2] + hitung [3] + hitung [4]) /5;
  System.out.println("Nilai Rata-rata dari Kelima data tersebut adalah : " + Rerata+"\n");
  
  nilai_max = hitung[0];
    for(i=0; i<5; i++){
       if (hitung[i]>nilai_max){
           nilai_max = hitung[i];  }
    }   
  System.out.println("Nilai Maksimumnya adalah : "+ nilai_max);
  
  nilai_min = hitung[0];
    for(i=0; i<5; i++){
      if(hitung[i]<nilai_min){
         nilai_min = hitung[i];}
      }
  System.out.println("Nilai Minimumnya adalah : "+ nilai_min);  
    
  
  
  
          
 } 
}
