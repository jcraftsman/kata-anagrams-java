import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

class DictionaryTest {

    private Dictionary dictionary;

    @BeforeEach
    void setUp() {
        dictionary = new Dictionary();
    }

    @Test
    void it_should_return_an_empty_list_when_no_anagram_found() {
        assertThat(dictionary.anagrams("notaword")).isEmpty();
    }

    @Test
    void it_should_return_a_known_anagram() {
        // Given
        dictionary.add("cinema");

        // When
        Collection<String> anagrams = dictionary.anagrams("iceman");

        // Then
        assertThat(anagrams).containsExactly("cinema");
    }

    @Test
    void it_should_return_any_known_anagram() {
        // Given
        dictionary.add("cinema");
        dictionary.add("life");

        // When
        Collection<String> anagrams = dictionary.anagrams("file");

        // Then
        assertThat(anagrams).containsExactly("life");
    }
}