public class MoveZeroesToEnd {

    public static int[] moveZeroes(int[] arr){
        // Using extra space
        int newArr[] = new int[arr.length];
        int j = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

    public static void main(String[] args){
        int arr[] = {1,2,0,3,5,0,7,9,0};

       int newArr[] =  moveZeroes(arr);

       for(int i=0; i<newArr.length; i++){
           System.out.print(newArr[i] + " ");
       }


    }
}
