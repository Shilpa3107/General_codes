import matplotlib.pyplot as plt
import networkx as nx

# Function to create and visualize a graph
def graph():
    # Step 1: Create a Graph
    G = nx.Graph()

    # Step 2: Add nodes
    G.add_nodes_from(["A", "B", "C", "D", "E"])

    # Step 3: Add edges between nodes
    G.add_edges_from([("A", "B"), ("A", "C"), ("B", "D"), ("C", "E"), ("D", "E")])

    # Step 4: Define the layout for positioning nodes
    pos = nx.spring_layout(G)  # Uses a force-directed algorithm for positioning

    # Step 5: Draw the graph
    plt.figure(figsize=(8, 6))
    nx.draw(
        G, pos, with_labels=True,
        node_color="blue", node_size=1500,
        font_size=12, font_color="white"
    )

    # Step 6: Add a title and display the graph
    plt.title("Graph Visualization", fontsize=16)
    plt.show()

# Call the function to execute the experiment
graph()
