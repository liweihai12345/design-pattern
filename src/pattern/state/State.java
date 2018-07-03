package pattern.state;
/**
 * ����״̬��
 * @author liweihai
 *
 */
public abstract class State {

	// ����һ��������ɫ
	protected Context context;
	
	// ���û���
	public void setContext(Context ctx){
		this.context=ctx;
	}
	
	// ������Ϊ
	public abstract void handle();
}
