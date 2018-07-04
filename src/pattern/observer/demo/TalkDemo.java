package pattern.observer.demo;

public class TalkDemo {

	public static void main(String[] args) {
		// 创建主题对象
		ConcreteTalkSubject talkSubject= new ConcreteTalkSubject();
		// 创建观察者
		ITalkObserver talker1= new ConcreteTalkObserver("张三");
		ITalkObserver talker2 = new ConcreteTalkObserver("李四");
		// 添加观察者
		talkSubject.registerObserver(talker1);
		talkSubject.registerObserver(talker2);
		// 为主题设置消息
		talkSubject.setMsg("今天看到一位老大爷摔倒在地上，没有人去扶老大爷。");
	}
}
