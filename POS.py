import nltk

# Download required datasets (only once)
nltk.download('punkt_tab')
nltk.download('averaged_perceptron_tagger_eng')

# Input sentence
sentence = "The quick brown fox jumps over the lazy dog."

# Tokenize the sentence
tokens = nltk.word_tokenize(sentence)

# Apply POS tagging
pos_tags = nltk.pos_tag(tokens)

# Display results
print("POS Tagging:")
for word, tag in pos_tags:
    print(f"{word} --> {tag}")
