import java.util.Scanner;
class LCM{
    public int answer(int a , int b){
        while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
    }
    
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter both number a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		LCM g = new LCM();
		int lcm = (a*b) / g.answer(a,b);
		
		
		System.out.println("LCM is : "+lcm);
	}
}