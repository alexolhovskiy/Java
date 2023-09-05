package alex_olhovskiy.seminar4;

public class Mapa {
	int length=16;
	Node[]nodes=new Node[length];
	
	public void Init()
	{
		for(int i=0;i<length;i++)
		{
			nodes[i]=new Node();
		}
	}
	
	
	public void Add(String k,String v)
	{
		//System.out.println(k+" "+v+" "+k.hashCode()%length);
		Node node=new Node();
		node.key=k;
		node.value=v;
		int my_code=Math.abs(k.hashCode()%length);
		nodes[my_code].Add(node);
//		if(nodes[my_code]==null)
//		{
//			nodes[my_code]=node;
//		}
//		else
//		{
//			nodes[my_code].Add(node);
//		}
	}
	
	public String Get(String k)
	{
		int my_code=Math.abs(k.hashCode()%length);
//		if(nodes[my_code]==null)
//		{
//			return null;
//		}
//		else
//		{
//			return nodes[my_code].Pop().value;
//		}
		return nodes[my_code].Pop(k).value;
	}
}
