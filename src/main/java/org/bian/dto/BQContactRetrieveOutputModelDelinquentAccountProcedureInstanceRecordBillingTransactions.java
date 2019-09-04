package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveOutputModelDelinquentAccountProcedureInstanceRecordBillingTransactions
 */
public class BQContactRetrieveOutputModelDelinquentAccountProcedureInstanceRecordBillingTransactions   {
  private String billingTransactionReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to individual transactions 
   * @return billingTransactionReference
  **/

  public String getBillingTransactionReference() {
    return billingTransactionReference;
  }

  public void setBillingTransactionReference(String billingTransactionReference) {
    this.billingTransactionReference = billingTransactionReference;
  }


}

