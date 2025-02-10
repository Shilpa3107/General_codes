from queue import PriorityQueue

def astar(graph, start, goal, heuristic):
    open_list = PriorityQueue()
    open_list.put((0, start))
    
    g_cost = {node: float('inf') for node in graph}
    g_cost[start] = 0

    f_cost = {node: float('inf') for node in graph}
    f_cost[start] = heuristic[start]

    come_from = {}

    while not open_list.empty():
        _, current = open_list.get()  # Extract node correctly

        if current == goal:
            path = []
            while current in come_from:
                path.append(current)
                current = come_from[current]
            path.append(start)
            return path[::-1]  # Reverse path for correct order

        for neighbor, cost in graph[current].items():
            tentative_g_cost = g_cost[current] + cost  # Corrected cost calculation

            if tentative_g_cost < g_cost[neighbor]:  # Proper cost comparison
                come_from[neighbor] = current
                g_cost[neighbor] = tentative_g_cost
                f_cost[neighbor] = g_cost[neighbor] + heuristic[neighbor]
                open_list.put((f_cost[neighbor], neighbor))

    return None  # Return None only after the loop ends

# Define the graph
graph = {
    'A': {'B': 1, 'C': 3},
    'B': {'D': 1, 'E': 4},
    'C': {'F': 6},
    'D': {'G': 2},
    'E': {'G': 2},
    'F': {'G': 1},
    'G': {}
}

heuristic = {
    'A': 6, 'B': 4, 'C': 4, 'D': 2, 'E': 2, 'F': 1, 'G': 0
}

start = 'A'
goal = 'G'
path = astar(graph, start, goal, heuristic)

if path:
    print(f"Shortest path from {start} to {goal}: {path}")
else:
    print(f"No path found from {start} to {goal}")
