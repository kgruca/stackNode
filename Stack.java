
public class Stack {
	
	private StackNode top;
	
	public Stack() {
		top = null;
	}
	
	public void push(StackNode newNode) {
		if(newNode == null)
			return;
		newNode.next = top;
		top = newNode;
	}
	
	public StackNode pop() {
		StackNode temp;
		
		temp = top;
		
		if(top != null) {
			top = top.next;
			temp.next = null;
		}
		return temp;
	}
	
	public void showStack() {
		StackNode p;
		
		for(p = top; p != null; p = p.next)
			p.show();
	}

}
