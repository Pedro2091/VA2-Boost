class Main {
  public static void main(String[] args) {

    Disciplina logicaProgramacao = new Disciplina("Logica de Programação","Prof. Antônio", 105);
    Disciplina bancoDeDados = new Disciplina("Banco de Dados","Prof. Julio", 132);
    Disciplina InteligenciaArtificial= new Disciplina("Inteligência Artificial","Prof. Marcia", 143);

    Disciplina matematica = new Disciplina("Matemática","Prof. Lucas", 430);
    Disciplina inovacao = new Disciplina("Inovção","Profa. Marcio", 933);
    Disciplina tecnologia = new Disciplina("Tecnologia","Prof. Gustavo", 232);
      
    Curso computacao = new Curso("Ciência da Computação", logicaProgramacao, bancoDeDados, InteligenciaArtificial);
    Curso adm = new Curso("Administração",matematica, inovacao, tecnologia);
    Aluno aluno1 = new Aluno("Gabriel", 6233, computacao);
    Aluno aluno2 = new Aluno("Julio", 5234, adm);

    System.out.println(aluno1.nome +": "+ aluno1.curso.calcularMedia());
    System.out.println(aluno2.nome +": "+ aluno2.curso.calcularMedia());
    System.out.println("\n\n");
    
    System.out.println(aluno1.nome + "," + aluno1.curso.disciplina1.nome + ": " + aluno1.curso.notaPorDisciplina(1));
    System.out.println("\n\n");

    matematica.exibirRelatorioDisc();
    inovacao.exibirRelatorioDisc();    
    System.out.println("\n\n");

    System.out.println("Nota final de " + aluno1.nome + ":");   
    aluno1.exibirRelatorio();
  
    System.out.println("\nNota final de " + aluno2.nome + ":");   
    aluno2.exibirRelatorio();

    System.out.println("\n\n");
  }
}