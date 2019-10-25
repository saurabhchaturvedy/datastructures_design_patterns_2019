package ds.graphs;

import java.util.LinkedList;

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

	public static void main(String[] args) {
		GraphAdjacencyList graph = new GraphAdjacencyList(4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		System.out.println(graph);
	}
}
