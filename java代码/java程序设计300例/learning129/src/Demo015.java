public class Demo015 {
    public static void main(String[] args) {
        int score[]={12,4,52,64,17,31,74,42,22};
        java.util.Arrays.sort(score);
        print(score);

    }

    public static void print(int temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}