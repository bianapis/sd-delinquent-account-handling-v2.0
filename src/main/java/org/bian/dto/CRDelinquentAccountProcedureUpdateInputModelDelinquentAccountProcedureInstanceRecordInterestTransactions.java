package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecordInterestTransactions
 */
public class CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecordInterestTransactions   {
  private String interestTransactionReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to individual transactions 
   * @return interestTransactionReference
  **/

  public String getInterestTransactionReference() {
    return interestTransactionReference;
  }

  public void setInterestTransactionReference(String interestTransactionReference) {
    this.interestTransactionReference = interestTransactionReference;
  }


}

