package Demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
* 获取成员变量
* */
public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        //获取字节码对象
        Class c=Class.forName("Demo1.Person");
        //获取所有成员变量
//        //Field[] fields=c.getFields();//获取所有公共的成员变量
//        Field[] fields=c.getDeclaredFields();//获取所有成员变量
//        for(Field field:fields){
//            System.out.println(field);
//        }
        /*
        * Person p=new Person();
        * p.address="lkl";
        * */
        //通过无参构造方法创建对象
        Constructor con=c.getConstructor();
        Object obj=con.newInstance();
        //获取单个成员变量
        //获取address并对其赋值
        Field addressField=c.getField("address");
        addressField.set(obj,"lkl");
        System.out.println(obj);
        //获取name并对其赋值
        Field nameField=c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"asd");
        System.out.println(obj);
        //获取age并对其赋值
        Field ageField=c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,45);
        System.out.println(obj);

    }
}
