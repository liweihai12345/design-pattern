package pattern.visitor;

/**
 * ���������
 * @author liweihai
 *
 */
public interface Visitor {

	// ���Է�����Щ����
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
}
