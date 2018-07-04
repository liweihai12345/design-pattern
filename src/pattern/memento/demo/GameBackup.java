package pattern.memento.demo;
/**
 * 存储备份角色/ 副本
 * @author liweihai
 *
 */
public class GameBackup {
	private String name;
	private int hp;
	private int mp;
	private int level;
	public GameBackup(String name, int hp, int mp, int level) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
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
