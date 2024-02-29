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
public class GFG {
 public static void main (String[] args){
   int [] arr;
   arr = new int[5];
   arr[0] = 10;
   arr[1] = 20;
   arr[3] = 30;
   arr[4] = 40;
   
   for(int i=0; i<arr.length; i++)
    System.out.println("Elemen at index "+i+" :"+ arr[i]);   
 }   
    
}
