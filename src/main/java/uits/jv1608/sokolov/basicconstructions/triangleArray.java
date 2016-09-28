package uits.jv1608.sokolov.basicconstructions;

import java.util.Random;


public class triangleArray {
    public static void main(String[] args) {
        trianglearray(args);
        System.out.println("");
//        horizontalInverted(triangle_array);
    }
        
    public static void trianglearray (String[] args){
        Random r = new Random();
            int m = r.nextInt(20);
//            System.out.println(m);
            int[][] triangle_array = new int[m][];
            for (int i = 0; i < triangle_array.length; i++) {
                triangle_array[i] = new int [i+1];
            }

            for (int i = 0; i < triangle_array.length; i++) {
                int k = 1;
                for (int j = 0; j < i+1; j++) {
                    triangle_array[i][j] = k;
                    k++;
                    System.out.print(triangle_array[i][j]+" ");
                }
                System.out.println("");
            }
            
    
    }
    
    public static void horizontalInverted(int[][] triangle_array) {
        for (int i = 0; i < triangle_array.length; i++) {
            for (int j = 0; j < triangle_array.length/2; j++) {
                int tmp = triangle_array[i][j];
                triangle_array[i][j] = triangle_array[i][triangle_array.length - j - 1];
                triangle_array[i][triangle_array.length - j - 1] = tmp;
                
                System.out.print(triangle_array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
 
    
    
    
    
    
    
    
    
    
}
