package pattern.memento;

/**
 * 发起人角色
 * @author liweihai
 *
 */
public class Originator {
	// 内部状态
	private String state="";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	// 创建备忘录模式
	public Memento createMemento(){
		return new Memento(this.state);
	}
	// 恢复一个备忘录
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
}
