public class Demo018 {
    public static void main(String[] args) throws Exception{
        String str = "12135a23343553";
        if(isNumber(str)){
            System.out.println("是数字字符");
        }
        else{
            System.out.println("不是数字字符");
        }
    }
    public static boolean isNumber(String data){
        char arr[] = data.toCharArray();
        for(int x = 0; x<arr.length;x++){
            if(arr[x]<'0'|| arr[x]>'9'){
            return false;
            }
        }
        return true;
    }
}
