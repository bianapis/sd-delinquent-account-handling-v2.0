package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordProductTransactions
 */
public class CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordProductTransactions   {
  private String productTransactionReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to individual transactions 
   * @return productTransactionReference
  **/

  public String getProductTransactionReference() {
    return productTransactionReference;
  }

  public void setProductTransactionReference(String productTransactionReference) {
    this.productTransactionReference = productTransactionReference;
  }


}

