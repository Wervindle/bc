package uits.jv1608.sokolov.basicconstructions;


import java.util.Arrays;
import java.util.Random;



public class ODArray {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r0 = r.nextInt(100);
            arr[i] = r0;
        }
        System.out.print("вывод элементов массива в прямом порядке: ");
        System.out.println(Arrays.toString(arr));
        
        System.out.print("вывод элементов массива в обратном порядке: ");
        invert(arr);
        System.out.println(Arrays.toString(arr));
        
        System.out.print("четные числа массива: ");
        even(arr);
        System.out.println("");
        
        System.out.print("нечетные числа массива: ");
        uneven(arr);
        System.out.println("");
        
        summMult7(arr);
        product(arr);
        
        
    }    
    
    
    private static void invert(int[] arr) {
        for (int k = 0; k < arr.length/2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k -1];
            arr[arr.length - k -1] = tmp;
           
        }
    }
    
    
    private static void even(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
              if(arr[i] % 2 == 0){
                  System.out.print(arr[i] + " ");
              }
          }
    }
    
    
    private static void uneven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
              if(arr[i] % 2 != 0){
                  System.out.print(arr[i] + " ");
              }
          }
    }
    
    
    private static void summMult7(int[] arr) {
        int summ7 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                summ7 = arr[i] + summ7;
            }
        }
        System.out.println("сумма элементов кратных 7 = " + summ7);
    }
    
    
    private static void product(int[] arr) {
        int summ7 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                summ7 = arr[i] * summ7;
            }
        }
        System.out.println("произведение элементов кратных 3 = " + summ7);
    }
    
    
    
    
    
    
    
    
    
    
}
