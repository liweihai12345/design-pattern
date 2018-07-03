package pattern.visitor;

/**
 * 具体元素2
 * @author liweihai
 *
 */
public class ConcreteElement2 extends Element{

	// 接收操作
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	// 业务逻辑方法
	public void operation(){
		System.out.println("访问元素2");
	}

}
