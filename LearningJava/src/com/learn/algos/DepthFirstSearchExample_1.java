package com.learn.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchExample_1 {

	public static void main(String[] args) {

		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

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

		new DepthFirstSearchExample_1().dfsUsingStack(node40);
	}

	static class Node {
		private int data;
		private boolean visited;
		List<Node> neighbours;

		public Node(int data) {
			this.data = data;
			this.neighbours = new ArrayList<>();
		}

		public List<Node> getNeighbours() {
			return neighbours;
		}

		public void addNeighbour(Node nodeNeighbour) {
			this.neighbours.add(nodeNeighbour);
		}

	}

	public void dfsUsingStack(Node node) {

		Stack<Node> stack = new Stack<>();
		stack.push(node);
		node.visited = true;

		while (!stack.isEmpty()) {
			Node element = stack.pop();
			System.out.println(element.data + " ");

			List<Node> nodeElements = element.getNeighbours();
			for (int i = 0; i < nodeElements.size(); i++) {
				if(nodeElements.get(i)!=null && !nodeElements.get(i).visited) {
					stack.push(nodeElements.get(i));
					nodeElements.get(i).visited=true;
				}
			}
		}

	}

}
