package course3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		//Key 중복 허용 X 중복되면 value를 덮어 쓴다.
		Map<String,Integer> map = new HashMap<>();
		map.put("aaa", 50);
		map.put("aaa", 50);
		map.put("aaa", 60);
		map.put("bbb", 50);
		map.put("ccc", 70);
		map.put("ddd", 80);
		
		System.out.println(map.size());
		System.out.println(map.get("aaa"));
		System.out.println(map.containsKey("aaa"));
		
		Set<String> keySet = map.keySet(); //순서 x
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext()) {
			String k  = itr.next();
			Integer v  = map.get(k);
			System.out.println(k + " " + v);
		}
	}

}
