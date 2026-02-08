
import java.util.Scanner;
class Factloop{
	public void fact(int n){
		int sum = 1;
		for(int i=1;i<=n;i++){
			sum *= i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Factloop nx = new Factloop();
		System.out.println("Enter a number : ");
		int x = sc.nextInt();
		nx.fact(x);
	}
}