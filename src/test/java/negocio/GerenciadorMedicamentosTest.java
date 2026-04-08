package negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GerenciadorMedicamentosTest {

    @Test
    void testAdicionarComSucesso() {
        GerenciadorMedicamentos geren = new GerenciadorMedicamentos();
        Medicamento m = new Medicamento("Dipirona", "500mg", "12:00");
        geren.adicionar(m);
        assertEquals(1, geren.total());
    }

    @Test
    void testValidarNomeVazio() {
        GerenciadorMedicamentos geren = new GerenciadorMedicamentos();
        Medicamento m = new Medicamento("", "10mg", "08:00");
        assertThrows(IllegalArgumentException.class, () -> geren.adicionar(m));
    }

    @Test
    void testListaVaziaNoInicio() {
        GerenciadorMedicamentos geren = new GerenciadorMedicamentos();
        assertTrue(geren.listarTodos().isEmpty());
    }
}