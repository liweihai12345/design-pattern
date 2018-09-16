package pattern.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ����Ȧ��Ϣ ���������
 * @author liweihai
 *
 */
public class ConcreteTalkSubject implements ITalkSubject {

	// �۲��߼���
	private List<ITalkObserver> observerlist= new ArrayList<>();
	// ����Ȧ��Ϣ
	private String msg;
	@Override
	public void registerObserver(ITalkObserver observer) {
		observerlist.add(observer);
	}

	@Override
	public void deleteObserver(ITalkObserver observer) {
		observerlist.remove(observer);
		
	}
	// ���¹۲��ߵ���Ϣ
	@Override
	public void notifyObserver() {
		for (ITalkObserver iTalkObserver : observerlist) {
			iTalkObserver.updateTalk(this.msg);
		}
		
	}

	public String getMsg() {
		return msg;
	}

	// ��������Ȧ��Ϣ
	public void setMsg(String msg) {
		this.msg = msg;
		this.notifyObserver();
	}

	
}
