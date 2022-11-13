package listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayLinkedListTest {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		List<Integer> linList = new LinkedList<>();
		final int range = 100000;
		
		long stTime = System.nanoTime();
		//ArrayList add
		for(int i=0;i<range;i++) {
			arrList.add(i);
		}
		long endTime = System.nanoTime();
		endTime -= stTime;
		System.out.println(endTime);
		
		stTime = System.nanoTime();
		for(int i=0;i<range;i++) {
			linList.add(i);
		}
		endTime = System.nanoTime();
		endTime -= stTime;
		System.out.println(endTime);
	}
}
