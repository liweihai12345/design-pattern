package pattern.visitor;

/**
 * ����Ԫ��2
 * @author liweihai
 *
 */
public class ConcreteElement2 extends Element{

	// ���ղ���
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	// ҵ���߼�����
	public void operation(){
		System.out.println("����Ԫ��2");
	}

}
