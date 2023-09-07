import java.util.Scanner;
import static java.lang.Math.*;
public class bai3 {
    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
             N= input.nextInt();
        } while (N < 0);

        int array[] = new int[N];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i+1);
            array[i] = input.nextInt();
        }

        System.out.print("\nMảng: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + "\t");
        }
        //Số lẻ
//        System.out.println("\nCác số lẻ trong mảng là:");
//        for(int i=0; i<N; i++){
//        if(array[i]%2!=0) {
//            System.out.printf("%d\t", array[i]);
//            }
//        }

        //Số chẵn
//        System.out.println("\nCác số chẵn trong mảng là:");
//        for(int i=0; i<N; i++){
//        if(array[i]%2==0) {
//            System.out.printf("%d\t", array[i]);
//            }
//        }

        //Số nguyên tố
        int sum=0;
        System.out.println("\nCác số nguyên tố trong mảng là: ");
        for(int i=0; i<N; i++){
            for(int j=1; j<=sqrt(array[i]);j++){
                if(array[i]%j==0){
                    sum++;
                }
            }
            if(sum<2){
                System.out.println(array[i]);
            }
            sum=0;
        }

        //Dãy số Fibonacci

    }
}