import java.util.Scanner;
class Primenumber{
        boolean number(int n){	
		    
		    for(int i=2;i<=n/2;i++){
			    if(n % i == 0){
				    return false;
			    }
		    }
		    return true;
	}
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		Primenumber nx = new Primenumber();
	
		if(nx.number(n)){ 
			System.out.println("number is prime");
                }	
		else{
			System.out.println("number is not prime");
		}	

	}
}