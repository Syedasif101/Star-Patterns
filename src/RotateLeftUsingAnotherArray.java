public class RotateLeftUsingAnotherArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int d = 2;

        int temp[] = new int[arr.length];

        for(int i=d; i<arr.length; i++){
            temp[i-d] = arr[i];
        }
        for(int i=0; i<d; i++){
            temp[temp.length - d + i] = arr[i];
        }


        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
