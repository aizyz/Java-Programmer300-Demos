public class Demo026 {
        public static void main(String[] args) throws Exception {
            String str = "51283346";
            // 第一步：\\d{7,8}，因为电话号码可能是7~8位所组成；
            // 第二步：(\\d{3,4})?\\d{7,8}，因为区号由3~4位所组成；
            // 第三步：(\\d{3,4})?-?\\d{7,8}，因为-可能出现也可能不出现
            // 第四步：((\\d{3,4}|\\(\\d{3,4}\\))-?)?\\d{7,8}
            String regex = "((\\d{3,4}|\\(\\d{3,4}\\))-?)?\\d{7,8}";
            if (str.matches(regex)) { // 符合于验证要求
                System.out.println("TRUE，电话号码输入合法。");
            } else {
                System.out.println("FLASE，电话号码输入非法！");
            }
        }
    }

