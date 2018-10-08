package pattern.interator.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// 定义一个集合，存放对话的内容
		ArrayList list =new ArrayList();
		list.add("你们的团伙已被我们全部捣毁，坦白从宽抗拒从严。所以希望你们能配合我们，这样我们或许帮你申请从轻处理。");
		list.add("警察同志。我保证完全配合你们。");
		list.add("你在毒贩团伙中担任什么角色");
		list.add("我主要负责联系买家和卖家");
		list.add("你们的货源主要从哪里来的？");
		list.add("主要是从Y过境外，具体的是谁我也不清楚，一般都是上面安排下来的。");
		list.add("你负责的毒品都销往了哪里");
		list.add("我们主要负责在ZZ地区销售，一般都是一些会所熟人来我们这里拿货。");
		list.add("说一下经常来你这里拿货人的姓名。");
		list.add("H姓 ，F姓，S姓 等等");
		// 遍历集合
		System.out.println("警察和罪犯的审讯对话如下：");
		show(list.iterator());
		
		
		
	}

	private static void show(Iterator iterator) {
		int i =0;
		while(iterator.hasNext()){
			if(i%2==0){
				System.out.println("警察说："+iterator.next());
			}else{
				System.out.println("XX罪犯说："+iterator.next());
			}
			i++;
		}
		
	}
}
