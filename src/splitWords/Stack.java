package splitWords;


public class Stack {
	public String[] s;
	public int size;
	public int top;

	public Stack(int maxSize) {
		this.size = maxSize;
		this.s = new String[size];
		this.top = -1; //initialize empty stack
	}

	public void push(String value) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		s[++top] = value;
		//x++: evaluates, then increaments and stores value
		//++x: increments, then evaluates and stores value

		//x = 0; 
		//y = array[x++]; -> get array[0]
		//y = array[++x]; -> get array[1]
	}

	public String peek() {
		if(isEmpty()) {
			//System.out.println("stack is empty");
			return "stack is empty";
		}
		return s[top];
	}

	public void pop() {
		if(!isEmpty()) {
			//System.out.println("stack is empty");
			top--;
			//return "stack is empty";
		}
	}

	public int size() {
		return (top + 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public void displayAsStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(s[i] + " ");
		}
		System.out.println("");
	}
	
	public void displayAsQueue() {
		for (int i = 0; i <= top; i++) {
			System.out.println(s[i] + " ");
		}
		System.out.println("");
	}
}