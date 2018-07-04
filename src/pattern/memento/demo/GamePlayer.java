package pattern.memento.demo;
/**
 * ������Ϸ��ɫ��Ϣ+��Ϊ
 * @author liweihai
 *
 */
public class GamePlayer {

	private String name;// ��ɫ��
	private int hp;// Ѫ��
	private int mp;// ����ֵ
	private int level;// ����
	public GamePlayer(String name, int hp, int mp, int level) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
	}
	
	// ���汸�ݽ�ɫ��Ϣ
	public GameBackup saveBackup(){
		System.out.println("������Ϸ��ɫ���ݡ���������");
		return new GameBackup(this.name,this.hp,this.mp,this.level);
	}
	// �ظ���ɫ��ϵ
	public void resumePlayer(GameBackup backup){
		this.name=backup.getName();
		this.hp= backup.getHp();
		this.mp=backup.getMp();
		this.level= backup.getLevel();
	}
	// ���
	public void KillBoss(){
		System.out.println(this.name+ "��ʼ��Boss");
		while(this.hp>0){
			System.out.println(this.name+ "ʹ�ü��ܹ���Boss");
			this.mp-=30;
			System.out.println("ʣ��Ѫ����"+this.hp+"  ʣ�ྫ������"+this.mp);
			System.out.println("Boss ���� "+ this.name);
			this.hp-=50;
		}
		if(this.hp<=0){
			System.out.println("��Ϸ��ɫ "+this.name+" ��Bossɱ������Ҫ����������");
		}
	}
	public String toString(){
		return "��Ϸ��ɫ����"+this.name+"\nѪ��ֵ��"+this.hp+"\n����ֵ��"+this.mp+"\n�ȼ�:"+this.level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
