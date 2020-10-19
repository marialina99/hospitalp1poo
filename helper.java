package hospital;


public class helper{
	paciente pacientes;
	equipe_medica equipe;
}
class paciente {
	private String NomeP;
	private String DataNascimento;
	private int idade;
	private String historico;
	public String getNomeP() {
		return this.NomeP;
	}
	public void setNomeP(String NomeP) {
		this.NomeP = NomeP;
	}
	public String getDataNascimento() {
		return this.DataNascimento;
	}
	public void setDataNascimento(String DataNascimento) {
		this.DataNascimento = DataNascimento;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getHistorico() {
		return this.historico;
	}
	public void setHistorico(String Historico) {
		this.historico = Historico;
	}
}
class equipe_medica {
	private String MedicoResponsavel;
	private String MedicoAssistente;
	private String Enfermeiro;
	public String getMedicoResponsavel() {
		return this.MedicoResponsavel;
	}
	public void setMedicoResponsavel(String MedicoResponsavel) {
		this.MedicoResponsavel = MedicoResponsavel;
	}
	public String getMedicoAssistente() {
		return this.MedicoAssistente;
	}
	public void setMedicoAssistente(String MedicoAssistente) {
		this.MedicoAssistente = MedicoAssistente;
	}
	public String getEnfermeiro() {
		return this.Enfermeiro;
	}
	public void setEnfermeiro(String Enfermeiro) {
		this.Enfermeiro = Enfermeiro;
	}
	
}