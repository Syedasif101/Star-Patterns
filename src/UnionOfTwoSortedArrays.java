import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArrays {

    public static int[] Union(int[] arr1, int[] arr2){

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);

        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        int[] union = new int[set.size()];

        int i = 0;
        for(int it: set){
            union[i] = it;
            i++;
        }

        return union;

    }

    public static void main(String[] args){

        int arr1[] = {1,2,2,3,4,5,6};
        int arr2[] = {2,2,3,4,5,6,7};

        int[] union = Union(arr1, arr2);

        for(int i=0; i<union.length; i++){
            System.out.print(union[i] + " ");
        }
    }
}
