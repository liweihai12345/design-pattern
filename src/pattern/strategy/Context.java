package pattern.strategy;

/**
 * ������ɫ��
 * @author liweihai
 *
 */
public class Context {
	private Strategy strategy= null;
	public Context(Strategy  strategy){
		this.strategy=strategy;
	}
	// ���ò��Է���
	public void contextInterface(){
		this.strategy.strategyInterface();
	}

}
