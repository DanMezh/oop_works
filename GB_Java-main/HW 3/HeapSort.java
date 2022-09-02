/**
 * HeapSort
 */
public class HeapSort {
    //вспомогательный метод для печати массива в консоль
    static void printArrToConsole(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] array = new int[] { 16, 24, 13, 56, 32, 36, 47, 25 };
        //starting array
        printArrToConsole(array);
        //testing Asc sorting
        heapSort(array, true);
        printArrToConsole(array);
        //testing Desc sorting
        heapSort(array, false);
        printArrToConsole(array);
    }
   
    //Sorting ascending if True, soring descending if False
    static void heapSort(int[] array, boolean AscSoring){
        int len = array.length;

        for (int i = len / 2 - 1; i >= 0; i--) {
            binTreeHeaper(array, len, i, AscSoring);
        }

        for (int i = len -1; i >= 0 ; i--) {
            //отправляем наибольшее в конец
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            //восстанавливаем бинарное дерево, "проаваливая" макушку вниз
            binTreeHeaper(array,i,0, AscSoring);
        }
    }

    static void binTreeHeaper(int[] array, int sizeLimit, int nodeIdx, boolean maxHeapTree) {
        int TestNumIdx = nodeIdx;
        int leftIdx = 2 * nodeIdx + 1;
        int rightIdx = 2 * nodeIdx + 2;
        if (maxHeapTree){ //max binnary tree (for asc sorting)
            if (leftIdx < sizeLimit && array[leftIdx] > array[TestNumIdx]) {
                TestNumIdx = leftIdx;
            }
            if (rightIdx < sizeLimit && array[rightIdx] > array[TestNumIdx]) {
                TestNumIdx = rightIdx;
            }
        } else { //min binnary tree (for desc sorting)
            if (leftIdx < sizeLimit && array[leftIdx] < array[TestNumIdx]) {
                TestNumIdx = leftIdx;
            }
            if (rightIdx < sizeLimit && array[rightIdx] < array[TestNumIdx]) {
                TestNumIdx = rightIdx;
            }
        }
        // если узел не наибольний, меняем его с наибольшим
        if (TestNumIdx != nodeIdx) {
            int tmp = array[nodeIdx];
            array[nodeIdx] = array[TestNumIdx];
            array[TestNumIdx] = tmp;
            // рекурсивно проверяем не нужно ли значению "провалиться" дальше
            binTreeHeaper(array, sizeLimit, TestNumIdx, maxHeapTree);
        }
    }
}