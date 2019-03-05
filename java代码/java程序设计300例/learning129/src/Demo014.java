public class Demo014 {
    public static void main(String[] args) {
        int score[] = {12,41,42,5,23,17,86,61,91,35};
        int age[] = {12,43,23,18,17,9,31};
        sort(score);
        print(score);
        System.out.println("\n--------------------------------------");
        sort(age);
        print(score);

    }

    public static void sort(int temp[]){//数组冒泡排序
        for(int i=1;i<temp.length;i++){
            for( int j=0;j<temp.length;j++){
                if (temp[i]<temp[j]) {
                    int x= temp[i];
                    temp[i]=temp[j];
                    temp[j]=x;


                }

            }
        }


    }

    public static void print (int temp[]){//输出数组内容
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }

    }
}
