public class Demo005 {//冒泡排序
    public static void main(String[] args) {
        int score[] = {12, 34, 14, 64, 75, 21, 7, 24, 98, 43};
        for (int i=0;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if(score[i]<score[j]){
                    int temp=score[i];
                    score[i]=score[j];
                    score[j]=temp;

                }
            }
            System.out.println("第"+(i+1)+"次排序的结果：\t");
            for(int j=0;j<score.length;j++){
                System.out.println(score[j]+"\t");
            }
        }
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }
}
}
