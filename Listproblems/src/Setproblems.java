import java.util.Set;
import java.util.TreeSet;

public class Setproblems {

	public static void main(String[] args) {
		
		//Creating HashSet
		//Set<Integer>set =new HashSet<Integer>();
		
		//Creating LinkedHashSet
		
		//Set<Integer> set=new LinkedHashSet<Integer>();
		
		//creating treeSet
		Set<Integer> set=new TreeSet<Integer>();			//maintain sorted order
		
		set.add(50);
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(30);
		set.add(40);
		set.add(90);
		set.add(80);
		
		System.out.println("Setelemnts are:"+set);
	}

}
