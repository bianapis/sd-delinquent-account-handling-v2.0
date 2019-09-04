package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveOutputModelContactInstanceReport
 */
public class BQContactRetrieveOutputModelContactInstanceReport   {
  private Object contactInstanceReportRecord = null;

  private String contactInstanceReportType = null;

  private String contactInstanceReportParameters = null;

  private Object contactInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return contactInstanceReportRecord
  **/

  public Object getContactInstanceReportRecord() {
    return contactInstanceReportRecord;
  }

  public void setContactInstanceReportRecord(Object contactInstanceReportRecord) {
    this.contactInstanceReportRecord = contactInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return contactInstanceReportType
  **/

  public String getContactInstanceReportType() {
    return contactInstanceReportType;
  }

  public void setContactInstanceReportType(String contactInstanceReportType) {
    this.contactInstanceReportType = contactInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return contactInstanceReportParameters
  **/

  public String getContactInstanceReportParameters() {
    return contactInstanceReportParameters;
  }

  public void setContactInstanceReportParameters(String contactInstanceReportParameters) {
    this.contactInstanceReportParameters = contactInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return contactInstanceReport
  **/

  public Object getContactInstanceReport() {
    return contactInstanceReport;
  }

  public void setContactInstanceReport(Object contactInstanceReport) {
    this.contactInstanceReport = contactInstanceReport;
  }


}

