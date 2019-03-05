public class ArratInRam {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,6};
        int[] b =new int[5];
        System.out.println(b.length);
        System.out.println(a.length);
        for(int c : a){
            System.out.println(c);

        }for(int d :b){
            System.out.println(d);
        }
        b=a;
        System.out.println(b.length);
    }

}
