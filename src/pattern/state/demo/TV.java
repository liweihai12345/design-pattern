package pattern.state.demo;

/**
 * 电视
 * @author liweihai
 *
 */
public class TV {

	// 电视可以看的频道
	public final static Channel CCTV1 = new CCTV1();
	public final static Channel CCTV2 = new CCTV2();
	public final static Channel CCTV3 = new CCTV3();
	public final static Channel CCTV4 = new CCTV4();
	// 当前频道
	public Channel channel;
	// 设置频道
	public void setChannel(Channel channel){
		this.channel=channel;
	}
	//播放cctv1频道
	public void disCCTV1(){
		this.setChannel(CCTV1);
		this.channel.display();
	}
	// 播放cctv2频道
	public void disCCTV2(){
		this.setChannel(CCTV2);
		this.channel.display();
	}
	// 播放cctv3频道
	public void disCCTV3(){
		this.setChannel(CCTV3);
		this.channel.display();
	}
	// 播放cctv4频道
	public void disCCTV4(){
		this.setChannel(CCTV4);
		this.channel.display();
	}
}
