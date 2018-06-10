package br.com.douglas.teste;

import model.Pessoa;
import service.PessoaService;
import org.junit.Test;

public class BuscarPessoaPeloCPFTest {

    @Test
    public void RealizarTeste() {
        buscarPessoaPeloCPF("035.557.591-40");
    }

    public static Pessoa buscarPessoaPeloCPF(String cpf) {
        Pessoa pessoa = new Pessoa();
        PessoaService service = new PessoaService();
        pessoa = service.buscarPessoaPorCPF(cpf);
        imprimirResultados(pessoa);
        return pessoa;
    }

    public static void imprimirResultados(Pessoa p) {
        if (p != null) {

            System.out.println("Imprimindo Resultados");
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("NOme: " + p.getNome());
            System.out.println("CPF: " + p.getCpf());
            System.out.println("E-mail: " + p.getEmail());
            System.out.println("Nome de Usuario: " + p.getNomeUsuario());
            System.out.println("Data de Nascimento: " + p.getDataNascimento());
        }
    }
}
