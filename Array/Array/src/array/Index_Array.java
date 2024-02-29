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
public class Index_Array {
  public static void main (String[] args){
    Scanner in = new Scanner(System.in); 
    int angka;
    int[]array = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
    System.out.print("Masukan Nilai Array : ");
    angka= in.nextInt();
   for(int i=0; i<array.length;i++){
    if(angka==array[i])
    System.out.println("Berada di Index  :"+i);
    
    
   }  
 }   
  }   
    

