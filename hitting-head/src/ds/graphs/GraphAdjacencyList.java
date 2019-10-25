package ds.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphAdjacencyList {

	private LinkedList<Integer> adjList[];
	private int V;
	private int E;

	public GraphAdjacencyList(int nodes) {
		// TODO Auto-generated constructor stub
		this.V = nodes;
		this.E = 0;
		adjList = new LinkedList[nodes];
		for (int i = 0; i < V; i++) {
			this.adjList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int v, int u) {
		this.adjList[v].add(u);
		this.adjList[u].add(v);
		E++;
	}

	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(V + " Vertices, " + E + " Edges \n");
		for (int i = 0; i < V; i++) {
			stringBuilder.append(i + ":");
			for (int k : adjList[i]) {
				stringBuilder.append(k + " ");
			}
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();

	}

	public void bfs(int s) {
		boolean[] visited = new boolean[V];
		Queue<Integer> nodeQueue = new LinkedList<>();
		visited[s] = true;
		nodeQueue.offer(s);

		while (!nodeQueue.isEmpty()) {
			Integer u = nodeQueue.poll();
			System.out.print(u + " ");
			for (int x : adjList[u]) {
				if (!visited[x]) {
					visited[x] = true;
					nodeQueue.offer(x);
				}
			}
		}
	}

	public void dfs(int s) {
		boolean[] visited = new boolean[V];
		Stack<Integer> nodeStack = new Stack<>();
		nodeStack.push(s);

		while (!nodeStack.isEmpty()) {
			Integer u = nodeStack.pop();
			if (!visited[u]) {
				visited[u] = true;
				System.out.print(u + " ");
				for (int x : adjList[u]) {
					if (!visited[x])
						nodeStack.push(x);
				}
			}
		}
	}

	public static void main(String[] args) {
		GraphAdjacencyList graph = new GraphAdjacencyList(5);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		graph.addEdge(2, 4);
		System.out.println(graph);
		System.out.println("BFS Traversal of the Graph is as :");
		graph.bfs(0);
		System.out.println();
		System.out.println("DFS Traversal of the Graph is as :");
		graph.dfs(0);
	}
}
