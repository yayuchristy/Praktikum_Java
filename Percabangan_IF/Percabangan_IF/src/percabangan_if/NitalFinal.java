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
public class NitalFinal {
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    double uts1,uts2,uas,nilaiTotal;
    
    System.out.print ("Nilai UTS 1 :");
    uts1=in.nextDouble();
    System.out.print("Nilai UTS 2 :");
    uts2=in.nextDouble();
    System.out.print("Nilai UAS :");
    uas=in.nextDouble();
    nilaiTotal= (0.3*uts1)+(0.3*uts2)+(0.4*uas);
    
    if (nilaiTotal>=80)
       {System.out.println("Nilai Final : A");}
    else if (nilaiTotal>=65)
       {System.out.println("Nilai Final : B");}  
    else if (nilaiTotal>=55)
       {System.out.println("Nilai Final : C");}
    else if (nilaiTotal>=50)
       {System.out.println("Nilai Final : D");}
    else
       {System.out.println("Nilai Final : E");
       
       }
    
  }  
    
}
