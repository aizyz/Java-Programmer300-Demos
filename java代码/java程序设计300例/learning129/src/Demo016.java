public class Demo016 {
    public static void main(String[] args) {
        int i1[]={1,2,3,4,5,6,7,8,9};
        int i2[]={11,22,33,44,55,66,77,88,99};
        //copy(i1,3,i2,3,4);
        print(i2);
        System.out.println("------------------------------");
        System.arraycopy(i1,3,i2,3,4);
        print(i2);
    }

    /*public static void copy(int s[],int s1,int o[],int s2,int len){
        for(int i = 0;i<len;i++){
            o[s2+i]=s[s1+i];

        }

    }
*/
    public static void print(int temp[]){
        for(int i = 0; i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
