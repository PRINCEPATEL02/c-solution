
import java.util.Scanner;
class Perfact{
	public void number(int n){
		int sum = 0 , m = n , i = 1;
		if(n == 0){
                	System.out.println("Invalid number");
		}
		while(i<n){
			if(n % i == 0){
				sum += i;
			}
			i++;
		}
		if(m == 1){
                	System.out.println("is not a Perfact number");
                	return;
		}
		if(sum == m){
                	System.out.println("is a Perfact number");
		}
		else{
			System.out.println("is not a  number");
		}


	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Perfact p = new Perfact();
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		p.number(n);
		
	
	}

}