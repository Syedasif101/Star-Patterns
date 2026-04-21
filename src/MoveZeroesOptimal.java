public class MoveZeroesOptimal {
    public static void moveZeroes(int[] arr){
        int n = arr.length;
        int j = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }

        }
        // There isn't any zero in the array
//        if(j == -1){
//            return arr;
//        }

        for(int i=j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
    }

    public static void main(String[] args){

        int[] arr = {1,0,2,3,0,4,0,8,9,0};
        moveZeroes(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
