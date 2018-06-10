package br.com.douglas.teste;

import Util.DBException;
import model.Pessoa;
import service.PessoaService;
import java.sql.SQLException;
import java.util.Date;

public class SalvarPessoaDAOTest  {

    PessoaService service = new PessoaService();
    Pessoa pessoa = new Pessoa();

    @org.junit.Test
    public void salvarPessoa() throws SQLException, DBException {
        pessoa.setNome("Douglas");
        pessoa.setCpf("035.557.591-40");
        Date data = new Date();

        data.setYear(2018);
        data.setMonth(9);
        data.setDate(24);
        pessoa.setDataNascimento(data);
        pessoa.setNomeUsuario("douglas");
        pessoa.setEmail("douglas.versato@gmail.com");
        pessoa.setSenha("root");

        service.salvar(pessoa);

    }

}
