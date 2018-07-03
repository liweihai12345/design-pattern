package pattern.visitor;

/**
 *  ��������߽�ɫ
 * @author liweihai
 *
 */
public class ConcreteVisitor implements Visitor {

	// ����Ԫ��1
	@Override
	public void visit(ConcreteElement1 el1) {
		el1.operation();
		
	}

	// ����Ԫ��2
	@Override
	public void visit(ConcreteElement2 el2) {
		el2.operation();
		
	}

}
