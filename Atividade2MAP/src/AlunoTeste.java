import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlunoTeste {

	@Test
	public void testeTrianguloLadosZero() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
            new Aluno(1,"");
        }, "mensagem");
    }

}
