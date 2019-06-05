package com.learn.algos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchExample {
	
	public static void main(String[] args) {
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addNeighbours(node10);
		node40.addNeighbours(node20);
		node10.addNeighbours(node30);
		node20.addNeighbours(node10);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node30.addNeighbours(node60);
		node60.addNeighbours(node70);
		node50.addNeighbours(node70);
		
		BreadthFirstSearchExample obj = new BreadthFirstSearchExample();
		obj.bfsUsingQueue(node40);
	}

	static class Node {
		private int data;
		private boolean visited;
		private List<Node> neighbours;

		public Node(int data) {
			this.data = data;
			this.neighbours = new ArrayList<>();
		}

		public void addNeighbours(Node node) {
			neighbours.add(node);
		}

		public List<Node> getNeighbours() {
			return neighbours;
		}
	}

	public void bfsUsingQueue(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		node.visited = true;

		while (!queue.isEmpty()) {

			Node n = queue.remove();
			System.out.println(n.data + " ");

			List<Node> nn = n.getNeighbours();
			for (int i = 0; i < nn.size(); i++) {
				if (nn != null && !nn.get(i).visited) {
					queue.add(nn.get(i));
					nn.get(i).visited = true;
				}
			}

		}

	}

}
