package pattern.state;

/**
 * ������ɫ
 * @author liweihai
 *
 */
public class Context {

	// ����״̬
	public static State STATE1 =new ConcreteState1();
	public static State STATE2 =new ConcreteState2();
	// ��ǰ״̬
	private State currentState;
	// ��ȡ��ǰ״̬
	public State getCurrentState(){
		return currentState;
	}
	// ���õ�ǰ״̬
	public void setCurrentState(State currentState){
		this.currentState=currentState;
		// ����״̬�еĻ���
		currentState.setContext(this);
		
	}
	// ��Ϊί��
	public void handle1(){
		// �л���״̬1
		this.setCurrentState(STATE1);
		this.currentState.handle();
	}
	// ��Ϊί��
	public void handle2(){
		// �л���״̬2
		this.setCurrentState(STATE2);
		this.currentState.handle();
	}
}
