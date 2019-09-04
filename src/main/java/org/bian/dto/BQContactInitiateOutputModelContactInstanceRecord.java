package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactInitiateOutputModelContactInstanceRecord
 */
public class BQContactInitiateOutputModelContactInstanceRecord   {
  private BQContactInitiateOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord customerDelinquentAccountContactRecord = null;

  private String delinquentAccountContactResult = null;

  private String delinquentAccountContactWorkProduct = null;


  /**
   * Get customerDelinquentAccountContactRecord
   * @return customerDelinquentAccountContactRecord
  **/

  public BQContactInitiateOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord getCustomerDelinquentAccountContactRecord() {
    return customerDelinquentAccountContactRecord;
  }

  public void setCustomerDelinquentAccountContactRecord(BQContactInitiateOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord customerDelinquentAccountContactRecord) {
    this.customerDelinquentAccountContactRecord = customerDelinquentAccountContactRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the tracking and reminder activity 
   * @return delinquentAccountContactResult
  **/

  public String getDelinquentAccountContactResult() {
    return delinquentAccountContactResult;
  }

  public void setDelinquentAccountContactResult(String delinquentAccountContactResult) {
    this.delinquentAccountContactResult = delinquentAccountContactResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return delinquentAccountContactWorkProduct
  **/

  public String getDelinquentAccountContactWorkProduct() {
    return delinquentAccountContactWorkProduct;
  }

  public void setDelinquentAccountContactWorkProduct(String delinquentAccountContactWorkProduct) {
    this.delinquentAccountContactWorkProduct = delinquentAccountContactWorkProduct;
  }


}

