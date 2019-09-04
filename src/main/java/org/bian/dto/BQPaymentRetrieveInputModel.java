package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentRetrieveInputModelPaymentInstanceAnalysis;
import org.bian.dto.BQPaymentRetrieveInputModelPaymentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveInputModel
 */
public class BQPaymentRetrieveInputModel   {
  private Object paymentRetrieveActionTaskRecord = null;

  private String paymentRetrieveActionRequest = null;

  private BQPaymentRetrieveInputModelPaymentInstanceReport paymentInstanceReport = null;

  private BQPaymentRetrieveInputModelPaymentInstanceAnalysis paymentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentRetrieveActionTaskRecord
  **/

  public Object getPaymentRetrieveActionTaskRecord() {
    return paymentRetrieveActionTaskRecord;
  }

  public void setPaymentRetrieveActionTaskRecord(Object paymentRetrieveActionTaskRecord) {
    this.paymentRetrieveActionTaskRecord = paymentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentRetrieveActionRequest
  **/

  public String getPaymentRetrieveActionRequest() {
    return paymentRetrieveActionRequest;
  }

  public void setPaymentRetrieveActionRequest(String paymentRetrieveActionRequest) {
    this.paymentRetrieveActionRequest = paymentRetrieveActionRequest;
  }


  /**
   * Get paymentInstanceReport
   * @return paymentInstanceReport
  **/

  public BQPaymentRetrieveInputModelPaymentInstanceReport getPaymentInstanceReport() {
    return paymentInstanceReport;
  }

  public void setPaymentInstanceReport(BQPaymentRetrieveInputModelPaymentInstanceReport paymentInstanceReport) {
    this.paymentInstanceReport = paymentInstanceReport;
  }


  /**
   * Get paymentInstanceAnalysis
   * @return paymentInstanceAnalysis
  **/

  public BQPaymentRetrieveInputModelPaymentInstanceAnalysis getPaymentInstanceAnalysis() {
    return paymentInstanceAnalysis;
  }

  public void setPaymentInstanceAnalysis(BQPaymentRetrieveInputModelPaymentInstanceAnalysis paymentInstanceAnalysis) {
    this.paymentInstanceAnalysis = paymentInstanceAnalysis;
  }


}

