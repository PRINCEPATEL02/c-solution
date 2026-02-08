import java.util.Scanner;
class Largestsmallest{
	public int smallnumber(int[] arr){
		int n = arr.length , sm = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(sm>=arr[i]){
				sm = arr[i];	
			}
		}
		return sm;
	}
	public int largenumber(int[] arr){
		int x = arr.length , lr = Integer.MIN_VALUE;
		for(int i=0;i<x;i++){
			if(lr<=arr[i]){
				lr = arr[i];	
			}
		}
		return lr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Largestsmallest s = new Largestsmallest();
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("smallest number is : "+ s.smallnumber(arr));
  		System.out.println("largest number is : "+ s.largenumber(arr));
	}
}