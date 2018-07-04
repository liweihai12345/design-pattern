package pattern.observer;

/**
 * 具体观察者
 * @author liweihai
 *
 */
public class ConcreteObserver implements Observer {

	// 实现更新方法
	@Override
	public void update() {
		System.out.println("收到通知，并进行处理！");
		
	}

}
