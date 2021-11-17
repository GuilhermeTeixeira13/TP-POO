import java.util.ArrayList;
import java.util.Date;

public class Curso {
    // Atributos
    private String nomeCurso;
    private int codCurso;
    private ArrayList<Disciplina> disciplinasCurso;
    private ArrayList<ProvasIngresso> provasIngresso;
    private ArrayList<Pessoa.Aluno> alunosCurso;
    private int duracaoEmHoras;
    private float mediaUltimoColocado;
    private Date dataInicio;
    private Date dataFim;

    // Construtores
    public Curso(){
        this.nomeCurso = "";
        this.codCurso = 0;
        this.disciplinasCurso = new ArrayList<Disciplina>();
        this.provasIngresso = new ArrayList<ProvasIngresso>();
        this.alunosCurso = new ArrayList<Pessoa.Aluno>();
        this.duracaoEmHoras = 0;
        this.mediaUltimoColocado = 0;
        this.dataInicio = new Date();
        this.dataFim = new Date();
    }
    public Curso(String nomeCurso, int codCurso, int duracaoEmHoras, float mediaUltimoColocado, Date dataInicio, Date dataFim){
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.disciplinasCurso = new ArrayList<Disciplina>();
        this.provasIngresso = new ArrayList<ProvasIngresso>();
        this.alunosCurso = new ArrayList<Pessoa.Aluno>();
        this.duracaoEmHoras = duracaoEmHoras;
        this.mediaUltimoColocado = mediaUltimoColocado;
        this.dataInicio = new Date();
        this.dataFim = new Date();
    }

    //Getters e Setters
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public String getNomeCurso(){
        return this.nomeCurso;
    }

    public void setCodCurso(int codCurso){
        this.codCurso = codCurso;
    }
    public int getCodCurso(){
        return this.codCurso;
    }

    public void setDisciplinasCurso(ArrayList<Disciplina> disciplinasCurso){
        this.disciplinasCurso = (ArrayList<Disciplina>) disciplinasCurso.clone();
    }
    public ArrayList<Disciplina> getDisciplinasCurso(){
        return this.disciplinasCurso;
    }

    public void setProvasIngresso(ArrayList<ProvasIngresso> provasIngresso){
        this.provasIngresso = (ArrayList<ProvasIngresso>) provasIngresso.clone();
    }
    public ArrayList<ProvasIngresso> getProvasIngresso(){
        return this.provasIngresso;
    }

    public void setAlunosCurso(ArrayList<Pessoa.Aluno> alunosCurso){
        this.alunosCurso = (ArrayList<Pessoa.Aluno>) alunosCurso.clone();
    }
    public ArrayList<Pessoa.Aluno> getAlunosCurso(){
        return this.alunosCurso;
    }

    public void setDuracaoEmHoras(int duracaoEmHoras){
        this.duracaoEmHoras = duracaoEmHoras;
    }
    public int getDuracaoEmHoras(){
        return this.duracaoEmHoras;
    }

    public void setMediaUltimoColocado(float mediaUltimoColocado){
        this.mediaUltimoColocado = mediaUltimoColocado;
    }
    public float getMediaUltimoColocado(){
        return this.mediaUltimoColocado;
    }

    // Seria interessante não deixar que a data de fim fosse antes da de início nem que a de início fosse depois da de fim 
    public void setDataInicio(Date dataInicio){
        this.dataInicio = dataInicio;
    }
    public Date getDataInicio(){
        return this.dataInicio;
    }

    public void setDataFim(Date dataFim){
        this.dataFim = dataFim;
    }
    public Date getDataFim(){
        return this.dataFim;
    }

    // Equals
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && obj.getClass() == this.getClass()){
            Curso e = (Curso) obj;
            ig = (this.nomeCurso.equals(e.nomeCurso) && (this.codCurso == e.codCurso));
            ig = ig && (this.disciplinasCurso.equals(e.disciplinasCurso)) && (this.provasIngresso.equals(e.provasIngresso));
            ig = ig && (this.alunosCurso.equals(e.alunosCurso)) && (this.duracaoEmHoras == e.duracaoEmHoras) && (this.mediaUltimoColocado == e.mediaUltimoColocado);
            ig = ig && (this.dataInicio.equals(e.dataInicio)) && (this.dataFim.equals(e.dataFim));
        }
        else
            ig = false;
        return ig;
    }

    // Clone
    public Object clone(){
        Curso copia = new Curso();

        copia.nomeCurso = this.nomeCurso;
        copia.codCurso = this.codCurso;
        copia.disciplinasCurso = (ArrayList<Disciplina>) this.disciplinasCurso.clone();
        copia.provasIngresso = (ArrayList<ProvasIngresso>) this.provasIngresso.clone();
        copia.alunosCurso = (ArrayList<Pessoa.Aluno>) this.alunosCurso.clone();
        copia.duracaoEmHoras = this.duracaoEmHoras;
        copia.mediaUltimoColocado = this.mediaUltimoColocado;
        copia.dataInicio = this.dataInicio;
        copia.dataFim = this.dataFim;

        return copia;
    }

    // Teste
    public static void main(String[] args) {
        
    }
}
