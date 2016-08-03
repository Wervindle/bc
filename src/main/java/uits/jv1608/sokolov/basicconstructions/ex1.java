package uits.jv1608.sokolov.basicconstructions;

/**
 *
 * @author Соколов
 */
public class ex1 {

    public static void main(String[] args) {
        int mult[] = new int[101];
        int summ2 = 0;
        int summ3 = 0;
        int summ5 = 0;
        int summ7 = 0;
        System.out.print("Кратные 2 :");
        for (int i = 2; i <= 100; i++) {
            mult[i] = i;
            if (mult[i] % 2 == 0) {
                System.out.print(mult[i] + " ");
                summ2 = i + summ2;
            }
        }
        System.out.println("");
        System.out.println("сума = " + summ2);
        System.out.print("Кратные 3 :");
        for (int i = 2; i <= 100; i++) {
            mult[i] = i;
            if (mult[i] % 3 == 0) {
                System.out.print(mult[i] + " ");
                summ3 = i + summ3;
            }

        }
        System.out.println("");
        System.out.println("сума = " + summ3);
//        System.out.println("");
        System.out.print("Кратные 5 :");
        for (int i = 2; i <= 100; i++) {
            mult[i] = i;
            if (mult[i] % 5 == 0) {
                System.out.print(mult[i] + " ");
                summ5 = i + summ5;
            }

        }
        System.out.println("");
        System.out.println("сума = " + summ5);
//        System.out.println("");
        System.out.print("Кратные 7 :");
        for (int i = 2; i <= 100; i++) {
            mult[i] = i;
            if (mult[i] % 7 == 0) {
                System.out.print(mult[i] + " ");
                summ7 = i + summ7;
            }
        }

        System.out.println("");
        System.out.println("сума = " + summ7);
        
        int a ;
        double b;
        
        a = summ7 - summ2;
        b = summ5/summ3;
        System.out.println("разность сумм последовательностей чисел кратных 7 и 2 = " + a);
        System.out.println("отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3 = " + b);
    }

}
