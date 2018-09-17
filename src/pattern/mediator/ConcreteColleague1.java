package pattern.mediator;

/**
 * 具体同事类
 * @author liweihai
 *
 */
public class ConcreteColleague1 extends Colleague {
	// 构造函数
	public ConcreteColleague1(Mediator m) {
		super(m);
		
	}
	// 实现具体行动方法
	public void action(){
		System.out.println("这是同事1的具体行动方法！");
	}

}
