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
public class Array_NBuah {
 public static void main (String[] args){
  Scanner in = new Scanner(System.in); 
  int jumlah;
  double  Nilai_max, Nilai_min,total=0,Rerata, hitung[];
  System.out.print("Masukan Banyaknya Data : ");
  jumlah = in.nextInt();
  hitung = new double [jumlah]; 
  System.out.println("Masukan "+jumlah+" angka");
   for(int i=0; i<jumlah; i++){
       System.out.print("Data ke"+(i+1)+":");
       hitung[i] = in.nextDouble();}
   System.out.println();
   System.out.println("Urutan data dari AKHIR ke AWAL ");
   for(int i=0; i<jumlah; i++){
       System.out.println("Data ke "+(i+1)+" adalah "+hitung[jumlah-(i+1)]);
   total = total+hitung[i];}
   System.out.println();
   
   Rerata = total/jumlah;
   System.out.println("Nilai Rata-rata Data Tersebut adalah : "+Rerata);
   
   Nilai_max = hitung[0];
    for(int i=0; i<jumlah; i++){
       if (hitung[i]>Nilai_max){
           Nilai_max = hitung[i];  }
    }   
  System.out.println("Nilai Maksimumnya adalah : "+ Nilai_max);
  
  Nilai_min = hitung[0];
    for(int i=0; i<jumlah; i++){
      if(hitung[i]<Nilai_min){
         Nilai_min = hitung[i];}
      }
  System.out.println("Nilai Minimumnya adalah : "+ Nilai_min);  
  
  
  
           
  
  }  
    
}
