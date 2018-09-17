package pattern.mediator;

/**
 * 抽象中介者
 * @author liweihai
 *
 */
public abstract class Mediator {
	// 中介者模式的业务逻辑方法
	public abstract void colleagueChanged(Colleague c);
}
