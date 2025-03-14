def remove_left_recursion(grammar):
    new_grammar = {}
    
    for non_terminal in grammar:
        alpha = []  # Productions causing left recursion
        beta = []   # Productions not causing left recursion
        
        for production in grammar[non_terminal]:
            if production.startswith(non_terminal):
                alpha.append(production[len(non_terminal):])
            else:
                beta.append(production)
        
        if alpha:
            # Create a new non-terminal
            new_non_terminal = non_terminal + "'"
            new_grammar[non_terminal] = [b + new_non_terminal for b in beta]
            new_grammar[new_non_terminal] = [a + new_non_terminal for a in alpha] + ['ε']
        else:
            new_grammar[non_terminal] = grammar[non_terminal]
    
    return new_grammar

# Example Grammar with Left Recursion
grammar = {
    'A': ['Aa', 'b']
}

# Remove Left Recursion
new_grammar = remove_left_recursion(grammar)

# Output Result
print("Grammar after removing left recursion:")
for non_terminal, productions in new_grammar.items():
    print(f"{non_terminal} -> {' | '.join(productions)}")
