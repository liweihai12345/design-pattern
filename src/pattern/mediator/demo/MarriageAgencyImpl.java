package pattern.mediator.demo;

import java.util.ArrayList;
import java.util.List;
/**
 * �н����ʵ����
 * @author liweihai
 *
 */
public class MarriageAgencyImpl implements MarriageAgency {

	List<Man> mans= new ArrayList<>();// �л�Ա
	List<Woman> womans= new ArrayList<>();// Ů��Ա
	// ƥ��
	@Override
	public void pair(Person person) {
		if(person.getSex()==Sex.male){
			for(Woman w: womans){
				if(w.getAge()== person.getAge()){
					System.out.println(person.getName()+ " �� "+w.getName()+" ��Գɹ�");
					return;
				}
			}
		}else if(person.getSex()==Sex.female){
			for(Man m: mans){
				if(m.getAge()== person.getAge()){
					System.out.println(person.getName()+" �� "+m.getName()+" ��Գɹ�");
					return ;
				}
			}
		}
		System.out.println("û��Ϊ "+person.getName()+" �ҵ����ʵĶ���");
		
	}
	// ע���Ա
	@Override
	public void register(Person person) {
		if(person.getSex()==Sex.male){
			mans.add((Man) person);
		}else if(person.getSex()==Sex.female){
			womans.add((Woman) person);
		}
		
	}

}
