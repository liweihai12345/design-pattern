package pattern.memento;

/**
 * ����¼��ɫ
 * @author liweihai
 *
 */
public class Memento {
	
	// �����˵��ڲ�״̬
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	// ���캯�����ݲ���
	public Memento(String state){
		this.state= state;
	}
}
