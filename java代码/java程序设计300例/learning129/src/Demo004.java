import java.sql.SQLOutput;

public class Demo004 {
    public static void main(String[] args) {
        int score[] = {12,45,23,76,9,92,100};
        int max;
        int min;
        max=min=score[0];
        for(int x=0; x<score.length;x++){
            if(score[x]>max){
                max=score[x];
            }
            if (score[x]<min) {
                min=score[x];


            }
        }
        System.out.println(min);
        System.out.println(max);
    }


}
