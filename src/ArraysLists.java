import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysLists {
	
	HashMap<Emer, String> map = new HashMap<Emer, String>();
	
	public enum Emer {
		hajdar,
		emrush,
		xhimret
	}
	
	public ArraysLists() {
		map.put(Emer.hajdar, "Hajdar");
		map.put(Emer.emrush, "Emrush");
		map.put(Emer.xhimret, "Xhimret");
	}
	
	public static void ArraysExample() {
		String[] arr = new String[5];
		arr[0] = "2";
		arr[1] = "1";
		arr[2] = "4";
		arr[3] = "66";
		arr[4] = "124";		
		
 		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
	
	public static void ListsExample() {
		List<String> arr = new ArrayList<String>();
		arr.add("2");
		arr.add("1");
		arr.add("4");
		arr.add("66");
		arr.add("124");
		arr.add("111");
		
		for (int i = 0; i < arr.size(); ++i) {
			System.out.println(arr.get(i));
		}
	}
	
	public String MapExample(Emer emri) {		
		return map.get(emri);
	}
	
	public int mbledh(int a, int b) {
		return a + b;
	}
	
	public int count() {
		return map.size();
	}
}