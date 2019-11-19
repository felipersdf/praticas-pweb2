package br.edu.ifpb.pweb2.model;

public enum EstadoCivilEnum {
	
	SOLTEIRO("Solteiro"),
	CASADO("Casado"),
	DIVORCIADO("Divorciado"),
	UNIAO_ESTAVEL("União Estável"),
	VIUVO("Viúvo");
	
	private String label;

	private EstadoCivilEnum(String label) {
		this.label = label;
	}
	public String getLabel() {
		return label;
	}
	
}
