package br.jp.modelo;

import java.sql.Date;

public class Contencioso {
	
	private int anodoAuto;
	private String bairro;
	private String CEP;
	private String cidade;
	private String CGM;
	private String codigo;
	private String complemento;
	private Date autuacao;
	private Date dateCalCorrecao;
	private Date ciencia;
	private Date inicioProcesso;
	private Date processo;
	private Date prazo;
	private Date registro;
	private String descriInfracao;
	private String designante;
	private int diasPrazo;
	private String endereco;
	private String estado;
	private boolean mercadoriaPerecivel;
	private float multa;
	private String nome;
	private String numero;
	private String numeroAuto;
	private String numeroProcesso;
	private String numeroProcessoAnt;
	private String SPU;
	private String orgaoInicioTram;
	private String orgaoLocal;
	private String orgaoDemanda;
	private String penalidade;
	private String periodoInfracao;
	private String peticionante;
	private float principal;
	private String supervisorFiscal;
	private String tipoAuto;
	private String tipoAutuado;
	private String tipoProcesso;
	private float valorBaseCal;
	private float valorCausa;
	private float UFIRCE;
	
	
	public int getAnodoAuto() {
		return anodoAuto;
	}
	public void setAnodoAuto(int anodoAuto) {
		this.anodoAuto = anodoAuto;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCGM() {
		return CGM;
	}
	public void setCGM(String cGM) {
		CGM = cGM;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Date getAutuacao() {
		return autuacao;
	}
	public void setAutuacao(Date autuacao) {
		this.autuacao = autuacao;
	}
	public Date getDateCalCorrecao() {
		return dateCalCorrecao;
	}
	public void setDateCalCorrecao(Date dateCalCorrecao) {
		this.dateCalCorrecao = dateCalCorrecao;
	}
	public Date getCiencia() {
		return ciencia;
	}
	public void setCiencia(Date ciencia) {
		this.ciencia = ciencia;
	}
	public Date getInicioProcesso() {
		return inicioProcesso;
	}
	public void setInicioProcesso(Date inicioProcesso) {
		this.inicioProcesso = inicioProcesso;
	}
	public Date getProcesso() {
		return processo;
	}
	public void setProcesso(Date processo) {
		this.processo = processo;
	}
	public Date getPrazo() {
		return prazo;
	}
	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}
	public Date getRegistro() {
		return registro;
	}
	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	public String getDescriInfracao() {
		return descriInfracao;
	}
	public void setDescriInfracao(String descriInfracao) {
		this.descriInfracao = descriInfracao;
	}
	public String getDesignante() {
		return designante;
	}
	public void setDesignante(String designante) {
		this.designante = designante;
	}
	public int getDiasPrazo() {
		return diasPrazo;
	}
	public void setDiasPrazo(int diasPrazo) {
		this.diasPrazo = diasPrazo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public boolean isMercadoriaPerecivel() {
		return mercadoriaPerecivel;
	}
	public void setMercadoriaPerecivel(boolean mercadoriaPerecivel) {
		this.mercadoriaPerecivel = mercadoriaPerecivel;
	}
	public float getMulta() {
		return multa;
	}
	public void setMulta(float multa) {
		this.multa = multa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumeroAuto() {
		return numeroAuto;
	}
	public void setNumeroAuto(String numeroAuto) {
		this.numeroAuto = numeroAuto;
	}
	public String getNumeroProcesso() {
		return numeroProcesso;
	}
	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	public String getNumeroProcessoAnt() {
		return numeroProcessoAnt;
	}
	public void setNumeroProcessoAnt(String numeroProcessoAnt) {
		this.numeroProcessoAnt = numeroProcessoAnt;
	}
	public String getSPU() {
		return SPU;
	}
	public void setSPU(String sPU) {
		SPU = sPU;
	}
	public String getOrgaoInicioTram() {
		return orgaoInicioTram;
	}
	public void setOrgaoInicioTram(String orgaoInicioTram) {
		this.orgaoInicioTram = orgaoInicioTram;
	}
	public String getOrgaoLocal() {
		return orgaoLocal;
	}
	public void setOrgaoLocal(String orgaoLocal) {
		this.orgaoLocal = orgaoLocal;
	}
	public String getOrgaoDemanda() {
		return orgaoDemanda;
	}
	public void setOrgaoDemanda(String orgaoDemanda) {
		this.orgaoDemanda = orgaoDemanda;
	}
	public String getPenalidade() {
		return penalidade;
	}
	public void setPenalidade(String penalidade) {
		this.penalidade = penalidade;
	}
	public String getPeriodoInfracao() {
		return periodoInfracao;
	}
	public void setPeriodoInfracao(String periodoInfracao) {
		this.periodoInfracao = periodoInfracao;
	}
	public String getPeticionante() {
		return peticionante;
	}
	public void setPeticionante(String peticionante) {
		this.peticionante = peticionante;
	}
	public float getPrincipal() {
		return principal;
	}
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	public String getSupervisorFiscal() {
		return supervisorFiscal;
	}
	public void setSupervisorFiscal(String supervisorFiscal) {
		this.supervisorFiscal = supervisorFiscal;
	}
	public String getTipoAuto() {
		return tipoAuto;
	}
	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}
	public String getTipoAutuado() {
		return tipoAutuado;
	}
	public void setTipoAutuado(String tipoAutuado) {
		this.tipoAutuado = tipoAutuado;
	}
	public String getTipoProcesso() {
		return tipoProcesso;
	}
	public void setTipoProcesso(String tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}
	public float getValorBaseCal() {
		return valorBaseCal;
	}
	public void setValorBaseCal(float valorBaseCal) {
		this.valorBaseCal = valorBaseCal;
	}
	public float getValorCausa() {
		return valorCausa;
	}
	public void setValorCausa(float valorCausa) {
		this.valorCausa = valorCausa;
	}
	public float getUFIRCE() {
		return UFIRCE;
	}
	public void setUFIRCE(float uFIRCE) {
		UFIRCE = uFIRCE;
	}
	
	
	
	

}
