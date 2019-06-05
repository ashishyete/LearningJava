package com.learn.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchExample {

	public static void main(String[] args) {

		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
		
		node40.addNeighbour(node10);
		node40.addNeighbour(node20);
		node10.addNeighbour(node30);
		node20.addNeighbour(node10);
		node20.addNeighbour(node30);
		node20.addNeighbour(node60);
		node20.addNeighbour(node50);
		node30.addNeighbour(node60);
		node60.addNeighbour(node70);
		node50.addNeighbour(node70);
		
		DepthFirstSearchExample onj = new DepthFirstSearchExample();
		//onj.dfsUsingStack(node40);
		onj.dfsUsingRecurssion(node40);
		
	}
	

	static class Node {
		private int data;
		private boolean visited;
		private List<Node> neighbours;

		public Node(int data) {
			this.data = data;
			this.neighbours = new ArrayList<>();
		}

		public void addNeighbour(Node neighbourNode) {
			this.neighbours.add(neighbourNode);
		}

		public List<Node> getNeighbours() {
			return neighbours;
		}
	}

	public void dfsUsingStack(Node node) {
		
		Stack<Node> stack = new Stack<>();
		stack.add(node);
		node.visited = true;

		while (!stack.isEmpty()) {
			Node element = stack.pop();
			System.out.print(element.data + " ");
			List<Node> neighbours = element.getNeighbours();
			for (int i = 0; i < neighbours.size(); i++) {
				Node n = neighbours.get(i);
				if (!n.visited && n != null) {
					stack.add(n);
					n.visited = true;
				}
			}

		}
	}
	
	public void dfsUsingRecurssion(Node node) {
		System.out.print(node.data+" ");
		List<Node> nn = node.getNeighbours();
		node.visited=true;
		for(int i=0;i<nn.size();i++) {
			if(nn.get(i)!=null&& !nn.get(i).visited) {
				dfsUsingRecurssion(nn.get(i));
			}
		}
	}
}
