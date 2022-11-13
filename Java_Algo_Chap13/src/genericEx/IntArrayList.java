package genericEx;

import java.util.Arrays;

public class IntArrayList {
	private int[] array = new int[10];
	private int index = 0;
	
	public void add(int value) {
		this.array[index++] = value;
	}
	
	public int getValue(int index) {
		return this.array[index];
	}
	
	public int size() {
		return this.array.length;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
