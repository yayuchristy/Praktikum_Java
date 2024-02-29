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
public class Array {
 public static void main(String[] args) {
  Scanner in= new Scanner (System.in);
  int [] hitung;
  hitung= new int[5];
  System.out.println("Masukan 5 data bulat :");
  
  for (int i=0; i<=4; i++){
    System.out.print("Data ke"+(i+1)+":");
    hitung[i]=in.nextInt(); }
  System.out.println();
  System.out.println("Urutan data dari AKHIR ke AWAL ");
  for(int i=0; i<=4; i++)  
    System.out.println("Data ke "+(i+1)+" adalah " + hitung [4-i]);

  }
     
    }
    

