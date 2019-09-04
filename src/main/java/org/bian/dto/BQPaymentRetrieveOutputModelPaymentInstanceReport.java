package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModelPaymentInstanceReport
 */
public class BQPaymentRetrieveOutputModelPaymentInstanceReport   {
  private Object paymentInstanceReportRecord = null;

  private String paymentInstanceReportType = null;

  private String paymentInstanceReportParameters = null;

  private Object paymentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentInstanceReportRecord
  **/

  public Object getPaymentInstanceReportRecord() {
    return paymentInstanceReportRecord;
  }

  public void setPaymentInstanceReportRecord(Object paymentInstanceReportRecord) {
    this.paymentInstanceReportRecord = paymentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentInstanceReportType
  **/

  public String getPaymentInstanceReportType() {
    return paymentInstanceReportType;
  }

  public void setPaymentInstanceReportType(String paymentInstanceReportType) {
    this.paymentInstanceReportType = paymentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentInstanceReportParameters
  **/

  public String getPaymentInstanceReportParameters() {
    return paymentInstanceReportParameters;
  }

  public void setPaymentInstanceReportParameters(String paymentInstanceReportParameters) {
    this.paymentInstanceReportParameters = paymentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentInstanceReport
  **/

  public Object getPaymentInstanceReport() {
    return paymentInstanceReport;
  }

  public void setPaymentInstanceReport(Object paymentInstanceReport) {
    this.paymentInstanceReport = paymentInstanceReport;
  }


}

