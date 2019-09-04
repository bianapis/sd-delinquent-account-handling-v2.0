package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecordFeeTransactions
 */
public class CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecordFeeTransactions   {
  private String feeTransactionReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to individual transactions 
   * @return feeTransactionReference
  **/

  public String getFeeTransactionReference() {
    return feeTransactionReference;
  }

  public void setFeeTransactionReference(String feeTransactionReference) {
    this.feeTransactionReference = feeTransactionReference;
  }


}

