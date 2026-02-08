import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int temp = n;
		int ans = 0;
		while(n>0){
			int r = n % 10;		
			ans = ans*10 + r;
			n = n / 10;
		}
		if(ans == temp){
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("number is not palindrome");
		}
		
	}
}