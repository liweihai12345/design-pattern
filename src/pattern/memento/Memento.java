package pattern.memento;

/**
 * 备忘录角色
 * @author liweihai
 *
 */
public class Memento {
	
	// 发起人的内部状态
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	// 构造函数传递参数
	public Memento(String state){
		this.state= state;
	}
}
