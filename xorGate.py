def xorgate(a,b):
    return a^b
print("A\tB\tA XOR B")
print("---------------")
for a in [0,1]:
    for b in [0,1]:
        print(f"{a}\t{b}\t   {xorgate(a,b)}")