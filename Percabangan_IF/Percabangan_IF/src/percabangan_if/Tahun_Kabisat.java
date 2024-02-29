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
public class Tahun_Kabisat {
  public static void main (String[] args){
    Scanner in = new Scanner (System.in);
    double tahun;
    System.out.print("Tahun :");
    tahun=in.nextDouble();
     
    if (tahun%4==0||!(tahun%100==0)&& tahun%4==0)
       {System.out.println("Merupakan Tahun Kabisat");}
    else
       {System.out.println("Bukan Tahun Kabisat");}
       
       }   
        
    }
    

