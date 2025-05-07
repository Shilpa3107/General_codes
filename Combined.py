n = int(input("Enter a number: "))
m = int(input("Enter a number: "))
sum = n+m
print(f"Sum : {sum}")

if n%2 == 0:
    print("Even number")
else:
    print("Odd number")

def factorial(n):
    fact = 1
    for i in range(1,n+1):
        fact *=i
    return fact
import matplotlib.pyplot as plt
import networkx as nx
def Graph():
    g = nx.Graph()
    g.add_nodes_from(["A","B","C","D","E"])
    g.add_edges_from([("A","B"),("A","C"),("B","D"),("C","E"),("D","E")])
    pos = nx.spring_layout(g)
    plt.figure(figsize=(8,6))
    nx.draw(g,pos,with_labels=True, node_size=1500,node_color="Blue",font_size=12,font_color="White")
    plt.title("Graph",fontsize=16)
    plt.show()
Graph()

class Student:
    def __init__(self,name,age):
        self.name = name
        self.age = age
    def display(self):
        print(f"Name : {self.name} Age : {self.age}")
student1 = Student("Shilpa",20)

class Graph1:
    def __init__(self,start_node):
        self.graph = {}
        self.start_node = start_node
        self.positions = {}
    def add_edges(self,u,v):
        if u not in self.graph:
            self.graph[u] = []
        self.graph[u].append(v)
    def set_positons(self,node,x,y):
        self.positions[node]=(x,y)
    def dfs(self):
        visited=set()
        stack = [self.start_node]
        print("DFS traversal: ",end=" ")
        while stack:
            node = stack.pop()
            if node not in visited:
                print(node, end="")
                visited.add(node)
                if node in self.graph:
                    for neighbour in reversed(self.graph[node]):
                        if neighbour not in visited:
                            stack.append(neighbour)
        print()
    
g = Graph1("A")
g.add_edges("A","B")
g.add_edges("A","C")
g.add_edges("B","D")
g.add_edges("C","E")
g.add_edges("D","E")
g.set_positons("A",1,0)
g.set_positons("B",-1,0)
g.set_positons("C",2,-1)
g.set_positons("D",-1.5,-2)
g.set_positons("E",-4,-2)
g.dfs()

import math
def minimax(depth,node_index,maximizing_player,values,alpha,beta,height):
    if depth == height:
        return values[node_index]
    if maximizing_player:
        best = -math.inf
        for i in range (2):
           val = minimax(depth+1,node_index*2+1,False,values,alpha,beta,height)
           best = max(best,val)
           alpha = max(alpha,best)
           if best <= alpha:
              break
        return best
    else:
         best = math.inf
         for i in range(2):
            val = minimax(depth+1,node_index*2+1,True,values,alpha,beta,height)
            best = min(best,val)
            beta = min(beta,best)
            if beta <= alpha:
              break
    return best

values = [-1,4,2,6,3,-5,0,7]
tree_height = int(math.log2(len(values)))
optimal_val = minimax(0,0,True,values,-math.inf,math.inf,tree_height)
print(f"Optimal Value : {optimal_val}")

def xor(a,b):
    return a^b
print("A\tB\tA XOR B")
for a in [0,1]:
    for b in [0,1]:
        print(f"{a}\t{b}\t   {xor(a,b)}")

def knapsackRec(W,wt,val,n):
    if n==0 or W==0:
      return 0
    if wt[n-1]>W:
        return knapsackRec(W,wt,val,n-1)
    return max(val[n-1]+knapsackRec(W-wt[n-1],wt,val,n-1),knapsackRec(W,wt,val,n-1))

def knapsack(W,wt,val):
    n = len(val)
    return knapsackRec(W,wt,val,n)

val = [1,2,3,4]
wt = [3,4,5,6]
W = 7
print(f"Optimal Weight : {knapsack(W,wt,val)}")

import nltk
from nltk.tokenize import word_tokenize, sent_tokenize
nltk.download("punkt")
text = "Hello there! I am baymax. I am your personal health companion."
sentence = sent_tokenize(text)
for i,sent in enumerate(sentence):
    print(f"Sentence {i+1} : {sent}")
words = word_tokenize(text)
print(words)

from collections import deque
def bfs(graph,node):
    visited=set()
    queue = deque([node])
    traveral_node=[]
    while queue:
        vertex = queue.popleft()
        if vertex not in visited:
            visited.add(vertex)
            traveral_node.append(vertex)
            queue.extend(neighbour for neighbour in graph[vertex] if neighbour not in visited)
    return traveral_node
graph = {
    "A":["B","C"],
    "B":["D","E"],
    "C":["E"],
    "D":[],
    "E":[]
}
print(f"BFS Traversal : {bfs(graph,'A')}")

        
    