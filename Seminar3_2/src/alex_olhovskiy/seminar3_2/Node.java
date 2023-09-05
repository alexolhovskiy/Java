package alex_olhovskiy.seminar3_2;

public class Node {
	
	Node next;
	Node previous;
	int value;
	Node head;
	Node tail;
	int length;
	
	public Node Set(int n)
	{
		Node node=new Node();
		node.value=n;
		return node;
	}
	
	public void Add(Node node)
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
		Node node=head;
		while(node!=null)
		{
			System.out.print(node.value+" ");
			node=node.next;
		}
	}
	
	public void PrintPrev()
	{
		Node node=tail;
		while(node!=null)
		{
			System.out.print(node.value+" ");
			node=node.previous;
		}
	}
	
	public Node Pop()
	{
		Node node=head;
		if(head!=null)
		{
			if(head.next!=null)
			{
				head=head.next;
			}
			length--;
			return node;
		}
		return null;
	}
	
	public void Push(Node node)
	{
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			node.previous=tail;
			tail=node;
		}
		length++;
	}
	
	public Node PopBack()
	{
		Node node=tail;
		if(tail!=null)
		{
			if(tail.previous!=null)
			{
				tail=tail.previous;
				tail.next=null;
			}
			length--;
			return node;
		}
		return null;
	}
	
	public Node Find(int n)
	{
		int count=0;
		Node node=head;
		while(node!=null)
		{
			if(count==n)
			{
				return node;
			}
			count++;
			node=node.next;
		}
		return null;
	}
	
	public void Insert(Node node, int n)
	{
		Node current;
		if(n<length)
		{
			if(n==0)
			{
				Add(node);
			}
			else
			{
				current=Find(n-1);
				node.next=current.next;
				current.next=node;
				node.next.previous=node;
				node.previous=current;
				length++;
			}
		}
		else
		{
			if(n==length)
			{
				Push(node);
			}
		}
	}
	
	public void Delete(int n)
	{
		Node current;
		Node node;
		if((n>0)&&(n<length))
		{
			current=Find(n-1);
//			node=current.next;
//			node=node.next;
//			current.next=node;
//			node.previous=current;
			current.next=current.next.next;
			current.next.next.previous=current;//!!!ERROR
			length--;
		}
	}
	
	public Node FindDelete(int n)
	{
		Node node=Find(n);
		Delete(n);
		return node;
	}
	
	public void Revert()
	{
		Node node=head;
		Node temp=head;
		Node next=head.next;
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
