package com.etlions.serverless.multiplexortemplate.utils;

public enum TypeException {

	I("Informativo"), A("Advertencia"), E("Error");

	private final String value;

	private TypeException(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	public String getValue() {
		return value;
	}
}