package box;

public interface ArregloDeComparables<T extends Comparable<T>> extends Iterable<T> {
	public void add(T elem);
	public void delete();
	public T get();
}
