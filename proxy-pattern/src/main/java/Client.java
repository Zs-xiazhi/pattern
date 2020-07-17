import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> proxyClass = Proxy.getProxyClass(KindWomen.class.getClassLoader(), KindWomen.class);
        InvocationHandler handler = new JdkPorxy();
        KindWomen kindWomen = (KindWomen) proxyClass.getConstructor(InvocationHandler.class).newInstance(handler);
        kindWomen.makeEyesWithMan();
    }

}
