package pattern.observer.demo;

/**
 * 朋友圈抽象观察者
 * @author liweihai
 *
 */
public interface ITalkObserver {

	// 更新朋友圈信息
	public void updateTalk(String msg);
}
