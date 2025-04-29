import re      

pattern = r"^((0|1)*|0*1*)$"

tokens = ["","0","10101","101001"]

for token in tokens:
    if re.fullmatch(pattern,token):
        print(f"Token is matched : {token}")
    else :
        print(f"Token does not match : {token}")
