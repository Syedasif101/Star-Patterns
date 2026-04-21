public class MaximumProductOfTriplet {

    public static int maximumProduct(int[] arr, int n){
        int max_product = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    max_product = Math.max(max_product, arr[i] * arr[j] * arr[k]);
                }
            }
        }
        return max_product;
    }

    public static void main(String[] args){
        int arr[] = {10, 3, 5, 6, 20};
        int n = arr.length;

        int max = maximumProduct(arr, n);
        System.out.println(max);



    }
}
