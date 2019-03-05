import org.jetbrains.annotations.NotNull;

class Person {
    private String name ;
    private int age ;
    public Person(String name,int age) {
        this.name = name ;
        this.age = age ;
    }

    public Person() {

    }

    @NotNull
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]\n";
    }
}




