package ch13.prac02;

public class Container<T> {
	private T t;

	public T get() {
		System.out.println(t);
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
