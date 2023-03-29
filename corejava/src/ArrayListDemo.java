import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(10.10);
		list.add("tops");
		list.add(null);
		list.add(true);
		list.add("t");
		list.add(10);
		System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(list.contains(10));
		System.out.println(list.get(2));
		System.out.println(list.lastIndexOf(10));
		System.out.println(list.isEmpty());
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.remove("tops"));
        System.out.println(list);
		System.out.println(list.set(3,100));
		System.out.println(list);
		System.out.println(list.size());
		
		ListIterator litr=list.listIterator();
		while(litr.hasNext())
		{
			litr.set(litr.next()+" tops");
		}
		 litr=list.listIterator();
		while(litr.hasNext())
		{
             System.out.println(litr.next());
		}
		
		System.out.println("Reverse Order");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
    }		
}
