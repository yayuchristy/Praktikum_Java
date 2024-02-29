/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan_if;

/**
 *
 * @author DELTACOM
 */
import java.util.Scanner;
public class Pajak_Pegawai {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double GajiPokok,Tunjangan,UphLmbur,jamLmbur,pajak1,pajak2,totalGaji,GajiBersih;
    
    System.out.print("Gaji Pokok Pegawai : Rp");
    GajiPokok=in.nextDouble();
    System.out.print("Jumlah Jam Lembur :");
    jamLmbur=in.nextDouble();
    Tunjangan= 0.15*GajiPokok;
    System.out.println("Tunjangan : Rp"+ Tunjangan);
    UphLmbur= jamLmbur*(0.03*GajiPokok);
    System.out.println("Upah Lembur : Rp"+UphLmbur);
    totalGaji= GajiPokok+Tunjangan+UphLmbur;
    System.out.println("Gaji sebelum pajak : Rp"+totalGaji);
    pajak1 = 0.1*totalGaji;
    pajak2= 0.05*totalGaji;
    
    if (totalGaji >1500000)
       { GajiBersih = totalGaji-pajak1; 
        System.out.println("pajak: Rp"+pajak1);
        System.out.println("Total Gaji yang diterima : Rp"+GajiBersih);}
    else  if (totalGaji >=500000&& totalGaji<=1500000)
       {GajiBersih = totalGaji-pajak2;
        System.out.println("pajak : Rp"+pajak2);
        System.out.println("Total Gaji yang diterima : Rp"+GajiBersih);}
    else 
      {System.out.println("Tidak dikenai pajak");
      System.out.println("Total Gaji yang diterima : Rp"+ totalGaji);}
      }
                
                
       }
    
    

