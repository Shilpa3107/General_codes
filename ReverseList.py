class Node:
   def __init__(self,data):
      self.data = data
      self.next = None
    
def reverse_list(head):
      prev = None
      current = head
       
      while current:
         next_node = current.next
         current.next = prev
         prev = current
         current = next_node
      
      return prev
   
def display(head):
      while head:
         print(head.data,end="->")
         head = head.next
      print("None")
    
n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n1.next = n2
n2.next = n3

print("Original List")
display(n1)

print("Reversed List")
obj = reverse_list(n1)
display(obj)


