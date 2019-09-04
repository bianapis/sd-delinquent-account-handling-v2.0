package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModelPaymentInstanceAnalysis
 */
public class BQPaymentRetrieveOutputModelPaymentInstanceAnalysis   {
  private Object paymentInstanceAnalysisRecord = null;

  private String paymentInstanceAnalysisReportType = null;

  private String paymentInstanceAnalysisParameters = null;

  private Object paymentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentInstanceAnalysisRecord
  **/

  public Object getPaymentInstanceAnalysisRecord() {
    return paymentInstanceAnalysisRecord;
  }

  public void setPaymentInstanceAnalysisRecord(Object paymentInstanceAnalysisRecord) {
    this.paymentInstanceAnalysisRecord = paymentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentInstanceAnalysisReportType
  **/

  public String getPaymentInstanceAnalysisReportType() {
    return paymentInstanceAnalysisReportType;
  }

  public void setPaymentInstanceAnalysisReportType(String paymentInstanceAnalysisReportType) {
    this.paymentInstanceAnalysisReportType = paymentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentInstanceAnalysisParameters
  **/

  public String getPaymentInstanceAnalysisParameters() {
    return paymentInstanceAnalysisParameters;
  }

  public void setPaymentInstanceAnalysisParameters(String paymentInstanceAnalysisParameters) {
    this.paymentInstanceAnalysisParameters = paymentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentInstanceAnalysisReport
  **/

  public Object getPaymentInstanceAnalysisReport() {
    return paymentInstanceAnalysisReport;
  }

  public void setPaymentInstanceAnalysisReport(Object paymentInstanceAnalysisReport) {
    this.paymentInstanceAnalysisReport = paymentInstanceAnalysisReport;
  }


}

