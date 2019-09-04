package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions
 */
public class BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions   {
  private String paymentTransactionReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to individual transactions 
   * @return paymentTransactionReference
  **/

  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }

  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


}

