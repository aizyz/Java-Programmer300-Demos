public class QuickSort {
    public static void main(String[] args) {
        int [] intArray = {12,34,51,86,21,4,45,11,57,33};
        System.out.println("排序前的数组: ");
        for(int i = 0;i<intArray.length;i++){
            System.out.print(" "+intArray[i]);
            System.out.println();
            if((i+1)%5==0)
                System.out.println();
            }
            System.out.println();
            int[] b =QuickSort(intArray ,0,intArray.length-1);
            System.out.println("使用快速排序后的数组: ");
            for (int i =0;i<b.length;i++){
                System.out.print(" "+b[i]);
                if((i+1)%5==0)
                    System.out.println();
            }
        }

    public static int getMiddle(int[] array ,int left,int right){
        int temp;
        int mid=array[left];
        while (left<right){
            while (left<right&&array[right]>=mid)
                right--;
            temp=array[right];
            array[right]=array[left];
            array[left]=temp;
            while(left<right&&array[left]<=mid)
                left++;
            temp=array[right];
            array[right]=array[left];
            array[left]=temp;
    }
        array[left]=mid;
        return left;
    }

    public static int[] QuickSort(int[] array, int left,int right){
        if (left<right-1){
            int mid=getMiddle(array,left,right);
            QuickSort(array,left,mid-1);

        }
        return array;
    }
}
