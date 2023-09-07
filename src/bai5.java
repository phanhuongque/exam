import java.util.Scanner;
import static java.lang.Math.*;

public class bai5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a:");
        float a=input.nextFloat();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Nhập b:");
        float b=input1.nextFloat();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Nhập c:");
        float c=input2.nextFloat();
        float delta=b*b-4*a*c;
        if(delta<0){
            System.out.println("Phương trình vô nghiệm!");
        }else if(delta==0){
            System.out.printf("Phương trình có nghiệm kép x1=x2= %.2f", -b/(2*a));
        }else{
            System.out.printf("Nghiệm thứ nhất x1= %.2f", (-b+sqrt(delta))/(2*a));
            System.out.printf("\nNghiệm thứ hai x2= %.2f", (-b-sqrt(delta))/(2*a));
        }
    }
}
