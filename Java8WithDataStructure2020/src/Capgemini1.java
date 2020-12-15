import java.util.HashMap;

public class Capgemini1 {
	public static void main(String args[]) {
		
		HashMap<Object,Object> hashMap = new HashMap<Object,Object>();
		
		hashMap.put(0, 123);
		hashMap.put("0", 123);
		hashMap.put(null, 1213);
		hashMap.put("null", 1213);
		
		System.out.println(hashMap);
	}
}
