package negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ServicoDicasTest {

    @Test
    public void deveRetornarUmaDicaValidaDaApi() {
        ServicoDicas servico = new ServicoDicas();
        
        // Executa o método que vai na internet
        String dica = servico.obterDicaDoDia();
        
        // Validações (Garantem que não veio vazio ou nulo)
        assertNotNull(dica, "A dica não deveria ser nula");
        assertFalse(dica.trim().isEmpty(), "A dica não deveria estar vazia");
    }
}