package pattern.interpreter.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * �洢��������������ֵ��������ɫ��
 * @author liweihai
 *
 */
public class Variables {

	Map<Variable,Integer> v=new HashMap<Variable,Integer>();
	public void put(Variable variable,int value){
		v.put(variable,value);
	}
	public int get(Variable variable){
		return v.get(variable);
	}
}
