package pattern.state;
/**
 * 抽象状态类
 * @author liweihai
 *
 */
public abstract class State {

	// 定义一个环境角色
	protected Context context;
	
	// 设置环境
	public void setContext(Context ctx){
		this.context=ctx;
	}
	
	// 抽象行为
	public abstract void handle();
}
