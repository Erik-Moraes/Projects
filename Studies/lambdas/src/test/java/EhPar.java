
import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;



public class EhPar {

    @Test
    public void verificarNumeroPar() {
        // TODO: Implemente o Predicate
        Predicate<Integer> ehPar = t -> t  % 2 == 0;

        assertThat(ehPar.test(4)).isTrue();
        assertThat(ehPar.test(7)).isFalse();
        assertThat(ehPar.test(0)).isTrue();


    }


}
