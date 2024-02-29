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
public class BonusAkhir_Tahun {
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    double Gajipokok,MasaKerja,Golongan,Bonus;
    
    System.out.print("Gaji Pokok : Rp");
    Gajipokok=in.nextDouble();
    System.out.print("Golongan :");
    Golongan=in.nextDouble();
    System.out.print("MasaKerja :");
    MasaKerja=in.nextDouble();
    
    if(Golongan==1)
      { if (MasaKerja >=21&& MasaKerja <=30)
        { Bonus =0.7*Gajipokok;
        System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if (MasaKerja >=11)
        { Bonus = 0.6*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if (MasaKerja >=0)
        { Bonus = 0.5*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}}
    
    if(Golongan==2)
        { if (MasaKerja >=21&& MasaKerja <=30)
        { Bonus =0.8*Gajipokok;
        System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if (MasaKerja >=11)
        { Bonus = 0.7*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if (MasaKerja >=0)
        { Bonus = 0.6*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}}
    
    if(Golongan==3)
        { if (MasaKerja >=21&& MasaKerja <=30)
        { Bonus =0.9*Gajipokok;
        System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if (MasaKerja >=11)
        { Bonus = 0.8*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if (MasaKerja >=0)
        { Bonus = 0.7*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}}
    
    if(Golongan==4)
        { if (MasaKerja >=21&& MasaKerja <=30)
        { Bonus = 1*Gajipokok;
        System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if (MasaKerja >=11)
        { Bonus = 0.9*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}
      else if  (MasaKerja >=0)
        { Bonus = 0.8*Gajipokok;
          System.out.println("Bonus Akhir Tahun : Rp"+Bonus);}}
        
     
     
          
           
        
}
}
        
    
    
    

