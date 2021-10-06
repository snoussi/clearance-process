package com.dhl.clearance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CategorizationRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@JsonProperty("Value")
	private java.lang.Integer value;

	public CategorizationRequest() {
	}

	public java.lang.Integer getValue() {
		return this.value;
	}

	public void setValue(java.lang.Integer value) {
		this.value = value;
	}

	public CategorizationRequest() {
	}

	public CategorizationRequest(java.lang.Integer value) {
		this.value = value;
	}

    @Override
    public String toString() {
        return "{" +
                "Value='" + value + '\'' +
                '}';
    }
}