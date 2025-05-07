import nltk
from nltk.tokenize import word_tokenize, sent_tokenize

# Downloading necessary NLTK data
nltk.download('punkt')

# Sample text
text = "Hello there! Welcome to the world of Natural Language Processing. Tokenization is the first step."

# Sentence Tokenization
sentences = sent_tokenize(text)
print("Sentence Tokenization:")
for i, sent in enumerate(sentences):
    print(f"Sentence {i+1}: {sent}")

print("\n-----------------------\n")

# Word Tokenization
words = word_tokenize(text)
print("Word Tokenization:")
print(words)
