package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveInputModelContactInstanceAnalysis
 */
public class BQContactRetrieveInputModelContactInstanceAnalysis   {
  private String contactInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return contactInstanceAnalysisReference
  **/

  public String getContactInstanceAnalysisReference() {
    return contactInstanceAnalysisReference;
  }

  public void setContactInstanceAnalysisReference(String contactInstanceAnalysisReference) {
    this.contactInstanceAnalysisReference = contactInstanceAnalysisReference;
  }


}

