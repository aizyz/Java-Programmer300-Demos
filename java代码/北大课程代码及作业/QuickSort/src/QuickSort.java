public class QuickSort {
    private static void sort(int[] intArrays ,int left,int right) {
        //如果左索引大于右索引，直接返回
        if(left > right){
            return;
        }
        int i = left ;
        int j = right;
        int temp = intArrays[left];//设置基准值，将最左端元素作为基准值
        while(i != j){
            //往左移位，直到小于temp
            while(i<j && intArrays[j]>=temp){
                j--;
            }
            //往右移位，直到大于temp
            while(i<j && intArrays[i]<=temp){
                i++;
            }
            if(i < j){
                //如果i<j,也就是说i和j还没相遇时，交换彼此的数据
                NumberUtil.exchange(intArrays,i,j);
            }
        }
        //当哨兵i与哨兵j相遇时退出循环，将哨兵i与基位交换位置
        NumberUtil.exchange(intArrays,left,i);
        //下一次迭代
        sort(intArrays,left,i-1);//左半边
        sort(intArrays,j+1,right);//右半边
    }

    /**
     * 执行入口，intArrays：待排序的数组，displaySort：是否显示排序前和排序后的内容。
     *
     */
    public static void run(int intArrays[],boolean displaySort){
        //克隆一份数组
        int arrays[]= intArrays.clone();
        // 判断是否需要显示排序前的内容
        if(displaySort){
            NumberUtil.display(arrays,1);
        }
        // 记录开始时间
        long startTime=System.currentTimeMillis();
        sort(arrays,0,arrays.length-1);
        // 记录结束时间
        long endTime=System.currentTimeMillis();
        // 判断是否需要显示排序前的内容
        if(displaySort){
            NumberUtil.display(arrays,2);
        }
        System.out.println("快速排序用时："+(endTime-startTime)+"毫秒");
    }
    /**
     * 测试排序用的主方法
     */
    public static void main(String[] args){
        //数组长度
        int length=1000000;
        //最大值
        int max =1000000;
        //是否打印排序后的内容
        boolean display=true;
        //随机获取的排序数组
        int intArrays[]= NumberUtil.getRandomArs(length,max);
        //快速排序
        QuickSort.run(intArrays,display);
    }
}
