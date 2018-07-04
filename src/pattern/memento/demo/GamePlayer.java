package pattern.memento.demo;
/**
 * 备份游戏叫色信息+行为
 * @author liweihai
 *
 */
public class GamePlayer {

	private String name;// 角色名
	private int hp;// 血量
	private int mp;// 精气值
	private int level;// 级别
	public GamePlayer(String name, int hp, int mp, int level) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
	}
	
	// 保存备份角色信息
	public GameBackup saveBackup(){
		System.out.println("保存游戏角色备份。。。。。");
		return new GameBackup(this.name,this.hp,this.mp,this.level);
	}
	// 回复角色星系
	public void resumePlayer(GameBackup backup){
		this.name=backup.getName();
		this.hp= backup.getHp();
		this.mp=backup.getMp();
		this.level= backup.getLevel();
	}
	// 打怪
	public void KillBoss(){
		System.out.println(this.name+ "开始打Boss");
		while(this.hp>0){
			System.out.println(this.name+ "使用技能攻击Boss");
			this.mp-=30;
			System.out.println("剩余血量："+this.hp+"  剩余精气量："+this.mp);
			System.out.println("Boss 攻击 "+ this.name);
			this.hp-=50;
		}
		if(this.hp<=0){
			System.out.println("游戏角色 "+this.name+" 被Boss杀死，需要重新来过！");
		}
	}
	public String toString(){
		return "游戏角色名："+this.name+"\n血量值："+this.hp+"\n精气值："+this.mp+"\n等级:"+this.level;
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
