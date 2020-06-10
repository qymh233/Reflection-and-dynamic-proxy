package Demo2;

import java.lang.reflect.Constructor;

/*
* 获取无参构造方法
* */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //获取字节码文件对象
        Class c=Class.forName("Demo1.Person");
        //获取构造方法
        //Constructor[] con= c.getConstructors();//获取所有公共的构造方法
//        Constructor[] cons=c.getDeclaredConstructors();//获取所有的构造方法
//        for(Constructor con:cons){
//            System.out.println(con);
//        }
        //获取单个构造方法
        Constructor con=c.getConstructor();//得到的是构造方法对象
        Object obj=con.newInstance();
        System.out.println(obj);
    }
}
