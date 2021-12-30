import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

Disciplina dc  = null;

    @BeforeEach
    void setUp()  {
        dc = new Disciplina(1,"Historia","14:00");

    }




    @Test
    void tamanhoTurma() throws ControleAcademicoException {
        Aluno aluno = new Aluno(2,"jon");
        Aluno aluno2 = new Aluno(1,"joao");
        dc.addAluno(aluno);
        dc.addAluno(aluno2);

        assertEquals(2,dc.tamanhoTurma());
    }

    @Test
    void verificaAlunoCadastrado() throws ControleAcademicoException {
        Aluno aluno = new Aluno(2,"jon");
        dc.addAluno(aluno);

        assertTrue(dc.verificaAlunoCadastrado(aluno));
    }

    @Test
    void listarAlunos() throws ControleAcademicoException {
        Aluno aluno = new Aluno(2,"jon");
        Aluno aluno2 = new Aluno(1,"joao");
        dc.addAluno(aluno);
        dc.addAluno(aluno2);

        assertEquals("jon ,joao ",dc.listarAlunos());
    }
}