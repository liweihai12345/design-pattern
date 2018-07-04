package pattern.observer.demo;
/**
 * ����Ȧ˵˵��������
 * @author liweihai
 *
 */
public interface ITalkSubject {

	public void registerObserver(ITalkObserver observer);
	public void deleteObserver(ITalkObserver observer);
	public void notifyObserver();
}
