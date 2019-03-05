import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;

public class Demo027 {//多线程思想
    public static void main(String[] args) {
        System.out.println(new Demo().getName());
        System.out.println(new Demo("wuyu").getName());
        System.out.println(new Demo().getName());
        System.out.println(new Demo("god").getName());
        System.out.println(new Demo().getName());
    }
    static class Demo{
        private String name;
        private static int count = 0;
        public  Demo(){
            count++;
            this.name = "Demo-"+count;

        }
        public Demo(String name){
            this.name =name;

        }
        public String getName(){
            return this.name;
        }

    }
}
