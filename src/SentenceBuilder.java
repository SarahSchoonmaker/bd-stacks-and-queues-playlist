import java.util.Stack;

public class SentenceBuilder {
    private Stack<String> sentenceStack;

    /**
     * Constructor.
     */
    public SentenceBuilder() {
        // Initialize the stack to store the words of the sentence
        sentenceStack = new Stack<>();
    }

    /**
     * Adds a word to the sentence.
     * @param word to be added to the sentence.
     */
    public void addWord(String word) {
        // Push the word onto the stack
        sentenceStack.push(word);
    }

    /**
     * Undoes the last word added, and returns it.
     * @return The word most recently added to the sentence, if any; null otherwise.
     */
    public String undo() {
        // Return the top word if the stack is not empty, otherwise return null
        return sentenceStack.isEmpty() ? null : sentenceStack.pop();
    }

    /**
     * Display all the current words in our sentence.
     * @return string representation of the words currently in the sentence.
     */
    public String getSentenceWords() {
        // Return the stack as a formatted string (e.g., [word1, word2, ...])
        return sentenceStack.toString();
    }
}
