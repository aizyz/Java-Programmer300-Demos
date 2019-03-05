import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Demo{
        {
        System.out.println("构造块");}

        public Demo(){
            System.out.println("构造方法");

        }
        static {
            System.out.println("静态代码块");
        }
    }
public class Demo002 {
    public static void main(String[] args){
        new Demo();
        new Demo();
        new Demo();

    }
}
