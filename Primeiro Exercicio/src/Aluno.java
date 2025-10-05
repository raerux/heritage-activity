public class Aluno extends Pessoa {
    private String matr;
    private String curso;
    
    public Aluno() {}
    
    public Aluno(String nome, int idade, String sexo, String matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }
    
    public void cancelarMatr() {
        this.matr = null;
    }
    
    public String getMatr() {
        return matr;
    }
    
    public void setMatr(String matr) {
        this.matr = matr;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}