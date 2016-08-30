/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1608.sokolov.basicconstructions;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Aile
 */
public class ODArray {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            int r0 = r.nextInt(100);
            arr[i] = r0;
            }
        System.out.println(Arrays.toString(arr));
        invert(arr);
        System.out.println(Arrays.toString(arr));
        
    }    
    
    
    public static void invert(int[] arr) {
        for (int k = 0; k < arr.length/2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k -1];
            arr[arr.length - k -1] = tmp;
           
        }
    }
    
    
    public static void even(int[] arr) {
        for (int i = 0; i < 15; i++) {
            int k;
            k = arr[i];
            if(k%2 ==0 ){
            
            }
        }
    }
    




    public static void uneven() {
        
    }
    
    
    
    
    
    
    
}
