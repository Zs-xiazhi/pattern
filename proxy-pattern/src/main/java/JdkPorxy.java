import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author 赵帅
 * @date 2020/7/7
 */
public class JdkPorxy implements InvocationHandler {

    /**
     * 代理方法
     * @param proxy 代理对象
     * @param method 调用的方法
     * @param args 参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理");
        System.out.println(method);
        System.out.println(args);
        return null;
    }
}
