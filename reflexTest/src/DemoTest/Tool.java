package DemoTest;

import java.lang.reflect.Field;

public class Tool {
    public  void setProperty(Object obj,String propertyName,Object value) throws Exception{
        Class c=obj.getClass();
        Field field=c.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj, value);

    }
}
