package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentInitiateOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions;

import javax.validation.Valid;
  
/**
 * BQPaymentInitiateOutputModelDelinquentAccountProcedureInstanceRecord
 */
public class BQPaymentInitiateOutputModelDelinquentAccountProcedureInstanceRecord   {
  private BQPaymentInitiateOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions paymentTransactions = null;


  /**
   * Get paymentTransactions
   * @return paymentTransactions
  **/

  public BQPaymentInitiateOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions getPaymentTransactions() {
    return paymentTransactions;
  }

  public void setPaymentTransactions(BQPaymentInitiateOutputModelDelinquentAccountProcedureInstanceRecordPaymentTransactions paymentTransactions) {
    this.paymentTransactions = paymentTransactions;
  }


}

