def generate_grammar(regex):
          grammar = []
          start_symbol = "S"
          last_symbol = start_symbol
          state_count = 1

          i = 0
          while i < len(regex):
                  char = regex[i]
                  if char.isalnum():
                          next_state = f"A{state_count}"
                          grammar.append(f"{last_symbol}->{char}{next_state}")
                          last_symbol = next_state
                          state_count += 1
                  elif char == '*':
                          prev_rule = grammar.pop()
                          modified_rule = prev_rule.replace("->","->epsilon|")
                          grammar.append(modified_rule)
                          grammar.append(f"{last_symbol}->epsilon")
                  elif char == '1':
                          if i+1 < len(regex) and regex[i+1].isalnum():
                               grammar.append(f"{last_symbol}->{char}{regex[i+1]}.A{state_count}")
                               state_count += 1
                               i += 1
                  i += 1
          grammar.append(f"{last_symbol}->epsilon")
          return grammar

regex = input("Enter an expression")
grammar = generate_grammar(regex)
for rule in grammar:
        print(rule)     