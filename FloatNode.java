import java.util.*;
import java.text.*;

public class FloatNode extends StackNode{
	
	private float data;
	
	public FloatNode(float x) {
		super();
		data = x;
	}
	
	public float getData() {
		return data;
	}
	
	public void show() {
		NumberFormat tidy = NumberFormat.getInstance(Locale.US);
		tidy.setMaximumFractionDigits(4);
		
		System.out.print("[" + tidy.format(data) + "] ");
 	}

}
