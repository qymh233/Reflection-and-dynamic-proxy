package Demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
* 获取成员方法
* */
public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("Demo1.Person");
        //获取所有的方法
        //Method[] methods=c.getMethods();//获取自己的包括父亲的公共方法
//        Method[] methods=c.getDeclaredMethods();//获取自己的所有方法
//        for(Method method:methods){
//            System.out.println(method);
//        }
        //无参构造
        Constructor con=c.getConstructor();
        Object obj=con.newInstance();
        //获取单个方法
        Method m1=c.getMethod("show");
        m1.invoke(obj);

        Method m2=c.getMethod("method", String.class);
        m2.invoke(obj,"hello");

        Method m3=c.getMethod("getString", String.class, int.class);
        Object objString=m3.invoke(obj,"hello",16);
        System.out.println(objString);
//        String s=(String)m3.invoke(obj,"hello",16);
//        System.out.println(s);

        Method m4=c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);

    }
}
