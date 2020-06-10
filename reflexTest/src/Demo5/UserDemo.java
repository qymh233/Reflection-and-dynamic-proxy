package Demo5;

import java.lang.reflect.Proxy;
/*
* 动态代理
* */
public class UserDemo {
    public static void main(String[] args) {
        UserDao ud=new UserDaoImpl();
        MyInvocationHandler handler=new MyInvocationHandler(ud);
        UserDao proxy=(UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(),ud.getClass().getInterfaces(),handler);
        proxy.add();
        proxy.delete();
        proxy.select();
        proxy.update();
    }
}
