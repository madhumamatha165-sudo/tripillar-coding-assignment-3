public class EvenIndex {
    public static void main(String[] args) {
        int[] arr = {3,6,12,1,5,8};

        for(int i=0;i<arr.length;i++){
            if(i%2==0 && arr[i]%2!=0){
                System.out.println("Mismatch at index "+i);
            }
        }
    }
}
