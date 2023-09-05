package alex_olhovskiy.seminar4_ht;

import java.awt.Color;

class Node{
	int value;
	Color color;
	Node leftChild;
	Node rightChild;
	
	public String toString() {
		return "Node{"+"values"+value+",color"+color+"}";
	}
}

public class RedBlackTree {

	Node root;
	
	private boolean addNode(Node node, int value) {
		if(node.value==value)
		{
			return false;
		}
		else
		{
			if(node.value>value) 
			{
				if(node.leftChild!=null)
				{
					boolean result=addNode(node,node.leftChild.value);
					node.leftChild=rebalance(node.leftChild);
					return result;
				}
				else
				{
					node.leftChild=new Node();
					node.leftChild.color=Color.RED;
					node.leftChild.value=value;
					return true;
				}
			}
			else
			{
				if(node.rightChild!=null)
				{
					boolean result=addNode(node,node.rightChild.value);
					node.rightChild=rebalance(node.rightChild);
					return result;
				}
				else
				{
					node.rightChild=new Node();
					node.rightChild.color=Color.RED;
					node.rightChild.value=value;
					return true;
				}
			}
		}
	}
	
	private void colorSwap(Node node)
	{
		node.rightChild.color=Color.BLACK;
		node.leftChild.color=Color.BLACK;
		node.color=Color.RED;
	}
	
	private Node leftSwap(Node node)
	{
		Node leftChild=node.leftChild;
		Node betweenChild=leftChild.rightChild;
		leftChild.rightChild=node;
		node.leftChild=betweenChild;
		leftChild.color=node.color;
		node.color=Color.RED;
		return leftChild;
		
	}
	
	private Node rightSwap(Node node)
	{
		Node rightChild=node.rightChild;
		Node betweenChild=rightChild.leftChild;
		rightChild.leftChild=node;
		node.rightChild=betweenChild;
		rightChild.color=node.color;
		node.color=Color.RED;
		return rightChild;
		
	}
	
	private Node rebalance(Node node)
	{
		Node res=node;
		boolean needRebalance;
		do {
			needRebalance=false;
			if(res.rightChild!=null&&res.rightChild.color==Color.RED&&
					(res.leftChild==null||res.leftChild.color==Color.BLACK)) {
				needRebalance=true;
				res=rightSwap(res);
			}
			if(res.leftChild!=null&&res.leftChild.color==Color.RED&&
				res.leftChild.leftChild!=null&&res.leftChild.leftChild.color==Color.RED) {
				needRebalance=true;
				res=leftSwap(res);
			}
			if(res.leftChild!=null&&res.leftChild.color==Color.RED&&
					res.rightChild!=null&&res.rightChild.color==Color.RED) {
					needRebalance=true;
					colorSwap(res);
				}
			}while(needRebalance);
		return res;
	}
	
	public boolean add(int value)
	{
		if(root!=null) {
			boolean res=addNode(root,value);
			root=rebalance(root);
			root.color=Color.BLACK;
			return res;
		}
		else
		{
			root=new Node();
			root.color=Color.BLACK;
			root.value=value;
			return true;
		}
	}
	
}
