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
public class Duplikasi_Array {
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int i,j;
    int [] hitung;
    hitung = new int[5];
    System.out.println("Masukan 5 data bulat : ");
    for ( i=0; i<=4; i++){
     System.out.print("Data ke"+(i+1)+":");
     hitung[i]=in.nextInt(); }
    
   System.out.print("duplikasi :");   
    for(  i=0;i <hitung.length;i++){   
      for(j=i+1;j<=4;j++){  
        if (hitung[i]==hitung[j]){
       System.out.print(hitung[i]);}
      }
      System.out.print(" ");
 } 
 System.out.println("");   
 }
}



