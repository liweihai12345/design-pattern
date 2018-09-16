package pattern.observer.demo;
/**
 * 朋友圈说说抽象主题
 * @author liweihai
 *
 */
public interface ITalkSubject {
	
	// 注册观察者
	public void registerObserver(ITalkObserver observer);
	//删除观察者
	public void deleteObserver(ITalkObserver observer);
	//修改观察者
	public void notifyObserver();
}
