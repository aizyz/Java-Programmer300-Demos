public class InsertSort {
    public static int[] InsertSort(int[] numbers, int array_size) {
        int i, j, index;
        for (i = 1; i < array_size; i++) {
            index = numbers[i];
            j = i;
            while ((j > 0) && (numbers[j - 1] > index)) {
                numbers[j] = numbers[j - 1];
                j = j - 1;
            }
            numbers[j] = index;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {5,4,3,2};
            System.out.println("\n使用插入排序前的数组: ");

        for (int m = 0; m < numbers.length; m++) {
            System.out.print(" " + numbers[m]); }
            int[] b = InsertSort( numbers,4);
            System.out.println("\n使用插入排序后的数组: ");
            for (int i = 0; i < b.length;i++) {
                System.out.print(" " + b[i]); }
    }
}



