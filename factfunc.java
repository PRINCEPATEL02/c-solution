
import java.util.Scanner;
class Factfunc{
	public int fact(int n){
		if(n==0 || n == 1){ return 1;}
		return n*fact(n-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Factfunc nx = new Factfunc();
		System.out.println("Enter a number : ");
		int x = sc.nextInt();
		System.out.println(nx.fact(x));
	}
}