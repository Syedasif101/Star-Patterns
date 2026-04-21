import java.util.ArrayList;
import java.util.List;

public class IntersectionOptimal {

    public static List<Integer> intersection(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();

        int i=0;
        int j=0;

        while(i < arr1.length && j < arr2.length){

            if(arr1[i] < arr2[j]){
                i++;
            } else if (arr2[j] < arr1[i]){
                j++;

            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        return list;
    }

    public static void main(String[] args){

        int arr1[] = {1,2,4,5,6,7};
        int arr2[] = {2,3,4,6,7,8};

       List<Integer> list = intersection(arr1, arr2);

       for(int i : list){
           System.out.print(i + " ");
       }
    }
}
