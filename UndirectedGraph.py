import matplotlib.pyplot as plt 
import networkx as nx
def Graph():
    G = nx.Graph()
    G.add_nodes_from(["A","B","C","D","E"])
    G.add_edges_from([("A","B"),("A","C"),("B","D"),("C","E"),("D","E")])
    pos = nx.spring_layout(G)
    plt.figure(figsize=(8,6))
    nx.draw(G,pos,with_labels=True,node_size=1500,node_color ="blue", font_size=12,font_color="white")
    plt.title("Graph",fontsize=16)
    plt.show()
Graph()
