package proxy;

public class TestCglibProxy {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		//通过生成子类的方式创建代理类 
		StudentServiceImpl student = (StudentServiceImpl) proxy.getProxy(StudentServiceImpl.class);
		student.save();
	}
}
