import nltk
from nltk.tokenize import word_tokenize, sent_tokenize
nltk.download("punkt")

text = "Hello Everyone!! I am a megamind. I hold the power of minds."

sentence = sent_tokenize(text)
for i, sent in enumerate(sentence):
    print(f"Sentence {i+1} : {sent}")

words = word_tokenize(text)
print(words)