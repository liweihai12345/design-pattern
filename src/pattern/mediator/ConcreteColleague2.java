package pattern.mediator;

/**
 * ����ͬ����
 * @author liweihai
 *
 */
public class ConcreteColleague2 extends Colleague {

	// ���캯��
	public ConcreteColleague2(Mediator m) {
		super(m);
		
	}
	// ʵ�־����ж�����
	@Override
	public void action() {
		System.out.println("����ͬ��2���ж�������");
		
	}
	

}
