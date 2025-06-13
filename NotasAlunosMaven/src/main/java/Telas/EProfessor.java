// Suap.abstractClass.EProfessor (or similar package based on your project structure)
package Telas; // Adjust package as needed

public class EProfessor {
    private int idProfessor;
    private String nomeUsuario; // Assuming professor's name comes from the linked user
    private String cpfUsuario;  // Assuming professor's CPF comes from the linked user
    private String dataNascUsuario; // Assuming professor's birth date comes from the linked user
    private String sexoUsuario; // Assuming professor's sex comes from the linked user
    private String disciplinaMinistrada;
    private String turmaEnsinada;
    private String grauTitularidade;
    private int idUsuario;

    // Constructor for creating a new EProfessor object from GUI input
    public EProfessor(String nomeUsuario, String cpfUsuario, String dataNascUsuario, String sexoUsuario, String disciplinaMinistrada, String turmaEnsinada, String grauTitularidade, int idUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.dataNascUsuario = dataNascUsuario;
        this.sexoUsuario = sexoUsuario;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.turmaEnsinada = turmaEnsinada;
        this.grauTitularidade = grauTitularidade;
        this.idUsuario = idUsuario;
    }
    
    // Constructor for retrieving from database (with ID)
    public EProfessor(int idProfessor, String nomeUsuario, String cpfUsuario, String dataNascUsuario, String sexoUsuario, String disciplinaMinistrada, String turmaEnsinada, String grauTitularidade, int idUsuario) {
        this.idProfessor = idProfessor;
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.dataNascUsuario = dataNascUsuario;
        this.sexoUsuario = sexoUsuario;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.turmaEnsinada = turmaEnsinada;
        this.grauTitularidade = grauTitularidade;
        this.idUsuario = idUsuario;
    }

    // Getters and Setters
    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getDataNascUsuario() {
        return dataNascUsuario;
    }

    public void setDataNascUsuario(String dataNascUsuario) {
        this.dataNascUsuario = dataNascUsuario;
    }

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(String sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public String getTurmaEnsinada() {
        return turmaEnsinada;
    }

    public void setTurmaEnsinada(String turmaEnsinada) {
        this.turmaEnsinada = turmaEnsinada;
    }

    public String getGrauTitularidade() {
        return grauTitularidade;
    }

    public void setGrauTitularidade(String grauTitularidade) {
        this.grauTitularidade = grauTitularidade;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}