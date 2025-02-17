import math

def minimax(depth, node_index, maximizing_player, values, alpha, beta, height):
    if depth == height:  # Base case: Leaf node
        return values[node_index]
    
    if maximizing_player:
        best = -math.inf
        for i in range(2):  # Two children
            val = minimax(depth + 1, node_index * 2 + i, False, values, alpha, beta, height)
            best = max(best, val)
            alpha = max(alpha, best)
            if beta <= alpha:  # Prune
                break
        return best
    
    else:
        best = math.inf
        for i in range(2):  # Two children
            val = minimax(depth + 1, node_index * 2 + i, True, values, alpha, beta, height)
            best = min(best, val)  # Fix: Use min for minimizing player
            beta = min(beta, best)  # Fix: Update beta correctly
            if beta <= alpha:  # Prune
                break
        return best

values = [-1, 4, 2, 6, 3, -5, 0, 7]
tree_height = int(math.log2(len(values)))  # Fix: Use log2 to calculate height

optimal_value = minimax(0, 0, True, values, -math.inf, math.inf, tree_height)
print(f"Optimal value: {optimal_value}")
