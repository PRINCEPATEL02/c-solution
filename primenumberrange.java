import java.util.Scanner;
class Primerrange{

	Boolean prime(int n){
		if(n == 1 || n == 0){
			return false;
		}
		for(int i=2;i<n-1;i++){
			if(n%i == 0){	
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start number number for prime number series  : ");	
		int n = sc.nextInt();
		System.out.println("Enter a end number number for prime number series   : ");	
		int m = sc.nextInt();
		Primerrange x = new Primerrange();
		for(int i=n;i<=m;i++){
			if(x.prime(i)){
				System.out.print(i + " , ");
			}
		}
	}
}