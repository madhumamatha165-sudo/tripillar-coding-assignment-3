import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr){
        Arrays.sort(arr);
    }

    public static void main(String[] args) {

        int[] arr={5,2,4,6,1};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
