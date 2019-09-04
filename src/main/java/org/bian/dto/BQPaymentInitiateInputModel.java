package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentInitiateInputModelDelinquentAccountProcedureInstanceRecord;
import org.bian.dto.BQPaymentInitiateInputModelPaymentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiateInputModel
 */
public class BQPaymentInitiateInputModel   {
  private BQPaymentInitiateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcedureInstanceReference = null;

  private Object paymentInitiateActionRecord = null;

  private BQPaymentInitiateInputModelPaymentInstanceRecord paymentInstanceRecord = null;


  /**
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public BQPaymentInitiateInputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(BQPaymentInitiateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
    this.delinquentAccountProcedureInstanceRecord = delinquentAccountProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Delinquent Account Procedure instance 
   * @return delinquentAccountProcedureInstanceReference
  **/

  public String getDelinquentAccountProcedureInstanceReference() {
    return delinquentAccountProcedureInstanceReference;
  }

  public void setDelinquentAccountProcedureInstanceReference(String delinquentAccountProcedureInstanceReference) {
    this.delinquentAccountProcedureInstanceReference = delinquentAccountProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentInitiateActionRecord
  **/

  public Object getPaymentInitiateActionRecord() {
    return paymentInitiateActionRecord;
  }

  public void setPaymentInitiateActionRecord(Object paymentInitiateActionRecord) {
    this.paymentInitiateActionRecord = paymentInitiateActionRecord;
  }


  /**
   * Get paymentInstanceRecord
   * @return paymentInstanceRecord
  **/

  public BQPaymentInitiateInputModelPaymentInstanceRecord getPaymentInstanceRecord() {
    return paymentInstanceRecord;
  }

  public void setPaymentInstanceRecord(BQPaymentInitiateInputModelPaymentInstanceRecord paymentInstanceRecord) {
    this.paymentInstanceRecord = paymentInstanceRecord;
  }


}

