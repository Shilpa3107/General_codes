import keyword
import re

code = """def add(a,b):
           sum = a+b
          return sum
          sum = add(4,8)
          if sum > 10:
            print("sum is greater than 10")
          else:
            print("sum is less than or equal to 10")
        """

#define pattern
keywords = set(keyword.kwlist)
identifiers = r"[a-zA-Z_][a-zA-Z0-9_]*"
operators = r"[\+\-\*\=><]"
specialSymbol = r"[\(\):]"
literals = r"\d+"

tokens = re.findall(r"[a-zA-Z_][a-zA-Z0-9_]*|[\+\-\*\=><\(\):]|\"[^\"]*\|\d+",code)
for token in tokens:
    if token in keywords:
        print(f"Keyword : {token}")
    elif re.fullmatch(operators,token):
        print(f"Operators : {token}")
    elif re.fullmatch(literals,token):
        print(f"Literals : {token}")
    elif re.fullmatch(identifiers,token):
        print(f"Identifiers : {token}")
    elif re.fullmatch(specialSymbol,token):
        print(f"Special symbol : {token}")
