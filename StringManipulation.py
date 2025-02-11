# Defining a string
text = "  Hello, Python Programming!  "

# 1. Finding the length of the string
print("Length of string:", len(text))

# 2. Converting to uppercase and lowercase
print("Uppercase:", text.upper())
print("Lowercase:", text.lower())

# 3. Converting to title case
print("Title Case:", text.title())

# 4. Removing extra spaces
trimmed_text = text.strip()
print("Trimmed String:", trimmed_text)

# 5. Replacing words
new_text = trimmed_text.replace("Python", "Java")
print("After Replacement:", new_text)

# 6. Finding a substring
position = trimmed_text.find("Python")
print("Position of 'Python':", position)

# 7. Splitting the string into a list
words = trimmed_text.split()
print("Splitting into words:", words)

# 8. Joining words into a single string
joined_text = "-".join(words)
print("Joined with '-':", joined_text)

# 9. String slicing
print("First 5 characters:", trimmed_text[:5])
print("Last 5 characters:", trimmed_text[-5:])
print("Middle part:", trimmed_text[7:13])
