package pattern.observer;

public class Client {

	public static void main(String[] args) {
		// ����һ��������󣨱��۲��ߣ�
		ConcreteSubject subject =new ConcreteSubject();
		// ����һ���۲���
		Observer obs = new ConcreteObserver();
		
		// �Ǽǹ۲���
		subject.attach(obs);
		// �ı�״̬
		subject.change();
	}
}
