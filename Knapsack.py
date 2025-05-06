def knapsackRec(W,val,wt,n):
    if n==0 or W==0:
        return 0
    if wt[n-1] > W:
        return knapsackRec(W,val,wt,n-1)
    return max(val[n-1]+knapsackRec(W-wt[n-1],val,wt,n-1),knapsackRec(W,val,wt,n-1))

def knapsack(W,val,wt):
    n = len(val)
    return knapsackRec(W,val,wt,n)

val = [3,4,5,6]
wt = [2,3,4,5]
W = 5
print(f"Maximum Value : {knapsack(W,val,wt)}")