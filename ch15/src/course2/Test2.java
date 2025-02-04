package course2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//항상 데이터를 추가하는 모든 경우가 ArrayList가 LinkedList 보다 느림
public class Test2 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        // Test ArrayList vs LinkedList
        long startTime;
        long endTime;
        
        //맨앞에 계속 추가
        startTime = System.nanoTime();      
        for (int i = 0; i < 300000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        
        // LinkedList (빠르다)
        startTime = System.nanoTime();      
        for (int i = 0; i < 300000; i++) {
            linkedList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        
        
        //뒤에 추가
        startTime = System.nanoTime();      
        for (int i = 0; i < 500000; i++) {
            arrayList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        
        // LinkedList
        startTime = System.nanoTime();      
        for (int i = 0; i < 500000; i++) {
            linkedList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
	}

}
