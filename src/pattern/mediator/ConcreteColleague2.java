package pattern.mediator;

/**
 * 具体同事类
 * @author liweihai
 *
 */
public class ConcreteColleague2 extends Colleague {

	// 构造函数
	public ConcreteColleague2(Mediator m) {
		super(m);
		
	}
	// 实现具体行动方法
	@Override
	public void action() {
		System.out.println("这是同事2的行动方法！");
		
	}
	

}
