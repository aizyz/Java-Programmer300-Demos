public class Demo015 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println("满足条件的三位数是:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j == i)
                    continue;
                for (int k = 0; k < a.length; k++) {
                    if (k == i || k == j)
                        continue;
                    for (int h = 0; h < a.length; h++) {
                        if (h == k || h == i || h == j)
                            continue;
                        System.out.print(a[j] * 100 + a[k] * 10 + a[h] + ",");
                    }
                }
            }
        }
    }
}


