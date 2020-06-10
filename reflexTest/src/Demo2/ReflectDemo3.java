package Demo2;

import java.lang.reflect.Constructor;

/*
* 获取私有构造方法
* */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        //获取字节码对象
        Class c=Class.forName("Demo1.Person");
        //获取私有构造方法
        Constructor con=c.getDeclaredConstructor(String.class);
        //创建对象
        con.setAccessible(true);
        Object obj=con.newInstance("lk");
        System.out.println(obj);
    }
}
