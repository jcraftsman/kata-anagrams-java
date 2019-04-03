import java.util.ArrayList;
import java.util.Collection;

public class Dictionary {
    private Collection<String> words;

    public Dictionary() {
        words = new ArrayList<>();
    }

    public Collection<String> anagrams(String word) {
        return words;
    }

    public void add(String word) {
        this.words.add(word);
    }
}
