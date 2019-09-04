package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExchangeOutputModel
 */
public class BQPaymentExchangeOutputModel   {
  private String paymentExchangeActionTaskReference = null;

  private Object paymentExchangeActionTaskRecord = null;

  private String paymentExchangeActionResponse = null;

  private String paymentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment instance exchange service call 
   * @return paymentExchangeActionTaskReference
  **/

  public String getPaymentExchangeActionTaskReference() {
    return paymentExchangeActionTaskReference;
  }

  public void setPaymentExchangeActionTaskReference(String paymentExchangeActionTaskReference) {
    this.paymentExchangeActionTaskReference = paymentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return paymentExchangeActionResponse
  **/

  public String getPaymentExchangeActionResponse() {
    return paymentExchangeActionResponse;
  }

  public void setPaymentExchangeActionResponse(String paymentExchangeActionResponse) {
    this.paymentExchangeActionResponse = paymentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment instance (e.g. accepted, rejected, verified) 
   * @return paymentInstanceStatus
  **/

  public String getPaymentInstanceStatus() {
    return paymentInstanceStatus;
  }

  public void setPaymentInstanceStatus(String paymentInstanceStatus) {
    this.paymentInstanceStatus = paymentInstanceStatus;
  }


}

