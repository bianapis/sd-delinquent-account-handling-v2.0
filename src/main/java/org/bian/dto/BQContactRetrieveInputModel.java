package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRetrieveInputModelContactInstanceAnalysis;
import org.bian.dto.BQContactRetrieveInputModelContactInstanceReport;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveInputModel
 */
public class BQContactRetrieveInputModel   {
  private Object contactRetrieveActionTaskRecord = null;

  private String contactRetrieveActionRequest = null;

  private BQContactRetrieveInputModelContactInstanceReport contactInstanceReport = null;

  private BQContactRetrieveInputModelContactInstanceAnalysis contactInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return contactRetrieveActionTaskRecord
  **/

  public Object getContactRetrieveActionTaskRecord() {
    return contactRetrieveActionTaskRecord;
  }

  public void setContactRetrieveActionTaskRecord(Object contactRetrieveActionTaskRecord) {
    this.contactRetrieveActionTaskRecord = contactRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return contactRetrieveActionRequest
  **/

  public String getContactRetrieveActionRequest() {
    return contactRetrieveActionRequest;
  }

  public void setContactRetrieveActionRequest(String contactRetrieveActionRequest) {
    this.contactRetrieveActionRequest = contactRetrieveActionRequest;
  }


  /**
   * Get contactInstanceReport
   * @return contactInstanceReport
  **/

  public BQContactRetrieveInputModelContactInstanceReport getContactInstanceReport() {
    return contactInstanceReport;
  }

  public void setContactInstanceReport(BQContactRetrieveInputModelContactInstanceReport contactInstanceReport) {
    this.contactInstanceReport = contactInstanceReport;
  }


  /**
   * Get contactInstanceAnalysis
   * @return contactInstanceAnalysis
  **/

  public BQContactRetrieveInputModelContactInstanceAnalysis getContactInstanceAnalysis() {
    return contactInstanceAnalysis;
  }

  public void setContactInstanceAnalysis(BQContactRetrieveInputModelContactInstanceAnalysis contactInstanceAnalysis) {
    this.contactInstanceAnalysis = contactInstanceAnalysis;
  }


}

