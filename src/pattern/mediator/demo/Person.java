package pattern.mediator.demo;

/**
 * 人的抽象类
 * @author liweihai
 *
 */
public abstract class Person {

	private String name;// 姓名
	private int age; //年龄
	private Sex sex; //性别
	private int requestAge;// 要求对方年龄
	private MarriageAgency ma; // 婚姻中介
	public Person(String name, int age, Sex sex, int requestAge,
			MarriageAgency ma) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.requestAge = requestAge;
		this.ma = ma;
		ma.register(this);// 注册会员
	}
	// 匹配自己
	public void findPartner(){
		ma.pair(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public int getRequestAge() {
		return requestAge;
	}
	public void setRequestAge(int requestAge) {
		this.requestAge = requestAge;
	}
	public MarriageAgency getMa() {
		return ma;
	}
	public void setMa(MarriageAgency ma) {
		this.ma = ma;
	}

}
