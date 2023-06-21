import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doThrow;


@ExtendWith(MockitoExtension.class)//usando mockito
public class WordSelectionTest {
    private WordSelection selection;

    @Mock
    private WordRepository repository;

    @Test
    public void reportsWordNotFound() throws WordRepositoryException {
        selection = new WordSelection(repository);

        doThrow(new WordRepositoryException("Exception")).when(repository).fetchWordByNumber(anyInt());
        //Mockito.when(repository.fetchWordByNumber(1)).thenReturn(" ");
        assertThatExceptionOfType(WordSelectionException.class)
                .isThrownBy( ()->selection.getRandomWord() );

    }
}
