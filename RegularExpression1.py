import re        
pattern = r"^([01]*|0*1*)$" # (0+1)*+0*1*
def check_string(s):
    if re.fullmatch(pattern,s):
        print(f"{s} matches the pattern")
    else :
        print(f"{s} does not matches the pattern")
test_strings = {"","0","1","00","11","010","10","10","111","101","1100101","10101","1110000"}
for s in test_strings:
    check_string(s)