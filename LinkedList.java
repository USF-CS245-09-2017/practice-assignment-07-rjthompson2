public class LinkedList<T> implements List<T>{
	public Node head = null;
	public int size = 0;
	public class Node{
		T data;
		Node next;
		Node(T d){
			data = d;
			next = null;
		}
	}
	public void add(T item){
		Node new_node = new Node(item); 
		new_node.next = head;
		head = new_node;
		size++;
	}
	public void add(int pos, T item){
		Node new_node = new Node(item);
		Node last; 
		if(pos == 0){
			add(item);
		}else{
			last = head;
			int counter = 0;
			while(counter != pos-1){
				last = last.next;
				counter++;
			}
			new_node.next = last.next;
			last.next = new_node;
			size++;
		}
	}
	public T get(int pos){
		Node node = head;
		for(int i = 0; i < pos; i++){
			node = node.next;
		}
		return node.data;
	}
	public T remove(int pos){
		T item;
		Node first = head;
		if(pos == 0){
			item = first.data;
			first.data = null;
			if (first.next != null){
				head = first.next;
				first.next = null;
			}
		}else{
			for(int i = 0; i < pos-1; i++){
				first = first.next;
			}
			Node temp = first.next;
			if(temp.next != null){
				Node last = temp.next;
				temp.next = null;
				first.next = last;
			}
			item = temp.data;
			temp.data = null;
		}
		size--;
		return item;
	}
	public int size(){
		return size;
	}
}