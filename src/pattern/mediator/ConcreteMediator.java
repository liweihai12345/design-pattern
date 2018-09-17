package pattern.mediator;

/**
 * �����н���ʵ����
 * @author liweihai
 *
 */
public class ConcreteMediator extends Mediator {

	// ͬ����1
	private ConcreteColleague1 colleague1;
	// ͬ����2
	private ConcreteColleague2 colleague2;
	// �н���ģʽҵ���߼�����
	@Override
	public void colleagueChanged(Colleague c){
		colleague1.action();
		colleague2.action();
	}
	
	// ��������������ͬ����
	public void createConcreteMediator(){
		colleague1 = new ConcreteColleague1(this);
		colleague2 =new ConcreteColleague2(this);
	}
	// ��ȡͬ�¶���
	public ConcreteColleague1 getC1(){
		return colleague1;
	}
	// ��ȡͬ�¶���
	public ConcreteColleague2 getC2(){
		return colleague2;
	}

}
