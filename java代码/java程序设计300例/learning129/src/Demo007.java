public class Demo007 {
    public static void main(String[] args) {
        int score [][][]={{{12,42,31},{31,42,86}},{{3,12,34},{31,43},{35,23}}};
        for (int i=0;i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                for( int k=0;k<score[i][j].length;k++){
                    System.out.println("score["+i+"]["+j+"]["+k+"]="+score[i][j][k]+"\t");

                }
            }
        }
    }
}
