package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveOutputModelContactInstanceAnalysis
 */
public class BQContactRetrieveOutputModelContactInstanceAnalysis   {
  private Object contactInstanceAnalysisRecord = null;

  private String contactInstanceAnalysisReportType = null;

  private String contactInstanceAnalysisParameters = null;

  private Object contactInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return contactInstanceAnalysisRecord
  **/

  public Object getContactInstanceAnalysisRecord() {
    return contactInstanceAnalysisRecord;
  }

  public void setContactInstanceAnalysisRecord(Object contactInstanceAnalysisRecord) {
    this.contactInstanceAnalysisRecord = contactInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return contactInstanceAnalysisReportType
  **/

  public String getContactInstanceAnalysisReportType() {
    return contactInstanceAnalysisReportType;
  }

  public void setContactInstanceAnalysisReportType(String contactInstanceAnalysisReportType) {
    this.contactInstanceAnalysisReportType = contactInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return contactInstanceAnalysisParameters
  **/

  public String getContactInstanceAnalysisParameters() {
    return contactInstanceAnalysisParameters;
  }

  public void setContactInstanceAnalysisParameters(String contactInstanceAnalysisParameters) {
    this.contactInstanceAnalysisParameters = contactInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return contactInstanceAnalysisReport
  **/

  public Object getContactInstanceAnalysisReport() {
    return contactInstanceAnalysisReport;
  }

  public void setContactInstanceAnalysisReport(Object contactInstanceAnalysisReport) {
    this.contactInstanceAnalysisReport = contactInstanceAnalysisReport;
  }


}

