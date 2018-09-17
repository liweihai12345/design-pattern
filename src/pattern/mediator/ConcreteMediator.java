package pattern.mediator;

/**
 * 具体中介者实现类
 * @author liweihai
 *
 */
public class ConcreteMediator extends Mediator {

	// 同事类1
	private ConcreteColleague1 colleague1;
	// 同事类2
	private ConcreteColleague2 colleague2;
	// 中介者模式业务逻辑方法
	@Override
	public void colleagueChanged(Colleague c){
		colleague1.action();
		colleague2.action();
	}
	
	// 工厂方法，创建同事类
	public void createConcreteMediator(){
		colleague1 = new ConcreteColleague1(this);
		colleague2 =new ConcreteColleague2(this);
	}
	// 获取同事对象
	public ConcreteColleague1 getC1(){
		return colleague1;
	}
	// 获取同事对象
	public ConcreteColleague2 getC2(){
		return colleague2;
	}

}
