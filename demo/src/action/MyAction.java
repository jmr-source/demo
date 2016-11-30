package action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jet.JET2Context;
import org.jmr.core.JmrActionSupport;

public class MyAction extends JmrActionSupport {

	public void execute(JET2Context context) {
		int a = 6;
		String b = "str";
		Double c = 3.14;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		context.setVariable("a", a);
		context.setVariable("b", b);
		context.setSessionVariable("c", c);
		context.setSessionVariable("list", list);
	}

}
