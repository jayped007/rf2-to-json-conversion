/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ihtsdo.json.model;

import java.util.List;

/**
 *
 * @author Alejandro Rodriguez
 */
public class LightDescription extends Component {
    
    Long descriptionId;
    Long conceptId;
    Long type;
    public Long getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(Long descriptionId) {
		this.descriptionId = descriptionId;
	}

	public Long getConceptId() {
		return conceptId;
	}

	public void setConceptId(Long conceptId) {
		this.conceptId = conceptId;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Long getIcs() {
		return ics;
	}

	public void setIcs(Long ics) {
		this.ics = ics;
	}


	String term;
    Long ics;

    public LightDescription() {
    }

    
}
