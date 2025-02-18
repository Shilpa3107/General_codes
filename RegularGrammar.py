def generate_regular_grammar(regex):
    grammar = []  # List to store grammar rules
    state_count = 1  # Counter for generating new states
    start_symbol = "S"  # Start symbol of grammar
    last_state = start_symbol  # Track last used state

    i = 0
    while i < len(regex):
        char = regex[i]

        if char.isalnum():  # If character is a letter/number (terminal)
            next_state = f"A{state_count}"
            grammar.append(f"{last_state} → {char}{next_state}")
            last_state = next_state
            state_count += 1

        elif char == '*':  # Handling Kleene Star
            prev_rule = grammar.pop()
            modified_rule = prev_rule.replace("→", "→ ε | ")  # Add ε transition
            grammar.append(modified_rule)
            grammar.append(f"{last_state} → ε")  # Self-looping ε transition

        elif char == '|':  # Handling Alternation (Union)
            if i + 1 < len(regex) and regex[i + 1].isalnum():
                grammar.append(f"{start_symbol} → {regex[i+1]}A{state_count}")
                state_count += 1
                i += 1  # Skip next character as it's already processed

        i += 1

    grammar.append(f"{last_state} → ε")  # Final state transition
    return grammar

# Accepting input from user
regex = input("Enter a Regular Expression: ")
grammar = generate_regular_grammar(regex)

# Display the equivalent regular grammar
print("\nEquivalent Regular Grammar:")
for rule in grammar:
    print(rule)
