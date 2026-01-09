def add(a, b):
    return a + b

def sub(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    if b == 0:
        return "ERROR, b can't be zero!"
    return a / b

while True:
    try:
        a = float(input("Enter the first number: "))
        b = float(input("Enter the second number: "))
        sign = input("Enter the operation (+, -, *, /) or type 'exit' to quit: ")

        if sign == "exit":
            print("Exiting the calculator. Bye!")
            break

        if sign == "+":
            print("Result:", add(a, b))
        elif sign == "-":
            print("Result:", sub(a, b))
        elif sign == "*":
            print("Result:", multiply(a, b))
        elif sign == "/":
            print("Result:", divide(a, b))
        else:
            print("Invalid operator. Please use +, -, *, / or 'exit'.")
    except ValueError:
        print("Invalid input! Please enter numbers only.")
