package pattern.memento;

public class Client {

	public static void main(String[] args) {
		// ���巢����
		Originator org=new Originator();
		// ���帺����
		Caretaker car =new Caretaker();
		// ����һ������¼
		car.setMemento(org.createMemento());
		// �ظ�һ������¼
		org.restoreMemento(car.getMemento());
	}
}
