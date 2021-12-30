import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void testarProfessorIdForaDoEspectro() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
            new Professor(-1,"jona");
        }, "mensagem");
    }

    @Test
    public void testarProfessorSemNomeExeption() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
            new Professor(2,"");
        }, "mensagem");
    }
}