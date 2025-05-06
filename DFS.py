class Graph:
     def __init__(self,start_node):
          self.graph={}
          self.start_node = start_node
          self.positions={}
     def add_edges(self,u,v):
          if u not in self.graph:
               self.graph[u] = []
          self.graph[u].append(v)
     def set_position(self,node,x,y):
          self.positions[node] = (x,y)
     def dfs(self):
          visited = set()
          stack = [self.start_node]
          print("DFS Traversal: ",end=" ")
          while stack: 
               node = stack.pop()
               if node not in visited:
                    print(node,end=" ")
                    visited.add(node)
                    if node in self.graph:
                         for neighbour in reversed(self.graph[node]):
                              if neighbour not in visited:
                                   stack.append(neighbour)
           
     def display(self):
          for node, pos in self.positions.items():
               print(f"Node : {node} Position : {pos}")
g = Graph("A")
g.add_edges("A","B")
g.add_edges("A","C")
g.add_edges("B","D")
g.add_edges("C","E")
g.add_edges("D","E")

g.set_position("A",0,1)
g.set_position("B",-1,0)
g.set_position("C",1,0)
g.set_position("D",-1.5,-1)
g.set_position("E",-0.5,-1)
g.dfs()
g.display()