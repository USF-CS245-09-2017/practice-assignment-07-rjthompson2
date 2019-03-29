public class ArrayList<T> implements List<T>{
	public Object[] items = new Object[10];
	public int size = 0;
	public void add(T item){
		if(items.length == size){
			Object[] temp = new Object[2*size];
			for(int i = 0; i < size; i++){
				temp[i] = items[i];
			}
			items = temp;
		}
		items[size] = item;
		size ++;
	}
	public void add(int pos, T item){
		if(items.length == size){
			Object[] temp = new Object[2*size];
			for(int i = 0; i < size; i++){
				temp[i] = items[i];
			}
			items = temp;
		}
		T swap;
		size++;
		while(pos != size){
			swap = (T)items[pos];
			items[pos] = item;
			item = swap;
			pos++;
		}
	}
	public T get(int pos){
		return (T)items[pos];
	}
	public T remove(int pos){
		T item = (T)items[size-1];
		size --;
		return item;
	}
	public int size(){
		return size;
	}
}
