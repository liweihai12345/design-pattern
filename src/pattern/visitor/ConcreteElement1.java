package pattern.visitor;

/**
 * ����Ԫ��1
 * @author liweihai
 *
 */
public class ConcreteElement1 extends Element {

	// ���ղ���
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	// ҵ���߼�����
	public void operation(){
		System.out.println("����Ԫ��1");
	}

}
