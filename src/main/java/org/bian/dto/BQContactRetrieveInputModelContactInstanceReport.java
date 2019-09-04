package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveInputModelContactInstanceReport
 */
public class BQContactRetrieveInputModelContactInstanceReport   {
  private String contactInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return contactInstanceReportReference
  **/

  public String getContactInstanceReportReference() {
    return contactInstanceReportReference;
  }

  public void setContactInstanceReportReference(String contactInstanceReportReference) {
    this.contactInstanceReportReference = contactInstanceReportReference;
  }


}

