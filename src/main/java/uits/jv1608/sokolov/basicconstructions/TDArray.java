package uits.jv1608.sokolov.basicconstructions;

import java.util.Random;

public class TDArray {
    public static void main(String[] args) {
        int[][] arr = new int[7][9];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int r0 = r.nextInt(100);
                arr[i][j] = r0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.print("четные элементы четных строк ");
        even(arr);
        System.out.println("");
        
        System.out.print("нечетные элементы нечетных строк ");
        uneven(arr);
        System.out.println("");
        
        System.out.print("сумма элементов кратных 7 в четных строках ");
        summMultiply7(arr);
        System.out.println("");
        
        System.out.print("произведение элементов кратных 3 в нечетных строках ");
        productMultiply3(arr);
        System.out.println("");
        
    }
    
    
    public static void even (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] % 2 == 0){
                  System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
    }
    public static void uneven (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j % 2 != 0 ){
                if(arr[i][j] % 2 != 0){
                  System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
    }
    
    private static void summMultiply7 (int[][] arr) {
        int mult = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i][j] % 7 == 0){
                        mult = arr[i][j] + mult;
                        System.out.print(mult);
                    }
                }
            }
        }
    }
        
        
    private static void productMultiply3 (int[][] arr) {
        int mult3 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0){
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i][j] % 3 == 0){
//                        System.out.print (arr[i][j]);
//                        System.out.println("");
//                        mult3 = arr[i][j] * mult3;
//                        System.out.println(mult3);
                    }
                }
            }
        }
    }
    
    
 }