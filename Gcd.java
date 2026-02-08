import java.util.Scanner;
class Gcd{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter both number a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println("GCD is : "+a);
	}
}