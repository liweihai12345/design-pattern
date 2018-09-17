package pattern.mediator;

/**
 * ����ͬ����
 * @author liweihai
 *
 */
public abstract class Colleague {
	
	// �����н���
	private Mediator mediator;
	
	//���캯��
	public Colleague(Mediator m){
		this.mediator=m;
	}
	// getter setter����
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator(){
		return mediator;
		
	}
	// ������Ϊ����������ʵ��
	public abstract void action();
	// ҵ�񷽷������ô˷����ı������ڲ�״̬
	public void change(){
		this.mediator.colleagueChanged(this);
	}
		
}
