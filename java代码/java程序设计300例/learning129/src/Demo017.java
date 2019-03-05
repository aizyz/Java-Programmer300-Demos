public class Demo017 {
    public static void main(String[] args) {
        fun(1,2,3,4,5);

    }

    public static void fun(int...arg){
        for(int i=0;i<arg.length;i++){
            System.out.println(arg[i]+",");
        }
    }

}
