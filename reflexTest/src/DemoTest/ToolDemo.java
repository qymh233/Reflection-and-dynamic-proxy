package DemoTest;

public class ToolDemo {
    public static void main(String[] args) throws Exception{
        Person p=new Person();
        Tool t=new Tool();
        t.setProperty(p,"name","lkj");
        t.setProperty(p,"age",145);
        System.out.println(p);

    }
}
class Dog{
    char sex;
    float price;
    public String toString(){
        return sex+"-----"+price;
    }
}
class  Person{
    private String name;
    public  int age;
    public String toString(){
        return name+"-----"+age;
    }
}