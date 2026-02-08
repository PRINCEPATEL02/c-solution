import java.util.Scanner;
class Armstrong{
public int power(int x , int d){
	int sum = 1;
	while(d>0){
		sum = (sum * x);
		d--;
	}
	return sum;
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Armstrong a = new Armstrong();
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int d = 0;
		while(n>0){
	
			d++;
			n = n / 10;
		}
		n = m;
		int sum = 0;
		while(n>0){
			int x = n % 10;
			sum = sum + a.power(x,d);
			n = n / 10;
		}
		if(sum == m){
		    System.out.println("the number is amstrong");
		}
		else{
		    System.out.println("the number is not amstrong");
		}

	}
}