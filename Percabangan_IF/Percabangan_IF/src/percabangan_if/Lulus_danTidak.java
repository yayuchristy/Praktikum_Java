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
public class Lulus_danTidak {
 public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    double nilai1, nilai2, nilai3, nilai4, nilaiRerata;
    
    System.out.print("Nilai ujian pertama :");
    nilai1=in.nextDouble();
    System.out.print("Nilai ujian kedua :");
    nilai2=in.nextDouble();
    System.out.print("Nilai ujian ketiga :");
    nilai3=in.nextDouble();
    System.out.print("Nilai ujian keempat :");
    nilai4=in.nextDouble();
    nilaiRerata= (nilai1+nilai2+nilai3+nilai4)/2;
    
    if (nilaiRerata <=60)
      {System.out.println("TIDAK LULUS");}
    else
      {System.out.println("LULUS");}
 }  
}
