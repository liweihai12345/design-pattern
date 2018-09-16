package pattern.observer;

/**
 * ��������
 * @author liweihai
 *
 */
public interface Subject {
	// �Ǽ�һ���µĹ۲���
	public void attach(Observer obs);
	//ɾ��һ���Ǽǹ��Ĺ۲���
	public void detach(Observer obs);
	// ֪ͨ���еǼǹ��Ĺ۲���
	public void notifyObserver();

}
