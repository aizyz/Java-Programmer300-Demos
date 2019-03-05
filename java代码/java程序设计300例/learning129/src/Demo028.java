public class Demo028 {
    public static void main(String[] args) {
        if(args.length!=3){
            System.exit(1);
        }
        for(int x=0;x<args.length;x++){
            System.out.println("第"+(x+1)+"个参数是："+args[x]);

        }
    }
}
