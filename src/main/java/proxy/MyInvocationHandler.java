package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler{
	//目标对象
	private Object target;
	
	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---before---");
		// 执行目标对象的方法
		Object result = method.invoke(target, args);
		System.out.println("---after---");
		return result;
	}

	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
