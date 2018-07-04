package pattern.observer.demo;

/**
 * ����Ȧ��Ϣ ����۲���
 * @author liweihai
 *
 */
public class ConcreteTalkObserver implements ITalkObserver {

	private String name;
	
	public ConcreteTalkObserver(String name) {
		super();
		this.name = name;
	}

	// �۲����յ���Ϣ
	@Override
	public void updateTalk(String msg) {
		
		System.out.println(this.name +" �յ�һ��������Ϣ"+ msg);
	}

}
