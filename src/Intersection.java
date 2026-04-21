import java.util.ArrayList;
import java.util.List;

public class Intersection {


    public static List<Integer> intersection(int[] arr1, int[] arr2){

        List<Integer> list = new ArrayList<>();
        int[] visited = new int[arr2.length];
        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j] && visited[j] == 0){
                    list.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                if(arr2[j] > arr1[i]){
                    break;
                }
            }
        }

        return list;

    }

    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6,7,8};

        List<Integer> list = intersection(arr1, arr2);

        for(int i: list){
            System.out.print(i + " ");
        }
    }
}
