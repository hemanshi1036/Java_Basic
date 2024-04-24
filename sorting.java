
public class sorting {
    public static void printArray(int arr[]){
        for(int i = 0; i<=arr.length; i++) {
            System.out.println(arr[i] +"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {9,3,5,1,6};
       // bubble_sort

        for(int i = 0; i <= arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){//je swap thay ne last ma jato ryo HASE tya fari check karva nai jase aetle i minus karyo
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}