from collections import defaultdict

def eliminate_left_recursion(grammar):
    non_terminals = list(grammar.keys())  # Ordered list of non-terminals
    updated_grammar = defaultdict(list)

    # Step 1: Fully remove indirect left recursion
    for i in range(len(non_terminals)):
        Ai = non_terminals[i]
        new_productions = []

        for prod in grammar[Ai]:
            while prod[0] in non_terminals[:i]:  # Fully expand indirect recursion
                Aj = prod[0]  # The non-terminal causing recursion
                prod = [Aj_prod + prod[1:] for Aj_prod in updated_grammar[Aj]]
            
            new_productions.extend(prod if isinstance(prod, list) else [prod])  # Flatten list
        
        updated_grammar[Ai] = new_productions  # Update with resolved indirect recursion

    # Step 2: Remove direct left recursion
    final_grammar = {}

    for non_terminal, productions in updated_grammar.items():
        recursive = []
        non_recursive = []

        for prod in productions:
            if prod.startswith(non_terminal):  # Direct left recursion detected
                recursive.append(prod[len(non_terminal):])
            else:
                non_recursive.append(prod)

        if recursive:
            new_non_terminal = non_terminal + "'"
            final_grammar[non_terminal] = [rule + new_non_terminal for rule in non_recursive]
            final_grammar[new_non_terminal] = [rule + new_non_terminal for rule in recursive] + ['epsilon']
        else:
            final_grammar[non_terminal] = productions

    return final_grammar

# Example Grammar
grammar = {
    'A': ['Ba'],  # Indirect recursion: A → B → C → A
    'B': ['Ca'],
    'C': ['At'],
    'D': ['k', 'Df']
}

new_grammar = eliminate_left_recursion(grammar)

# Display the new grammar
for non_terminal, productions in new_grammar.items():
    print(f"{non_terminal} -> {' | '.join(productions)}")
