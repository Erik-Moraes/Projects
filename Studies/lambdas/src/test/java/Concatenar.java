import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Concatenar {

    /**
     * Crie uma BiFunction que concatena duas strings com um separador.
     */
    @Test
    public void concatenarComSeparador() {
        // TODO: Implemente a BiFunction
        BiFunction<String, String, String> concatenar =
                (t, u) -> t + " - " + u;

        assertThat(concatenar.apply("Java", "Lambda")).isEqualTo("Java - Lambda");
        assertThat(concatenar.apply("Olá", "Mundo")).isEqualTo("Olá - Mundo");
    }



}
