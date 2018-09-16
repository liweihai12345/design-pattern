package pattern.observer.demo;
/**
 * ����Ȧ˵˵��������
 * @author liweihai
 *
 */
public interface ITalkSubject {
	
	// ע��۲���
	public void registerObserver(ITalkObserver observer);
	//ɾ���۲���
	public void deleteObserver(ITalkObserver observer);
	//�޸Ĺ۲���
	public void notifyObserver();
}
