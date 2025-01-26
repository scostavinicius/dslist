package com.games.dslist.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class ReplacementDTO {
	
	@Autowired
	private Integer sourceIndex;
	
	@Autowired
	private Integer destinationIndex;

	public Integer getSourceIndex() {
		return sourceIndex;
	}

	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}

	public Integer getDestinationIndex() {
		return destinationIndex;
	}

	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
}
