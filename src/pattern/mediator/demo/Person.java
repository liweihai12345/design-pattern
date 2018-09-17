package pattern.mediator.demo;

/**
 * �˵ĳ�����
 * @author liweihai
 *
 */
public abstract class Person {

	private String name;// ����
	private int age; //����
	private Sex sex; //�Ա�
	private int requestAge;// Ҫ��Է�����
	private MarriageAgency ma; // �����н�
	public Person(String name, int age, Sex sex, int requestAge,
			MarriageAgency ma) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.requestAge = requestAge;
		this.ma = ma;
		ma.register(this);// ע���Ա
	}
	// ƥ���Լ�
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
