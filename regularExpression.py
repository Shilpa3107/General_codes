import re
pattern = r"^(0|1)*$|^0*1*$"
def check_string(s):
    if re.fullmatch(pattern,s):
     print(f"{s} is a valid string")
    else:
       print(f"{s} does not match")

test_strings = ["","0","1","01","10","0011","111","000111","1100","0110"]

for s in test_strings:
   check_string(s)