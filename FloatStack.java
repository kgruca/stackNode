
public class FloatStack extends Stack{
	
	public static final float STACK_EMPTY = Float.MIN_VALUE;
	
	public void pushFloat(float x) {
		if(x == STACK_EMPTY)
			return;
		
		FloatNode fp = new FloatNode(x);
		
		super.push(fp);
	}
	
	public float popFloat() {
		FloatNode fp = (FloatNode)pop();
		if(fp == null)
			return STACK_EMPTY;
		else
			return fp.getData();
	}

}
