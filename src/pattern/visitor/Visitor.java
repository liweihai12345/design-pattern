package pattern.visitor;

/**
 * 抽象访问者
 * @author liweihai
 *
 */
public interface Visitor {

	// 可以访问那些对象
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
}
