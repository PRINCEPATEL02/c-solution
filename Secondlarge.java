import java.util.Scanner;
class Secondlarge{
	public int secodelarger(int[] arr){
		int ans1 = Integer.MIN_VALUE  , ans2 = Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++){
			if(ans1 < arr[i]){
				ans2 = ans1;
				ans1 = arr[i];
 			}
			else if(arr[i] > ans2 && arr[i] != ans1){
			    ans2 = arr[i];
			}
		}
		return ans2;
	}
	public int secondsmaller(int[] arr){
		int ans1 = Integer.MAX_VALUE , ans2 = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(ans1>arr[i]){
				ans2 = ans1;
				ans1 = arr[i];
			}
			else if(arr[i] < ans2 && arr[i] != ans1){
			    ans2 = arr[i];
			}
		}
		return ans2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Secondlarge s = new Secondlarge();
		System.out.println("Enter a number : ");
		int x = sc.nextInt();
		int[] arr = new int[x];
		for(int i=0;i<x;i++){
			arr[i] = sc.nextInt();
 		} 
		System.out.println("Second Largest: " +s.secodelarger(arr));
		System.out.println("Second Smallest: " + s.secondsmaller(arr));
	}	
}