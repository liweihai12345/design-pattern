package pattern.mediator;

/**
 * ����ͬ����
 * @author liweihai
 *
 */
public class ConcreteColleague1 extends Colleague {
	// ���캯��
	public ConcreteColleague1(Mediator m) {
		super(m);
		
	}
	// ʵ�־����ж�����
	public void action(){
		System.out.println("����ͬ��1�ľ����ж�������");
	}

}
