package pattern.observer.demo;

/**
 * 朋友圈信息 具体观察者
 * @author liweihai
 *
 */
public class ConcreteTalkObserver implements ITalkObserver {

	private String name;
	
	public ConcreteTalkObserver(String name) {
		super();
		this.name = name;
	}

	// 观察者收到消息
	@Override
	public void updateTalk(String msg) {
		
		System.out.println(this.name +" 收到一条朋友信息"+ msg);
	}

}
