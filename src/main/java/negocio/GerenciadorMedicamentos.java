package negocio;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorMedicamentos {
    private List<Medicamento> lista = new ArrayList<>();

    /**
     * Adiciona um medicamento com validação.
     * Requisito: O nome não pode ser vazio e o horário deve seguir o padrão HH:mm.
     */
    public void adicionar(Medicamento m) throws IllegalArgumentException {
        if (m.getNome() == null || m.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do medicamento é obrigatório.");
        }
        if (m.getHorario() == null || !m.getHorario().matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Horário inválido! Use o formato HH:mm (ex: 08:00).");
        }
        lista.add(m);
    }

    public List<Medicamento> listarTodos() {
        // Retornamos uma nova lista para proteger os dados originais (boa prática!)
        return new ArrayList<>(lista);
    }

    public int total() {
        return lista.size();
    }
}