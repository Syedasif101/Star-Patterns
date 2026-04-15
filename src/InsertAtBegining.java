public class InsertAtBegining {

    public static void insertAtEnd(int[] arr, int element){

        int[] newArr = new int[arr.length + 1];

        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = element;

        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {33,44,55,66,77,0};

        int n = arr.length;
        int element = 22;


        for(int i = n - 2; i>=0; i--){
            arr[i + 1] = arr[i];
        }

        arr[0] = element;


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        insertAtEnd(arr, element);



    }
}
