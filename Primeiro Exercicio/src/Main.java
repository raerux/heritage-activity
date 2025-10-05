public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("João Silva", 45, "M", "Matemática", 5000.0);
        Funcionario func = new Funcionario("Maria Santos", 30, "F", "Administração", true);
        Aluno aluno = new Aluno("Pedro Costa", 20, "M", "2024001", "Engenharia");
        
        prof.fazerAniv();
        prof.receberAum(500.0);
        
        func.mudarTrabalho();
        
        aluno.fazerAniv();
        aluno.cancelarMatr();
        
        System.out.println("Professor: " + prof.getNome() + ", Idade: " + prof.getIdade() + ", Salário: " + prof.getSalario());
        System.out.println("Funcionário: " + func.getNome() + ", Trabalhando: " + func.isTrabalhando());
        System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatr());
    }
}