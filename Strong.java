import java.util.Scanner;
class Strong{
	public int fact(int n){
		if(n == 0 || n == 1){ return 1;}
		return n * fact(n-1);
	}
	public void number(int n){
		int sum = 0 , m = n;
		if(n == 0){
		    System.out.println("invalid number");
		    return;
		}
		while(n>0){
			int r = n % 10;
 			sum += fact(r);
			n /= 10;
		}
		if(m == sum){System.out.println("number is Strong");}
		else{System.out.println("number is not strong");}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Strong s = new Strong();
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		s.number(n);
		
	}
}