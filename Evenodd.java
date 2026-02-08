import java.util.Scanner;
class Evenodd{
    
    public void evenodd(int[] arr){
        int e = 0 , o = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[i] % 2 == 0){
                e++;
            }
            else if(arr[i]!=0 && arr[i] % 2 != 0){
                o++;
            }
        }  
        System.out.println("Even number is : "+e);
        System.out.println("Odd number is : "+o);
        
    }
    public void negativepositivezero(int[] arr){
        int n = 0  , p = 0  , z = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                p++;
            }
            else if(arr[i]<0){
                n++;
            }
            else{
                z++;
            }
        }
        System.out.println("Positive number is : "+p);
        System.out.println("Negative number is : "+n);
        System.out.println("Zeros in array is : "+z);
        
    }
   
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Evenodd x = new Evenodd();
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        x.evenodd(arr);
        x.negativepositivezero(arr);
   
    }
}