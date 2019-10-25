package ds.graphs;

public class GraphAdjacencyMatrix {

	private int V;
	private int E;
	private int[][] adjacencyMatrix;

	public GraphAdjacencyMatrix(int nodes) {
		// TODO Auto-generated constructor stub
		this.V = nodes;
		this.E = 0;
		adjacencyMatrix = new int[nodes][nodes];
	}

	public void addEdge(int u, int v) {
		this.adjacencyMatrix[u][v] = 1;
		this.adjacencyMatrix[v][u] = 1;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(V + " Vertices, " + E + " Edges \n");
		for (int v = 0; v < V; v++) {
			stringBuilder.append(v + " :");
			for (int is : adjacencyMatrix[v]) {
				stringBuilder.append(is + " ");
			}
			stringBuilder.append("\n");
		}
		
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		System.out.println(graph);
	}

}
