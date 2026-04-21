public class WaveForm {

    public static void wave(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i=i+2){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }


    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};

        wave(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
