package com.dhl.clearance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CategorizationRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Value")
	private java.lang.Integer value;

	public CategorizationRequest() {
	}

	public java.lang.Integer getValue() {
		return this.value;
	}

	public void setValue(java.lang.Integer value) {
		this.value = value;
	}

	public CategorizationRequest(java.lang.Integer value) {
		this.value = value;
	}

}