import keyword
import re

# Sample Python code as input
code = """
def add(a, b):
    sum = a + b
    return sum

if sum > 10:
    print("Greater than 10")
else:
    print("Less than or equal to 10")
"""

# List of Python keywords
keywords = set(keyword.kwlist)

# Token patterns
identifier_pattern = r"[a-zA-Z_][a-zA-Z_0-9]*"
operator_pattern = r"[\+\-\*/=><]"
literal_pattern = r"\d+|\".*?\"|'.*?'"
special_symbol_pattern = r"[\(\)\{\},:]"

# Token categorization
tokens = code.split()
print("Tokens Identified:\n")
for token in tokens:
    if token in keywords:
        print(f"Keyword: {token}")
    elif re.fullmatch(identifier_pattern, token):
        print(f"Identifier: {token}")
    elif re.fullmatch(operator_pattern, token):
        print(f"Operator: {token}")
    elif re.fullmatch(literal_pattern, token):
        print(f"Literal: {token}")
    elif re.fullmatch(special_symbol_pattern, token):
        print(f"Special Symbol: {token}")
