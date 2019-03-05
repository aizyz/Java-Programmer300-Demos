public class Demo006 {
    public static void main(String[] args) {
        int score[][] = new int[4][3];
        score[0][0] = 12;
        score[0][1] = 20;
        score[1][2] = 32;
        score[2][2] = 45;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println(score[i][j] + "\t");

            }
            System.out.println(" ");
        }

        int score2[][] = {{12, 32}, {45, 48},{10, 19,12,87}};
        for (int m = 0; m < score2.length; m++) {
            for (int n = 0; n < score2[m].length; n++) {
                System.out.println(score2[m][n] + "\t");
            }
        }
        System.out.println(" ");

    }
}
