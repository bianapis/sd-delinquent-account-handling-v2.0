package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordCreditPlanReference
 */
public class CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordCreditPlanReference   {
  private String productInstanceReference = null;

  private String creditPlanType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The linked credit product reference 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The credit plan type (e.g. (Cash, Credit, Charge, Balance Transfer, Promotions, Securitized, etc.) 
   * @return creditPlanType
  **/

  public String getCreditPlanType() {
    return creditPlanType;
  }

  public void setCreditPlanType(String creditPlanType) {
    this.creditPlanType = creditPlanType;
  }


}

