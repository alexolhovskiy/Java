package alex_olhovskiy.seminar3;

public class Node {
	
	int length=0;
	int value;
	Node next;
	Node head;
	
	public void Add(int value)//add in begin
	{
		Node node=new Node();
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
		Node node=head; 
		head=head.next;
		length--;
		return node;
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
	
	public Node Find(int value)
	{
		Node node=head;
		while(node!=null)
		{
			if(node.value==value)
			{
				return node;
			}
			node=node.next;
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
	
	public Node FindLust()
	{
		Node node=head;
		if(length>0)
		{
			while(node.next!=null)
			{
				node=node.next;
			}
			return node;
		}
		else
		{
			return null;
		}
	}
	
	public void Push(int value)//add in end
	{
		Node node=new Node();
		Node currentNode=FindLust();
		if(currentNode!=null)
		{
			currentNode.next=node;
		}
		length++;
	}
	
	public void Push(Node node)//add in end
	{
		Node currentNode=FindLust();
		if(currentNode!=null)
		{
			currentNode.next=node;
		}
		length++;
	}
	
	public Node BackDel()
	{
		int temp=0;
		
		Node currentNode=FindLust();
		Node node=head;
		if(currentNode!=null)
		{
			temp=currentNode.value;
			while(node.next.value!=temp)
			{
				node=node.next;
			}
			node.next=null;
			length--;
			return currentNode; 
		}
		else
		{
			return null;
		}
	}
	
	public void Sort()
	{
		Node node=head;
		Node next=node.next;
		Node previous=head;
		if(head.value>next.value)
		{
			head.next=next.next;
			next.next=head;
			head=next;
			node=head;
			previous=head;
			next=head.next;
		}
		while(next!=null)
		{
			if(node.value>next.value)
			{
				node.next=next.next;
				next.next=node;
				previous.next=next;
				node=next;
				next=node.next;
				Sort();
			}
			previous=node;
			node=next;
			next=next.next;
		}
	}
	
	public Node FindIndex(int n)//return node by index
	{
		int count=0;
		Node node=head;
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
	
	public void PushInIndex(int i,Node node)//put node in index
	{
		
		Node current;
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
	
	public Node PopFromIndex(int i)//return node from index and delete it
	{
		if(i==0)
		{
			return Pop();
		}
		
		Node current=FindIndex(i-1);
		Node node=current.next;
		if(node.next!=null)
		{
			current.next=node.next;
		}
		length--;
		return node;
		
	}
	
	
	public void Reverse()
	{
		for(int i=0;i<length/2;i++)
		{
			PushInIndex(length-1-i,PopFromIndex(i));
			PushInIndex(i,PopFromIndex(length-2-i));
		}
	}
	
	
	public void Revert(Node cur,Node prev)
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
			Node temp=head;
			Revert(head.next,head);
			temp.next=null;
		}
	}
}
