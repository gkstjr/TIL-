package Interface_form;

public interface List<E> {
	
	boolean add(E value);
	
	void add(int index, E value);
	
	E remove(int index);
	
	boolean remove(Object value);
	
	E get(int index);
	
	void set(int index, E value);
	
	boolean contains(Object value);
	
	int indexOf(Object value);
	
	int size();
	
	boolean isEmpty();
	
	public void clear();
	
	//더블 링크드 리스트도정리하기
	//연결 스트를 이용한 큐 구현해보기 LinkedList
	
}
