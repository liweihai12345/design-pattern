package pattern.state;

public class StateClient {

	public static void main(String[] args) {
		// 定义环境角色
		Context context = new Context();
		// 执行行为
		context.handle1();
		context.handle2();
	}
	
}
