import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doThrow;


@ExtendWith(MockitoExtension.class)
public class WordSelectionTest {

    @Mock
    private WordRepository repository;

    @Test
    public void reportsWordNotFound(){
        doThrow(new WordRepositoryException()).when(repository).fetchWordByNumber(anyInt());

        assertThatExceptionOfType(WordSelectionException.class)
                .isThrownBy(
                        ()->selection.getRandomWord();
                )
    }
}
