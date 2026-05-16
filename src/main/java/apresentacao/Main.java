package apresentacao;

import negocio.ServicoDicas;
import visao.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
    	ServicoDicas servicoDicas = new ServicoDicas();
        System.out.println("\n [Dica de Bem-estar da API]: " + servicoDicas.obterDicaDoDia());
    	
        new MenuPrincipal().exibir();
    }
}