package pattern.visitor.demo;

/**
 * 药品抽象类
 * @author liweihai
 *
 */
public abstract class Medicine {
	private String name;// 药名
	private Double price;// 价格
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
	
	// 接收访问者
	public abstract void accept(IVisitor visitor);

}
