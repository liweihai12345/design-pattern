package pattern.state.demo;

public class TVDemo {

	public static void main(String[] args) {
		TV tv= new TV();
		// 换台
		tv.disCCTV3();
		System.out.println("进入广告时间，换台中");
		tv.disCCTV4();
		System.out.println("进入广告时间，换台中");
		tv.disCCTV1();
	}
}
