public class DeleteFromBegining {

    public static void main(String[] args) {

        int[] arr = {2,22,33,44,55,66};

        int n = arr.length;

        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        n--;


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
