package pattern.mediator.demo;

/**
 * 婚介 中介
 * @author liweihai
 *
 */
public interface MarriageAgency {

	void pair(Person person);// 为person配对
	void register(Person person);// 注册会员
	
	
}
