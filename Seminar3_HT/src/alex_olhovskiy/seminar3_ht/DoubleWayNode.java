package alex_olhovskiy.seminar3_ht;

public class DoubleWayNode {
	
	DoubleWayNode next;
	DoubleWayNode previous;
	int value;
	DoubleWayNode head;
	DoubleWayNode tail;
	int length;
	
	public DoubleWayNode Set(int n)
	{
		DoubleWayNode node=new DoubleWayNode();
		node.value=n;
		return node;
	}
	
	public void Add(DoubleWayNode node)
	{
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			node.next=head;
			head.previous=node;
			head=node;
		}
		length++;
	}
	
	public void Print()
	{
		DoubleWayNode node=head;
		while(node!=null)
		{
			System.out.print(node.value+" ");
			node=node.next;
		}
		System.out.println("\n");
	}
	
	public void Revert()
	{
		DoubleWayNode node=head;
		DoubleWayNode temp=head;
		DoubleWayNode next=head.next;
		head.next=null;
		tail=head;
		while(next!=null)
		{
			node.previous=next;
			temp=next;
			next=next.next;
			temp.next=node;
			node=temp;
		}
		head=node;
	}

}
