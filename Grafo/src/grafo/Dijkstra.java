package grafo;

public class Dijkstra {	
	private double arestapeso[];
	private int antes[];
	private MeuGrafo grafo;
	private StringBuilder Caminho = new StringBuilder();

	public Dijkstra(MeuGrafo grafo) {
		this.grafo = grafo;
	}
	
	public int antes(int a) {
		return this.antes[a];
	}	
	
	public StringBuilder imprimirCaminho(int origem, int vertice)
			throws Exception {
		if (origem == vertice)
			Caminho.append(origem);
		else if (this.antes[vertice] == -1)
			throw new Exception("Não há caminho de "+origem+" até "+vertice);
		else {
			Caminho.append(vertice + " > ");
			imprimirCaminho(origem, this.antes[vertice]);
		}

		return Caminho;

	}
	
	public double weight(int w) {
		return this.arestapeso[w];
	}

	public void obterArvore(int raiz) throws Exception {
		int n = this.grafo.numVertices();
		this.arestapeso = new double[n];
		int vs[] = new int[n + 1];
		this.antes = new int[n];

		for (int u = 0; u < n; u++) {
			this.antes[u] = -1;
			arestapeso[u] = Double.MAX_VALUE;
			vs[u + 1] = u;
		}

		arestapeso[raiz] = 0;
		MeuHeap heap = new MeuHeap(arestapeso, vs);
		heap.constroi();

		while (!heap.empty()) {
			int u = heap.retiraMin();
			if (!this.grafo.listaVazia(u)) {
				MeuGrafo.Aresta adj = grafo.primeiroLista(u);
				while (adj != null) {
					int v = adj.v2();
					if (this.arestapeso[v] > (this.arestapeso[u] + adj.weight())) {
						antes[v] = u;
						heap.diminuiChave(v, this.arestapeso[u] + adj.weight());
					}
					adj = grafo.prox(u);
				}
			}
		}
	}
			

}