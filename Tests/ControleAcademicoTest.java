import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class ControleAcademicoTest {

    ControleAcademico ca = null;

    @BeforeEach
    public void setUp() throws ControleAcademicoException {
         ca = new ControleAcademico("uepb", "bodocongo");
        ca.addAluno("matheus");
        ca.addAluno("Maria");
        ca.addProfessor("Sabrina");
        ca.addProfessor("roberto");
        ca.addDisciplina("geografia","16:00-18:00",1);
        ca.addDisciplina("computação","13:00-15:00",0);

        ca.addAlunoTurma(0, 0);
        ca.addAlunoTurma(0, 1);
    }



    @Test
    void getDisciplinasPorfessor() throws ControleAcademicoException {
       System.out.println(ca.getDisciplinasPorfessor(0));
       assertEquals("computação ",ca.getDisciplinasPorfessor(0));
    }

    @Test
    void getHorarioProfessor() throws ControleAcademicoException {
        System.out.println(ca.getHorarioProfessor(0));
    }

    @Test
    void getDisciplinasAluno() throws ControleAcademicoException {

        assertEquals("geografia ",ca.getDisciplinasAluno(0));
    }

    @Test
    void getHorarioAluno() throws ControleAcademicoException {

       System.out.println(ca.getHorarioAluno(0));
       assertEquals("16:00-18:00 ",ca.getHorarioAluno(0));
    }

    @Test
    void getAlunos() {

        assertEquals("matheus Maria ",ca.getAlunos());
    }

    @Test
    void getProfessores() {
        assertEquals("Sabrina roberto ",ca.getProfessores());
    }

    @Test
    void getDisciplinas() {
        assertEquals("geografia computação ",ca.getDisciplinas());

    }

    //Testa o laçamento de exception caso um aluno repitido seja adicionado na mesma turma
    @Test
    void repeatedStudentInClass() throws ControleAcademicoException {
        ControleAcademicoException exception = Assertions.assertThrows(ControleAcademicoException.class, () -> {
            ca.addAlunoTurma(0, 1);
        },"Nenhum thrown detectado");

    }

    @Test
    void getTamanhoTurma() throws ControleAcademicoException {
       System.out.println(ca.getTamanhoTurma(0));
       assertEquals(2,ca.getTamanhoTurma(0));
    }

    @Test
    void listarAlunosTurma() throws ControleAcademicoException {
        System.out.println(ca.listarAlunosTurma(0));
        assertEquals(ca.listarAlunosTurma(0),"matheus ,Maria ");


    }

    @Test
    void addAlunoTurma() throws ControleAcademicoException {
        ca.addAluno("Joao");
        ca.addAlunoTurma(0, 2);
        assertEquals("matheus ,Maria ,Joao ",ca.listarAlunosTurma(0));
    }
}