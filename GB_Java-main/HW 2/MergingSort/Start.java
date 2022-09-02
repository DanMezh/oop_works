package MergingSort;

public class Start {
    public static void main(String[] args) {
        int[] newArray = new int[]{5,2,6,7,3,4,1,4,5,8,1,2};
        newArray = MergeSorter.sortArray(newArray);
        printArrConsole(newArray);
    }

    static void printArrConsole(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
