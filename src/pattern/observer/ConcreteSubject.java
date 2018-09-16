package pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ��������
 * @author liweihai
 *
 */
public class ConcreteSubject implements Subject{

	private Vector<Observer>obsVector =new Vector<Observer>();
	// �Ǽ�һ���µĹ۲���
	@Override
	public void attach(Observer obs) {
		obsVector.add(obs);
		
	}

	// ɾ��һ���Ǽǹ��Ĺ۲���
	@Override
	public void detach(Observer obs) {
		obsVector.remove(obs);
		
	}

	// ֪ͨ���еǼǹ��Ĺ۲��߶���
	@Override
	public void notifyObserver() {
		for (Observer observer : obsVector) {
			observer.update();
		}
		
	}
	
	//���ع۲��߼��ϵ�Enumeration ����
	public Enumeration<Observer> observers(){
		return obsVector.elements();
	}
	// ҵ�񷽷� �ı�״̬
	public void change(){
		this.notifyObserver();
	}

}
