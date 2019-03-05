
    class Person2 {

            private String name;
            private int age;
            public void tell () {
                System.out.println("姓名:" + this.getName() + ",年龄:" + this.getAge());
            }

            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public int getAge () {
                return age;
            }

            public void setAge ( int a){
                if (a >= 0 && a < 110) {
                    age = a;
                }
            }
        }

        public class Demo019 {
            public static void main(String[] args) {
                Person2 per1 = new Person2();
                per1.setName("李思");
                per1.setAge(11);
                per1.tell();
                Person2 per2 =new Person2();
                per2.setName("王武");
                per2.setAge(-8);
                per2.tell();
            }
        }


