package pattern.mediator;

/**
 * 抽象同事类
 * @author liweihai
 *
 */
public abstract class Colleague {
	
	// 抽象中介者
	private Mediator mediator;
	
	//构造函数
	public Colleague(Mediator m){
		this.mediator=m;
	}
	// getter setter方法
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator(){
		return mediator;
		
	}
	// 抽象行为方法，子类实现
	public abstract void action();
	// 业务方法，调用此方法改变对象的内部状态
	public void change(){
		this.mediator.colleagueChanged(this);
	}
		
}
