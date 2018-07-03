package pattern.state.demo;

/**
 * ����
 * @author liweihai
 *
 */
public class TV {

	// ���ӿ��Կ���Ƶ��
	public final static Channel CCTV1 = new CCTV1();
	public final static Channel CCTV2 = new CCTV2();
	public final static Channel CCTV3 = new CCTV3();
	public final static Channel CCTV4 = new CCTV4();
	// ��ǰƵ��
	public Channel channel;
	// ����Ƶ��
	public void setChannel(Channel channel){
		this.channel=channel;
	}
	//����cctv1Ƶ��
	public void disCCTV1(){
		this.setChannel(CCTV1);
		this.channel.display();
	}
	// ����cctv2Ƶ��
	public void disCCTV2(){
		this.setChannel(CCTV2);
		this.channel.display();
	}
	// ����cctv3Ƶ��
	public void disCCTV3(){
		this.setChannel(CCTV3);
		this.channel.display();
	}
	// ����cctv4Ƶ��
	public void disCCTV4(){
		this.setChannel(CCTV4);
		this.channel.display();
	}
}
