package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentUpdateInputModelPaymentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentUpdateInputModel
 */
public class BQPaymentUpdateInputModel   {
  private String delinquentAccountProcedureInstanceReference = null;

  private String paymentInstanceReference = null;

  private BQPaymentUpdateInputModelPaymentInstanceRecord paymentInstanceRecord = null;

  private Object paymentUpdateActionTaskRecord = null;

  private String paymentUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Delinquent Account Procedure instance 
   * @return delinquentAccountProcedureInstanceReference
  **/

  public String getDelinquentAccountProcedureInstanceReference() {
    return delinquentAccountProcedureInstanceReference;
  }

  public void setDelinquentAccountProcedureInstanceReference(String delinquentAccountProcedureInstanceReference) {
    this.delinquentAccountProcedureInstanceReference = delinquentAccountProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment instance 
   * @return paymentInstanceReference
  **/

  public String getPaymentInstanceReference() {
    return paymentInstanceReference;
  }

  public void setPaymentInstanceReference(String paymentInstanceReference) {
    this.paymentInstanceReference = paymentInstanceReference;
  }


  /**
   * Get paymentInstanceRecord
   * @return paymentInstanceRecord
  **/

  public BQPaymentUpdateInputModelPaymentInstanceRecord getPaymentInstanceRecord() {
    return paymentInstanceRecord;
  }

  public void setPaymentInstanceRecord(BQPaymentUpdateInputModelPaymentInstanceRecord paymentInstanceRecord) {
    this.paymentInstanceRecord = paymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentUpdateActionTaskRecord
  **/

  public Object getPaymentUpdateActionTaskRecord() {
    return paymentUpdateActionTaskRecord;
  }

  public void setPaymentUpdateActionTaskRecord(Object paymentUpdateActionTaskRecord) {
    this.paymentUpdateActionTaskRecord = paymentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return paymentUpdateActionRequest
  **/

  public String getPaymentUpdateActionRequest() {
    return paymentUpdateActionRequest;
  }

  public void setPaymentUpdateActionRequest(String paymentUpdateActionRequest) {
    this.paymentUpdateActionRequest = paymentUpdateActionRequest;
  }


}

