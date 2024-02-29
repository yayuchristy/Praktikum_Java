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
public class Genap_Ganjil_Array {
  public static void main(String[] args){
   int[]Bil = {23,26,30,32,33,69,50,70,80,55,76,53,21};
   System.out.print("Bilangan Genap : ");
   for(int i=0; i<Bil.length; i++){
     if(Bil[i]%2==0){
      System.out.print(Bil[i]+ " ");}}
   System.out.println("");  
   
   System.out.print("Bilangan Ganjil : ");
   for(int i=0; i<Bil.length; i++){
     if(Bil[i]%2!=0){
      System.out.print(Bil[i]+ " ");}}
   System.out.println("");
         
              
         
  }  
  } 

