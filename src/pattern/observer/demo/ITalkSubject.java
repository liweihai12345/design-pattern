package pattern.observer.demo;
/**
 * 朋友圈说说抽象主题
 * @author liweihai
 *
 */
public interface ITalkSubject {

	public void registerObserver(ITalkObserver observer);
	public void deleteObserver(ITalkObserver observer);
	public void notifyObserver();
}
