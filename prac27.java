import java.util.Scanner;

public class prac27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int m = 0;
        int sum = 0;
        while(n>0){
            int r = n % 10;
            m  = m * 10 + r;
            n = n / 10;
            sum += r;
        }
        System.out.println("the reverse number is : "+m);
        System.out.println("the sum of digits is : "+sum);
    }
}
