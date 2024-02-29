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
public class Gabung_Array {
 public static void main(String[] args){
   int[] semester1 = {20,40,50,60,70};
   int[] semester2 = {25,45,55,65,75};
   int[] semester = new int[semester1.length + semester2.length];
   int i;
   
   for(i=0; i<semester1.length; i++){
    semester[i] = semester1[i];}
   for(int j=0; j<semester2.length;j++){
    semester[i++]=semester2[j];   }
   
   System.out.println("Nilai Semester :");
   for(i=0; i<semester.length;i++)
       System.out.print(semester[i]+" ");
   System.out.println("");
   
   
     
 
   
 }   
    
}
