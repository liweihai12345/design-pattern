package pattern.state;
/**
 * 具体状态1
 * @author liweihai
 *
 */
public class ConcreteState1 extends State {

	// 状态1的行为逻辑处理
	@Override
	public void handle() {
		System.out.println("行为1的逻辑处理");
		
	}

}
