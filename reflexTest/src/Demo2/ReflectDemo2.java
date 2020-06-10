package Demo2;

import java.lang.reflect.Constructor;

/*
* 获取带参构造方法
* Person p=new Person("lk",12,"asd");
* */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        //获取字节码文件对象
        Class c=Class.forName("Demo1.Person");
        //获取带参构造方法对象
        Constructor con=c.getConstructor(String.class,int.class,String.class);
        //创建对象
        Object obj=con.newInstance("lk",12,"asd");
        System.out.println(obj);
    }
}
