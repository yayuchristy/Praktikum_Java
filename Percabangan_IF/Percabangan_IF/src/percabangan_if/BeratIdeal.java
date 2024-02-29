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
public class BeratIdeal {
  public static void main (String[] args){
    Scanner in= new Scanner(System.in);
    double tnggBadan, beratBdan, x;
    
    System.out.print("Tinggi Badan Anda :");
    tnggBadan= in.nextDouble();
    System.out.print("Berat Badan Anda :");
    beratBdan= in.nextDouble();
    x = tnggBadan-beratBdan;
    
    
    if (x>=90&&x<=110)
      {System.out.println("Anda Ideal");}
    if(x<90)
      {System.out.println("Anda Terlalu Kurus");}
    if(x>110)
      {System.out.println("Anda Terlalu Gemuk");}  
    
  }  
    
}
