import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StringLength {

    @Test
    public void obterTamanhoDaString() {
        // TODO: Implemente a Function
        Function<String, Integer> obterTamanho = t -> t.length();

        assertThat(obterTamanho.apply("Java")).isEqualTo(4);
        assertThat(obterTamanho.apply("Lambda")).isEqualTo(6);
        assertThat(obterTamanho.apply("")).isEqualTo(0);
    }


}
