package com.eyob.brandvalidator.model.recall;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {

	@JsonProperty("results")
	private List<Recall> recalls;

	public Results() {
		recalls = new ArrayList<>();
	}

	public List<Recall> getRecalls() {
		return recalls;
	}

	public void setRecalls(List<Recall> recalls) {
		this.recalls = recalls;
	}
	
	
	
}
