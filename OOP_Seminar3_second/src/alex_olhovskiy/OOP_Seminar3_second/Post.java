package alex_olhovskiy.OOP_Seminar3_second;

import java.util.HashMap;

public class Post {
	
	private int salary;
	private int postId;
	
	private HashMap<String,Integer>posts_id=new HashMap<>();
	{
		posts_id.put("fitter",1);
		posts_id.put("driver",2);
		posts_id.put("collector",3);
		posts_id.put("operator",4);
		posts_id.put("engineer",5);
	}

}
