package negocio;

public class Medicamento {
    private String nome;
    private String dosagem;
    private String horario;

    public Medicamento(String nome, String dosagem, String horario) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.horario = horario;
    }

    // Getters para que a Visão e os Testes consigam ler os dados
    public String getNome() { return nome; }
    public String getDosagem() { return dosagem; }
    public String getHorario() { return horario; }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s", horario, nome, dosagem);
    }
}