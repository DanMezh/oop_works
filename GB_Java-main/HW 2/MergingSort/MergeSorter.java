package MergingSort;
/**
 * Sort using MergeSort method
 */
public class MergeSorter {

    public static void main(String[] args) {
        
    }

    static int[] sortArray(int[] intArray) {
        int intArrLen = intArray.length;
        // ### Разделяем ###
        // окончание рекурсии разбития на подмассивы, до 1 элемента
        if (intArrLen == 1 || intArrLen == 0) {
            return intArray;
        }
        // срезаем левую "половину"
        int[] leftPart = new int[intArrLen / 2];
        System.arraycopy(intArray, 0, leftPart, 0, leftPart.length);
        // срезаем правую "половину"
        int[] rightPart = new int[intArrLen - leftPart.length];
        System.arraycopy(intArray, leftPart.length, rightPart, 0, rightPart.length);
        // рекурсивно соритируем получившиеся "половинки", прежде чем "сортировать" их
        leftPart = sortArray(leftPart);
        rightPart = sortArray(rightPart);

        // ### Властвуем ###
        // Объединение двух массивов через слияние
        return mergeSort(leftPart,rightPart);
    }

    static int[] mergeSort(int[] lArray, int[] rArray) {
        int[] resultArr = new int[lArray.length+rArray.length];

        int lIdx = 0;
        int rIdx = 0;
        int sortIdx = 0;
        while (lIdx < lArray.length && rIdx < rArray.length) {
            if (lArray[lIdx] <= rArray[rIdx]) {
                resultArr[sortIdx] = lArray[lIdx];
                lIdx += 1;
            } else {
                resultArr[sortIdx] = rArray[rIdx];
                rIdx += 1;
            }
            sortIdx += 1;
        }
        if (lIdx < lArray.length) {
            System.arraycopy(lArray, lIdx, resultArr, sortIdx, lArray.length - lIdx);
        }
        if (rIdx < rArray.length) {
            System.arraycopy(rArray, rIdx, resultArr, sortIdx, rArray.length - rIdx);
        }
        return resultArr;
    }

}