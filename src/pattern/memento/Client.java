package pattern.memento;

public class Client {

	public static void main(String[] args) {
		// 定义发起人
		Originator org=new Originator();
		// 定义负责人
		Caretaker car =new Caretaker();
		// 创建一个备忘录
		car.setMemento(org.createMemento());
		// 回复一个备忘录
		org.restoreMemento(car.getMemento());
	}
}
