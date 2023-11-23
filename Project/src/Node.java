
public class Node <T>{
	
	public Node<T> next;
	public Contact data;
	public Event Data;
	
	public Node() {
		data=null;
		next=null;
	}
	
	public Node(Event val) {
		Data=val;
		next=null;
	}
	
	public Node(Contact val) {
		data=val;
		next=null;
	}
	//setters and getters
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Contact getdata() {
		return data;
	}
	
	public Event getData() {
		return Data;
	}

	public void setData(Contact data) {
		this.data = data;
	}

	public void setData(Event data) {
		Data = data;
	}
	
		
	}

/*
public class Node<T> {
	 public int key;  
	    public T data;  
	    public Node<T> left,right;  
	  
	    //node without left right  
	    public Node(int k,T val) {  
	        key=k;  
	        data=val;  
	        left=right=null;  
	    }  
	  
	    //node with left right  
	    public Node(T val, Node<T> l, Node<T> r,int k) {  
	        key=k;  
	        data=val;  
	        left=l;  
	        right=r;  
	    } 
	    public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getLeft() {
			return left;
		}

		public void setLeft(Node<T> left) {
			this.left = left;
		}

		public Node<T> getRight() {
			return right;
		}

		public void setRight(Node<T> right) {
			this.right = right;
		}

		 
	}
/*
