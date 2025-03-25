class Calculator:
    def __init__(self, expression):
        self.expression = expression
        self.index = 0
    
    def parse(self):
        result = self.expr()
        if self.index < len(self.expression):
            raise SyntaxError("Invalid syntax")
        return result
    
    def expr(self):
        # Handle addition and subtraction
        result = self.term()
        while self.index < len(self.expression) and self.expression[self.index] in ('+', '-'):
            if self.expression[self.index] == '+':
                self.index += 1
                result += self.term()
            elif self.expression[self.index] == '-':
                self.index += 1
                result -= self.term()
        return result
    
    def term(self):
        # Handle multiplication and division
        result = self.factor()
        while self.index < len(self.expression) and self.expression[self.index] in ('*', '/'):
            if self.expression[self.index] == '*':
                self.index += 1
                result *= self.factor()
            elif self.expression[self.index] == '/':
                self.index += 1
                divisor = self.factor()
                if divisor == 0:
                    raise ZeroDivisionError("Division by zero")
                result /= divisor
        return result
    
    def factor(self):
        # Handle numbers and parentheses
        if self.index < len(self.expression) and self.expression[self.index] == '(':
            self.index += 1
            result = self.expr()
            if self.index < len(self.expression) and self.expression[self.index] == ')':
                self.index += 1
            else:
                raise SyntaxError("Missing closing parenthesis")
            return result
        else:
            return self.number()
    
    def number(self):
        # Handle integer or decimal numbers
        start = self.index
        while self.index < len(self.expression) and (self.expression[self.index].isdigit() or self.expression[self.index] == '.'):
            self.index += 1
        if start == self.index:
            raise SyntaxError("Invalid number")
        return float(self.expression[start:self.index])

def evaluate(expression):
    try:
        calc = Calculator(expression.replace(" ", ""))
        result = calc.parse()
        return result
    except Exception as e:
        return f"Error: {e}"

# Example usage
if __name__ == "__main__":
    while True:
        expr = input("Enter expression (or 'quit' to exit): ")
        if expr.lower() == 'quit':
            break
        print("Result:", evaluate(expr))
