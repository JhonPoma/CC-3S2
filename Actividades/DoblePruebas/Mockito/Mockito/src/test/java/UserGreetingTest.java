import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)//usando Mockito,
public class UserGreetingTest {
    private static final UserId USER_ID = new UserId("1234");

    @Mock
    private UserProfiles profiles;
    @Test
    void formatsGreetingWithName(){
        Mockito.when(profiles.fetchNicknameFor(USER_ID))
                .thenReturn("kapumota");
        var greeting = new UserGreeting(profiles);
        String actual = greeting.formatGreeting(USER_ID);

        assertThat(actual)
                .isEqualTo("Hola y bienvenido, kapumota");
    }
}
