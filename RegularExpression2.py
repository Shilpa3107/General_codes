import re
pattern = r"^(ab*c|(def)+|a*d|e)$" # (ab*c)+(def)++a*d+e)+
def check_string(s):
    if re.fullmatch(pattern,s):
        print(f"{s} matches the pattern")
    else:
         print(f"{s} does not matches the pattern")
test_strings=["ab","a","","b","c","d","e","f","abc","abcd","adbc","aebcdeaed"]
for s in test_strings:
    check_string(s)