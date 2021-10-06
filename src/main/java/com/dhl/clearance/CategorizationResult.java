package com.dhl.clearance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CategorizationResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@JsonProperty("Category")
	private java.lang.String category;
	@JsonProperty("Value")
	private java.lang.Integer value;


	public CategorizationResult() {
	}

	public CategorizationResult(java.lang.Integer value, java.lang.String category) {
		this.value = value;
		this.category = category;
	}
	
	public java.lang.String getCategory() {
		return category;
	}

	public void setCategory(java.lang.String category) {
		this.category = category;
	}
	
	public java.lang.Integer getValue() {
		return this.value;
	}

	public void setValue(java.lang.Integer value) {
		this.value = value;
	}
	
    @Override
    public String toString() {
        return "{" +
                "Value='" + value + '\'' +
                ", Category='" + category + '\'' +
                '}';
    }	
}