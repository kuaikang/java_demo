package proxy;

// 测试JDK动态生成代理类
public class TestInvocationHandler {

	public static void main(String[] args) {
		// 实例化目标对象
		UserService userService = new UserServiceImpl();
		// 实例化InvocationHandler
		MyInvocationHandler handler = new MyInvocationHandler(userService);
		// 根据目标对象生成代理对象  
		UserService proxy = (UserService) handler.getProxy();
		// 调用代理对象的方法
		proxy.save();
	}
}


