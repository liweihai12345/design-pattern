package pattern.state;

public class StateClient {

	public static void main(String[] args) {
		// ���廷����ɫ
		Context context = new Context();
		// ִ����Ϊ
		context.handle1();
		context.handle2();
	}
	
}
