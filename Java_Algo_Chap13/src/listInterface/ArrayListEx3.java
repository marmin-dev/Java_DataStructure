package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListEx3 {
	public static void main(String[] args) {
		List objL = new ArrayList<>();
		for(int i = 65;i<91;i++) {
			objL.add((char)i);
		}
		Iterator iterator = objL.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		objL.remove(2);
		iterator = objL.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		boolean con = objL.contains('F');
		System.out.println(con);
		
	}
	
}
