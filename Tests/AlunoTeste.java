import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AlunoTeste {

	@Test
	public void testarAlunoSemNome() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
            new Aluno(1,"");
        }, "mensagem");
    }

}
