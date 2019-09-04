package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions;

import javax.validation.Valid;
  
/**
 * BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecord
 */
public class BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecord   {
  private String productInstanceReference = null;

  private String productAccountNumber = null;

  private String productServiceType = null;

  private String customerReference = null;

  private BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions paymentTransactions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated account number in any suitable format (e.g. IBAN) 
   * @return productAccountNumber
  **/

  public String getProductAccountNumber() {
    return productAccountNumber;
  }

  public void setProductAccountNumber(String productAccountNumber) {
    this.productAccountNumber = productAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of product 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Get paymentTransactions
   * @return paymentTransactions
  **/

  public BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions getPaymentTransactions() {
    return paymentTransactions;
  }

  public void setPaymentTransactions(BQPaymentRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
  }


}

