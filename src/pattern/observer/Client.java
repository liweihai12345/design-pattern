package pattern.observer;

public class Client {

	public static void main(String[] args) {
		// 创建一个主题对象（被观察者）
		ConcreteSubject subject =new ConcreteSubject();
		// 创建一个观察者
		Observer obs = new ConcreteObserver();
		
		// 登记观察者
		subject.attach(obs);
		// 改变状态
		subject.change();
	}
}
