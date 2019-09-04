package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecord;
import org.bian.dto.BQPaymentRetrieveOutputModelPaymentInstanceAnalysis;
import org.bian.dto.BQPaymentRetrieveOutputModelPaymentInstanceRecord;
import org.bian.dto.BQPaymentRetrieveOutputModelPaymentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModel
 */
public class BQPaymentRetrieveOutputModel   {
  private BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private BQPaymentRetrieveOutputModelPaymentInstanceRecord paymentInstanceRecord = null;

  private String paymentRetrieveActionTaskReference = null;

  private Object paymentRetrieveActionTaskRecord = null;

  private String paymentRetrieveActionResponse = null;

  private BQPaymentRetrieveOutputModelPaymentInstanceReport paymentInstanceReport = null;

  private BQPaymentRetrieveOutputModelPaymentInstanceAnalysis paymentInstanceAnalysis = null;


  /**
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
    this.delinquentAccountProcedureInstanceRecord = delinquentAccountProcedureInstanceRecord;
  }


  /**
   * Get paymentInstanceRecord
   * @return paymentInstanceRecord
  **/

  public BQPaymentRetrieveOutputModelPaymentInstanceRecord getPaymentInstanceRecord() {
    return paymentInstanceRecord;
  }

  public void setPaymentInstanceRecord(BQPaymentRetrieveOutputModelPaymentInstanceRecord paymentInstanceRecord) {
    this.paymentInstanceRecord = paymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment instance retrieve service call 
   * @return paymentRetrieveActionTaskReference
  **/

  public String getPaymentRetrieveActionTaskReference() {
    return paymentRetrieveActionTaskReference;
  }

  public void setPaymentRetrieveActionTaskReference(String paymentRetrieveActionTaskReference) {
    this.paymentRetrieveActionTaskReference = paymentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentRetrieveActionResponse
  **/

  public String getPaymentRetrieveActionResponse() {
    return paymentRetrieveActionResponse;
  }

  public void setPaymentRetrieveActionResponse(String paymentRetrieveActionResponse) {
    this.paymentRetrieveActionResponse = paymentRetrieveActionResponse;
  }


  /**
   * Get paymentInstanceReport
   * @return paymentInstanceReport
  **/

  public BQPaymentRetrieveOutputModelPaymentInstanceReport getPaymentInstanceReport() {
    return paymentInstanceReport;
  }

  public void setPaymentInstanceReport(BQPaymentRetrieveOutputModelPaymentInstanceReport paymentInstanceReport) {
    this.paymentInstanceReport = paymentInstanceReport;
  }


  /**
   * Get paymentInstanceAnalysis
   * @return paymentInstanceAnalysis
  **/

  public BQPaymentRetrieveOutputModelPaymentInstanceAnalysis getPaymentInstanceAnalysis() {
    return paymentInstanceAnalysis;
  }

  public void setPaymentInstanceAnalysis(BQPaymentRetrieveOutputModelPaymentInstanceAnalysis paymentInstanceAnalysis) {
    this.paymentInstanceAnalysis = paymentInstanceAnalysis;
  }


}

