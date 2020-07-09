package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] t;
	public ArrayList() {
		t = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return t[loc];
	}
	
	public void add(T val) {
		Object[] num = new Object[t.length+1];
		num[num.length-1] = val;
		for (int i = 0; i < t.length; i++) {
			num[i] = t[i];
		}
		t = (T[]) num;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		Object[] num = new Object[t.length+1];
		for (int i = 0; i < num.length; i++) {
			if(i<loc) {
				num[i] = t[i];
			}
			else if(i>loc) {
				num[i] = t[i-1];
			}
			else {
				num[i] = val;
			}
		}
		t = (T[]) num;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		t[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		Object[] num = new Object[t.length-1];
		for (int i = 0; i < t.length; i++) {
			if(i<loc) {
				num[i] = t[i];
			}
			else if(i>loc) {
				num[i-1] = t[i];
			}
			else {
				continue;
			}
		}
		t = (T[]) num;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < t.length; i++) {
			if(t[i]==val) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return t.length;
	}
}