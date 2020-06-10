package DemoTest;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;
/*
* 配置文件
* */
public class Test {
    public static void main(String[] args) throws Exception{
        //加载键值对数据
        Properties prop=new Properties();
        FileReader fr=new FileReader("class.txt");
        prop.load(fr);
        fr.close();
        //获取数据
        String className=prop.getProperty("className");
        String methodName=prop.getProperty("methodName");
        //反射
        Class c=Class.forName(className);
        Constructor con=c.getConstructor();
        Object obj=con.newInstance();
        //调用方法
        Method m=c.getMethod(methodName);
        m.invoke(obj);
    }
}
