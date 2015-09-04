public class QuickSort {
	public static int[] quickSort(int list[], int low, int high) {
        int i = low, j = high;
        int temp;
        int pivot = list[(low + high) / 2];
        /** partition **/
        while (i <= j) {
            while (list[i] < pivot)
                i++;
            while (list[j] > pivot)
                j--;
            if (i <= j) {
                /** swap **/
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
 
                i++;
                j--;
            }
        }
        /** recursively sort lower half **/
        if (low < j)
            quickSort(list, low, j);
        /** recursively sort upper half **/
        if (i < high)
            quickSort(list, i, high);
        return list;
    }
}
