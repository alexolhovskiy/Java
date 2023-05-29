package alex_olhovskiy.seminar3_ht;

public class OneWayNode {
	
	int length=0;
	int value;
	OneWayNode next;
	OneWayNode head;
	
	public void Add(int value)//add in begin
	{
		OneWayNode node=new OneWayNode();
		node.value=value;
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
		length++;
	}
	
	public OneWayNode Set(int n)
	{
		OneWayNode node=new OneWayNode();
		node.value=n;
		return node;
	}
	
	public void Add(OneWayNode node)//add in begin
	{
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
		length++;
	}
	
	public OneWayNode Pop()
	{
		OneWayNode node=head; 
		head=head.next;
		length--;
		return node;
	}
	
	public void Print()
	{
		OneWayNode node=head;
		while(node!=null)
		{
			System.out.print(node.value+" ");
			node=node.next;
		}
		System.out.println("\n");
	}
	
	public OneWayNode FindIndex(int n)//return OneWayNode by index
	{
		int count=0;
		OneWayNode node=head;
		if((n<length)&&(length>0))
		{
			while(node!=null)
			{
				if(n==count)
				{
					return node;
				}
				count++;
				node=node.next;
			}
		}
		return null;
	}
	
	public void PushInIndex(int i,OneWayNode node)//put OneWayNode in index
	{
		
		OneWayNode current;
		if(i==0)
		{
			Add(node);
		}
		else
		{
			current=FindIndex(i-1);
			if(current.next!=null)
			{
				node.next=current.next;
			}
			else
			{
				node.next=null;
			}
			current.next=node;
			length++;
		}
	}
	
	public OneWayNode PopFromIndex(int i)//return OneWayNode from index and delete it
	{
		if(i==0)
		{
			return Pop();
		}
		
		OneWayNode current=FindIndex(i-1);
		OneWayNode node=current.next;
		if(node.next!=null)
		{
			current.next=node.next;
		}
		length--;
		return node;
		
	}
	
	public void Revert_2()
	{
		for(int i=0;i<length/2;i++)
		{
			PushInIndex(length-1-i,PopFromIndex(i));
			PushInIndex(i,PopFromIndex(length-2-i));
		}
	}
	
	
	public void Revert(OneWayNode cur,OneWayNode prev)
	{
		if(cur.next==null)
		{
			head=cur;
		}
		else
		{
			Revert(cur.next,cur);
		}
		cur.next=prev;
		prev.next=null;
	}
	
	public void Revert()
	{
		if(head!=null&&head.next!=null)
		{
			OneWayNode temp=head;
			Revert(head.next,head);
			temp.next=null;
		}
	}

}
