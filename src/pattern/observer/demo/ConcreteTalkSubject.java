package pattern.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 朋友圈信息 主题具体类
 * @author liweihai
 *
 */
public class ConcreteTalkSubject implements ITalkSubject {

	// 观察者集合
	private List<ITalkObserver> observerlist= new ArrayList<>();
	// 朋友圈消息
	private String msg;
	@Override
	public void registerObserver(ITalkObserver observer) {
		observerlist.add(observer);
	}

	@Override
	public void deleteObserver(ITalkObserver observer) {
		observerlist.remove(observer);
		
	}
	// 更新观察者的消息
	@Override
	public void notifyObserver() {
		for (ITalkObserver iTalkObserver : observerlist) {
			iTalkObserver.updateTalk(this.msg);
		}
		
	}

	public String getMsg() {
		return msg;
	}

	// 设置朋友圈消息
	public void setMsg(String msg) {
		this.msg = msg;
		this.notifyObserver();
	}

	
}
