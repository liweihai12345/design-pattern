package pattern.memento;

/**
 *  负责人角色
 * @author liweihai
 *
 */
public class Caretaker {
	// 备忘录对象
	private Memento memento;
	public Memento getMemento(){
		return memento;
	}

	public void setMemento(Memento memento){
		this.memento=memento;
	}
}
