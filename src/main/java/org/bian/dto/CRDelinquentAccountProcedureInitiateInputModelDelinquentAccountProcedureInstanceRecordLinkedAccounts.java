package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordLinkedAccounts
 */
public class CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordLinkedAccounts   {
  private String linkType = null;

  private String accountDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type and purpose for the link 
   * @return linkType
  **/

  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the linked account 
   * @return accountDetails
  **/

  public String getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
  }


}

