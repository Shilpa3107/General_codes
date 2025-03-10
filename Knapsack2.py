def knapsack(weights, values, W, n):
    if n==0 or W == 0:
        return 0
    if weights[n-1] > W:
        return knapsack(weights, values, W, n-1)
    include = values[n-1]+knapsack(weights,values, W-weights[n-1], n-1)
    exclude = knapsack(weights, values, W, n-1)
    return max(include,exclude)
weights=[2,3,4,5]
values=[3,4,5,6]
W = 5
n = len(weights)
max = knapsack(weights,values,W,n)
print(f"Maximum value : {max}")