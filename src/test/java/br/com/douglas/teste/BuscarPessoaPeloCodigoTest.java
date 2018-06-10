package br.com.douglas.teste;

import model.Pessoa;
import service.PessoaService;
import org.junit.Test;

public class BuscarPessoaPeloCodigoTest {

    public static void main(String[] args) {
        RealizarTeste();
    }
    
    @Test
    public static void RealizarTeste() {
        imprimirResultados(Pessoa.class, 17L);
    }

    public static Pessoa buscarPessoaPorId(Object o, Long id) {
        PessoaService service = new PessoaService();
        Pessoa pessoa = new Pessoa();

        pessoa = service.buscarPessoaPorId(pessoa, id);
        return pessoa;
    }

    public static void imprimirResultados(Object o, Long codigo) {
        Pessoa pessoa = new Pessoa();
        pessoa = (Pessoa) buscarPessoaPorId(Pessoa.class, codigo);
        System.out.println("Resultados da Pesquisa\n"
                + "Nome: " + pessoa.getNome() + "\n"
                + "CPF :" + pessoa.getCpf() + "\n"
                + "Nome de Usuario" + pessoa.getNomeUsuario()
                + "Email: " + pessoa.getEmail());
    }
}
