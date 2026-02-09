class Mergearraysmissing{
    public static void main(String[] args){
        int[] arr = {1,2,6,8};
        int[] brr = {3,4,5,7,9,10};
        int[] ans = new int[arr.length + brr.length];
        int  k=0 , i=0 , j=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                ans[k++] = arr[i++];
            }
            else{
                ans[k++] = brr[j++];
            }
        }
        while(i<arr.length){
            ans[k++] = arr[i++];
        }
        while(j<brr.length){
            ans[k++] = brr[j++];
        }
        System.out.println("The marged arrat is : ");
        for(int l=0;l<ans.length;l++){
           System.out.print(ans[l] + " "); 
        }
        
        
        
        
        
        System.out.println();
        System.out.println("Missing number is : ");
        int[] xrr = {1,3,4,5};
        int n = xrr.length;
        
        int xor1 = 0, xor2 = 0;

        for (int f = 1; f <= n + 1; f++)
            xor1 ^= f;

        for (int x : xrr)
            xor2 ^= x;

        int missing = xor1 ^ xor2;
        System.out.println(missing);
        
        
        
        
        
        
    
    }
}