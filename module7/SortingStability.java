class SortingStability {

    static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int arr1[] = {4, 3, 2, 1};
        int arr2[] = {4, 3, 2, 1};

        insertionSort(arr1);
        selectionSort(arr2);

        System.out.println("Insertion Sort (Stable):");
        for (int i : arr1)
            System.out.print(i + " ");

        System.out.println("\nSelection Sort (Unstable):");
        for (int i : arr2)
            System.out.print(i + " ");
    }
}
