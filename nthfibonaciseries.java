import java.util.Scanner;
class fibon{
	public int fibo(int n){
		if(n == 0 || n == 1){
			return 0;
		}
		if(n == 2){return 1;}
		return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		fibon f = new fibon();
		System.out.println("Enter a numner for find nth fibonacy number : ");
		int n = sc.nextInt();
		int x = f.fibo(n);
		System.out.print(x);
	}
}