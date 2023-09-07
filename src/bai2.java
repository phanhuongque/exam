import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 2<=N<=20:");
        int N=input.nextInt();
        if(2<=N & N<=20){
            for(int i=1;i<=10;i++){
                System.out.printf("%d * %d = %d\n",N,i,N*i);
            }
        }
    }
}