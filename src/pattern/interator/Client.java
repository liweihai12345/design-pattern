package pattern.interator;

public class Client {

	public static void main(String[] args) {
		Aggregate agg= new ConcreteAggregate();
		agg.add("����");
		agg.add("����");
		agg.add("����");
		Iterator iterator= agg.creatIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
