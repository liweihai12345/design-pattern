package pattern.memento;

/**
 *  �����˽�ɫ
 * @author liweihai
 *
 */
public class Caretaker {
	// ����¼����
	private Memento memento;
	public Memento getMemento(){
		return memento;
	}

	public void setMemento(Memento memento){
		this.memento=memento;
	}
}
