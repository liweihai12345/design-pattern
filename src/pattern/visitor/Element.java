package pattern.visitor;

/**
 * 抽象元素角色
 * @author liweihai
 *
 */
public abstract class Element {

	// 接收操作
	public abstract void accept(Visitor v);
}
