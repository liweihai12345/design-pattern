package pattern.mediator.demo;

import java.util.ArrayList;
import java.util.List;
/**
 * 中介具体实现类
 * @author liweihai
 *
 */
public class MarriageAgencyImpl implements MarriageAgency {

	List<Man> mans= new ArrayList<>();// 男会员
	List<Woman> womans= new ArrayList<>();// 女会员
	// 匹配
	@Override
	public void pair(Person person) {
		if(person.getSex()==Sex.male){
			for(Woman w: womans){
				if(w.getAge()== person.getAge()){
					System.out.println(person.getName()+ " 和 "+w.getName()+" 配对成功");
					return;
				}
			}
		}else if(person.getSex()==Sex.female){
			for(Man m: mans){
				if(m.getAge()== person.getAge()){
					System.out.println(person.getName()+" 和 "+m.getName()+" 配对成功");
					return ;
				}
			}
		}
		System.out.println("没有为 "+person.getName()+" 找到合适的对象");
		
	}
	// 注册会员
	@Override
	public void register(Person person) {
		if(person.getSex()==Sex.male){
			mans.add((Man) person);
		}else if(person.getSex()==Sex.female){
			womans.add((Woman) person);
		}
		
	}

}
