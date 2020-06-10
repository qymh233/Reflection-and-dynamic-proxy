package Demo1;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p=new Person();
        Class c=p.getClass();
        Class c2=Person.class;
        Class c3=Class.forName("Demo1.Person");
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
    }
}
