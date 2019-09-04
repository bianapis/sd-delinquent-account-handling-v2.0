package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentExchangeInputModelPaymentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPaymentExchangeInputModel
 */
public class BQPaymentExchangeInputModel   {
  private String delinquentAccountProcedureInstanceReference = null;

  private String paymentInstanceReference = null;

  private Object paymentExchangeActionTaskRecord = null;

  private BQPaymentExchangeInputModelPaymentExchangeActionRequest paymentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentExchangeActionTaskRecord
  **/

  public Object getPaymentExchangeActionTaskRecord() {
    return paymentExchangeActionTaskRecord;
  }

  public void setPaymentExchangeActionTaskRecord(Object paymentExchangeActionTaskRecord) {
    this.paymentExchangeActionTaskRecord = paymentExchangeActionTaskRecord;
  }


  /**
   * Get paymentExchangeActionRequest
   * @return paymentExchangeActionRequest
  **/

  public BQPaymentExchangeInputModelPaymentExchangeActionRequest getPaymentExchangeActionRequest() {
    return paymentExchangeActionRequest;
  }

  public void setPaymentExchangeActionRequest(BQPaymentExchangeInputModelPaymentExchangeActionRequest paymentExchangeActionRequest) {
    this.paymentExchangeActionRequest = paymentExchangeActionRequest;
  }


}

