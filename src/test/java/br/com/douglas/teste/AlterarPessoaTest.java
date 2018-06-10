package br.com.douglas.teste;

import model.Pessoa;
import service.PessoaService;
import java.util.Date;
import org.junit.Test;

public class AlterarPessoaTest {

    @Test
    public void RealizarTeste() {

        Pessoa pessoa = new Pessoa();
        alterarPessoa(pessoa, 1L);

    }

    public static Pessoa buscarPessoaPorId(Object o, Long id) {
        PessoaService service = new PessoaService();
        Pessoa pessoa = new Pessoa();

        pessoa = service.buscarPessoaPorId(pessoa, id);
        return pessoa;
    }

    public static void alterarPessoa(Pessoa pessoa, Long codigo) {
        PessoaService service = new PessoaService();
        pessoa = buscarPessoaPorId(Pessoa.class, codigo);

        Date data = new Date();
        data.getYear();

        pessoa.setAtivo(false);
        pessoa.setCpf(pessoa.getCpf());
        pessoa.setDataNascimento(data);
        pessoa.setEmail(pessoa.getEmail() + "alterado");
        pessoa.setNome("alterado");
        pessoa.setNomeUsuario(pessoa.getNomeUsuario() + "novo");
        pessoa.setSenha(pessoa.getSenha());
        service.alterar(pessoa);

    }
}
