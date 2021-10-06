package com.dhl.clearance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CategorizationResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@JsonProperty("Value")
	private java.lang.Integer value;
	@JsonProperty("Category")
	private java.lang.String category;

	public CategorizationResult() {
	}

	public java.lang.Integer getValue() {
		return this.value;
	}

	public void setValue(java.lang.Integer value) {
		this.value = value;
	}

	public CategorizationResult(java.lang.Integer value, java.lang.String category) {
		this.value = value;
		this.category = category;
	}

	public CategorizationResult() {
	}

	public java.lang.String getCategory() {
		return category;
	}

	public void setCategory(java.lang.String category) {
		this.category = category;
	}
	
    @Override
    public String toString() {
        return "{" +
                "Value='" + value + '\'' +
                ", Category='" + category + '\'' +
                '}';
    }	
}