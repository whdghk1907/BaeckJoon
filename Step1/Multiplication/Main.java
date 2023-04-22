package Step1.Multiplication;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toMultiple = sc.nextInt();
        int byMultiple = sc.nextInt();

        int[] byMultipleArray = new int[3];

        int i = 0;
        int result = 0;

        while (byMultiple >= 1){
            byMultipleArray[i] = byMultiple % 10;
            byMultiple /= 10;
            i ++;
        }

        for (int j = 1; j <= i; j++){
            int multiple = byMultipleArray[j - 1] * toMultiple;
            System.out.println(multiple);

            int digit = 1;

            for (int k = 1; k < j; k++) {
                digit *= 10;
            }

            result += multiple * digit;
        }
        System.out.println(result);
    }
}
