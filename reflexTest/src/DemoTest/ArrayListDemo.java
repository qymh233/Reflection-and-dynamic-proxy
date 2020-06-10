package DemoTest;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
* 想ArrayList<Integer>中添加一个字符串数据
* */
public class ArrayListDemo {
    public static void main(String[] args) throws Exception{
        //创建集合对象
        ArrayList<Integer> array=new ArrayList<Integer>();
        Class c=array.getClass();
        Method m=c.getMethod("add", Object.class);
        m.invoke(array,"hello");
        m.invoke(array,"bye");
        System.out.println(array);

    }
}
