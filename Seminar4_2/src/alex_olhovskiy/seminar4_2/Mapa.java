package alex_olhovskiy.seminar4_2;

public class Mapa {
	
	int size=16;
	Node[]nodes=new Node[size];
	
	public int Put(Integer k,int v)
	{
		int index=getIndex(k);
		Node node=nodes[index];
		while(node!=null)
		{
			if(node.key==k)
			{
				int temp=node.value;
				node.value=v;
				return temp;
			}
			node=node.next;
		}
		Node newNode=new Node(k,v);
		newNode.next=nodes[index];
		nodes[index]=newNode;
		return 0;
	}
	
	public int Get(Integer k)
	{
		int index=getIndex(k);
		Node node=nodes[index];
		while(node!=null)
		{
			if(node.key==k)
			{
				return node.value;
			}
			node=node.next;
		}
		return 0;
	}
	
	public int Replace(Integer k,int v)
	{
		int index=getIndex(k);
		Node node=nodes[index];
		while(node!=null)
		{
			if(node.key==k)
			{
				int temp=node.value;
				node.value=v;
				return temp;
			}
			node=node.next;
		}
		return -1;
	}
	
	public int Remove(Integer k)
	{
		int index=getIndex(k);
		int temp=0;
		
		if(nodes[index].key==k)
		{
			temp=nodes[index].value;
			nodes[index]=nodes[index].next;
			return temp;
		}
		Node node=nodes[index];
		Node next=node;
		while(next!=null)
		{
			if(next.key==k)
			{
				temp=next.value;
				node.next=next.next;
				next=node;
				return temp;
			}
			node=next;
			next=next.next;
		}
		return 0;
	}
	
	
	public int Size()
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			Node node=nodes[i];
			while(node!=null)
			{
				count++;
				node=node.next;
			}
		}
		return count;
	}
	
	public boolean containsKey(Integer k)
	{
		for(int i=0;i<size;i++)
		{
			Node node=nodes[i];
			while(node!=null)
			{
				if(node.key==k)
				{
					return true;
				}
				node=node.next;
			}
		}
		return false;
	}
	
	public boolean containsValue(int v)
	{
		for(int i=0;i<size;i++)
		{
			Node node=nodes[i];
			while(node!=null)
			{
				if(node.value==v)
				{
					return true;
				}
				node=node.next;
			}
		}
		return false;
	}
	
	public void Print()
	{
		for(int i=0;i<size;i++)
		{
			Node node=nodes[i];
			while(node!=null)
			{
				System.out.print("["+node.key+":"+node.value+"] ");
				node=node.next;
			}
		}
	}
	
	private int getIndex(Integer k)
	{
		return Math.abs(k.hashCode())%size;
	}

}
