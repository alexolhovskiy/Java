package alex_olhovskiy.seminar4;


public class Node {
	Node next;
	Node head;
	int length;
	String value;
	String key; 
	
	public void Add(Node node)//add in begin
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
	
	public Node Pop()
	{
		if(head!=null)
		{
			Node node=head; 
			head=head.next;
			length--;
			return node;
		}
		else
		{
			return null;
		}
	}
	
	public boolean IsEmpty()
	{
		if(head!=null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public Node Find(String key)
	{
		Node node=head;
		while(node!=null)
		{
			if(node.key==key)
			{
				return node;
			}
			node=node.next;
		}
		return null;
	}
	
	public Node Pop(String key)//return node from index and delete it
	{
		if(head!=null)
		{
			Node current=head;
			Node next=current.next;
			while(next!=null)
			{
				if(next.key==key)
				{
					if(next.next!=null)
					{
						current.next=next.next;
					}
					length--;
					return next;
				}
				current=next;
				next=next.next;
			}
		}
		return null;
	}
	
	public void Print()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.print(node.value+" ");
			node=node.next;
		}
	}
	
}
