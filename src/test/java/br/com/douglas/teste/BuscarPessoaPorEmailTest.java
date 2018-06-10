package br.com.douglas.teste;

import model.Pessoa;
import service.PessoaService;
import javax.persistence.NoResultException;
import org.junit.Test;

public class BuscarPessoaPorEmailTest {

    @Test
    public void RealizarTeste() {
        try {
            buscarPessoaPorEmail("douglas.versato@gmail.com");

        } catch (NoResultException e) {
            System.out.println("Email não localizado no banco");
        }
    }

    public static Pessoa buscarPessoaPorEmail(String email) {
        Pessoa pessoa = new Pessoa();
        PessoaService service = new PessoaService();
        pessoa = service.buscarPessoaPorEmail(email);
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
