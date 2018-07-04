package pattern.observer;

/**
 * 抽象主题
 * @author liweihai
 *
 */
public interface Subject {
	// 登记一个新的观察者
	public void attach(Observer obs);
	//删除一个登记过的观察者
	public void detach(Observer obs);
	// 通知所有登记过的观察者
	public void notifyObserver();

}
