text = "Hello, Python Programming"

#len function
print(f"Length of string : {len(text)}")

#upper function
print(f"UpperCase : ",text.upper())
#lower function
print(f"LowerCase : ",text.lower())
#title function
print(f"Title : ",text.title())
#replace function
print(f"Replace function : ",text.replace("Python","Java"))
#split function
print(f"Split function : ",text.split())
#Join function
print(f"Join function : ","-".join(text.split()))
#slice function
print(f"Slice function : ",text[:5])
print(f"Slice function : ",text[:-5])