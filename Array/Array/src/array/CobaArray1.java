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
public class CobaArray1 {
  public static void main (String[] args){
    int i;
    int[] hitung, H;
    hitung = new int [5];
    
    Scanner Keyboard = new Scanner (System.in);
    System.out.println("Masukan 5 nomor : ");
    for(i=0; i<=4; i++)
     hitung[i] = Keyboard.nextInt();
    
    H = hitung;
    
    System.out.println();
    System.out.println("Isi Arary Hitung dari AKHIR ke AWAL : ");
    for (i=0; i<=4; i++)
     System.out.println(hitung [4-i]);
    System.out.println();
    
    System.out.println("Isi Array H dari AKHIR ke AWAL : ");
    for(i=0; i<=4; i++)
      System.out.println(H[4-i]);
        
  }  
    
}
