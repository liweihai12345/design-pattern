package pattern.visitor.demo;

/**
 * ҩƷ������
 * @author liweihai
 *
 */
public abstract class Medicine {
	private String name;// ҩ��
	private Double price;// �۸�
	public Medicine(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// ���շ�����
	public abstract void accept(IVisitor visitor);

}
