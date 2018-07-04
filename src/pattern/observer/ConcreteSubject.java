package pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 具体主题
 * @author liweihai
 *
 */
public class ConcreteSubject implements Subject{

	private Vector<Observer>obsVector =new Vector<Observer>();
	// 登记一个新的观察者
	@Override
	public void attach(Observer obs) {
		obsVector.add(obs);
		
	}

	// 删除一个登记过的观察者
	@Override
	public void detach(Observer obs) {
		obsVector.remove(obs);
		
	}

	// 通知所有登记过的观察者对象
	@Override
	public void notifyObserver() {
		for (Observer observer : obsVector) {
			observer.update();
		}
		
	}
	
	//返回观察者集合的Enumeration 对象
	public Enumeration<Observer> observers(){
		return obsVector.elements();
	}
	// 业务方法 改变状态
	public void change(){
		this.notifyObserver();
	}

}
