import nltk

# Download necessary datasets
nltk.download('punkt')
nltk.download('averaged_perceptron_tagger')

def recognize_word_types(sentence):
    # Tokenize (split) the sentence into words
    words = nltk.word_tokenize(sentence)

    # Apply Part-of-Speech (POS) tagging
    pos_tags = nltk.pos_tag(words)

    # Display the results
    print("\nRecognized Word Types:")
    print("-" * 40)
    for word, tag in pos_tags:
        print(f"{word:<15} ---> {tag}")

# Example input sentence
input_sentence = "The quick brown fox jumps over the lazy dog."
recognize_word_types(input_sentence)
