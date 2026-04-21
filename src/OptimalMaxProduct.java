public class OptimalMaxProduct {

    public static int find(int[] arr){
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            } else if(arr[i] > maxB){
                maxC = maxB;
                maxB = arr[i];
            } else if(arr[i] > maxC){
                maxC = arr[i];
            }


            if(arr[i] < minA){
                minB = minA;
                minA = arr[i];
            } else if(arr[i] < minB){
                minB = arr[i];

            }
        }

        return Math.max(minA * minB * maxA, maxA*maxB*maxC);
    }
    public  static void main(String[] args){
        int[] arr = {2,3,1,4,5,6};

        int maxProduct = find(arr);
        System.out.println(maxProduct);
    }
}
