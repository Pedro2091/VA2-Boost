class Curso{
  String nome;
  Disciplina disc1;
  Disciplina disc2;
  Disciplina disc3;

  Curso(String nome, Disciplina dis1, Disciplina disc2, Disciplina disc3){
    this.nome = nome;
    this.disc1 = disc1;
    this.disc2 = disc2;
    this.disc3 = disc3;
  }
  
  float calcularMedia(){
    float nota1 = this.disc1.retornarNotaFinal();
    float nota2 = this.disc2.retornarNotaFinal();
    float nota3 = this.disc3.retornarNotaFinal();

    return (nota1 + nota2 + nota3)/3;
  }
  
  boolean estaAprovado(){
    float media = calcularMedia();
    
    if (media>=60) return true;
    return false;
  }
  
  float notaPorDisciplina(int op){
    switch(op){
      case 1:
        return this.disc1.retornarNotaFinal();
      case 2:
        return this.disc2.retornarNotaFinal();
      case 3:
        return this.disc3.retornarNotaFinal();
    }
    return -1;
  }
}