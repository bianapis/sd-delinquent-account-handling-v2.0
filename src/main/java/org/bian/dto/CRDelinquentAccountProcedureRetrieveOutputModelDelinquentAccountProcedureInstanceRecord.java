package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType;
import org.bian.dto.CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordLinkedAccounts;
import org.bian.dto.CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordPositionLimits;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordAssociations;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordBillingTransactions;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordCreditPlanReference;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordFeeTransactions;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordInterestTransactions;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordProductTransactions;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecord
 */
public class CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecord   {
  private String productInstanceReference = null;

  private String productAccountNumber = null;

  private String productServiceType = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String issuedDevice = null;

  private String accountCurrency = null;

  private String taxReference = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordAssociations associations = null;

  private CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordPositionLimits positionLimits = null;

  private String collateralAssetAllocationInstanceReference = null;

  private String collateralAssetAllocationProfile = null;

  private CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType dateType = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordBillingTransactions billingTransactions = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions paymentTransactions = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordProductTransactions productTransactions = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordInterestTransactions interestTransactions = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordFeeTransactions feeTransactions = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordCreditPlanReference creditPlanReference = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to an issued device associated with the facility (such as a card or key fob) 
   * @return issuedDevice
  **/

  public String getIssuedDevice() {
    return issuedDevice;
  }

  public void setIssuedDevice(String issuedDevice) {
    this.issuedDevice = issuedDevice;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The primary account currency 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * Get associations
   * @return associations
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer's collateral holdings and allocations 
   * @return collateralAssetAllocationInstanceReference
  **/

  public String getCollateralAssetAllocationInstanceReference() {
    return collateralAssetAllocationInstanceReference;
  }

  public void setCollateralAssetAllocationInstanceReference(String collateralAssetAllocationInstanceReference) {
    this.collateralAssetAllocationInstanceReference = collateralAssetAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of collateral applied to the customer products 
   * @return collateralAssetAllocationProfile
  **/

  public String getCollateralAssetAllocationProfile() {
    return collateralAssetAllocationProfile;
  }

  public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
    this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * Get billingTransactions
   * @return billingTransactions
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordBillingTransactions getBillingTransactions() {
    return billingTransactions;
  }

  public void setBillingTransactions(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordBillingTransactions billingTransactions) {
    this.billingTransactions = billingTransactions;
  }


  /**
   * Get paymentTransactions
   * @return paymentTransactions
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions getPaymentTransactions() {
    return paymentTransactions;
  }

  public void setPaymentTransactions(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
  }


  /**
   * Get productTransactions
   * @return productTransactions
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordProductTransactions getProductTransactions() {
    return productTransactions;
  }

  public void setProductTransactions(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordProductTransactions productTransactions) {
    this.productTransactions = productTransactions;
  }


  /**
   * Get interestTransactions
   * @return interestTransactions
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordInterestTransactions getInterestTransactions() {
    return interestTransactions;
  }

  public void setInterestTransactions(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordInterestTransactions interestTransactions) {
    this.interestTransactions = interestTransactions;
  }


  /**
   * Get feeTransactions
   * @return feeTransactions
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordFeeTransactions getFeeTransactions() {
    return feeTransactions;
  }

  public void setFeeTransactions(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordFeeTransactions feeTransactions) {
    this.feeTransactions = feeTransactions;
  }


  /**
   * Get creditPlanReference
   * @return creditPlanReference
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordCreditPlanReference getCreditPlanReference() {
    return creditPlanReference;
  }

  public void setCreditPlanReference(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecordCreditPlanReference creditPlanReference) {
    this.creditPlanReference = creditPlanReference;
  }


}

