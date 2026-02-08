import java.util.Scanner;
class Fibonaci{
	public void print(int n){
	    if(n == 0 ){
	        System.out.print("Invalid input");
	    }
	    if(n == 1 && n != 2){
	        System.out.print("0");
	    }
		int x1 = 0 , x2 = 1 ,  x3 = 0 ;
		if(n>1){
		    System.out.print(x1+" , ");
		    System.out.print(x2+" , ");
		}
		for(int i=2;i<n;i++){
			x3 = x2+x1;
			x1 = x2;
			x2 = x3;
			System.out.print(x3+" , ");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a number how up to number you want to print fibonaci : ");
		int n = sc.nextInt();
		Fibonaci f1 = new Fibonaci();
		f1.print(n);
	}
}