package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestInputModelContactInstanceRecordCustomerDelinquentAccountContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactRequestInputModelContactInstanceRecord
 */
public class BQContactRequestInputModelContactInstanceRecord   {
  private BQContactRequestInputModelContactInstanceRecordCustomerDelinquentAccountContactRecord customerDelinquentAccountContactRecord = null;


  /**
   * Get customerDelinquentAccountContactRecord
   * @return customerDelinquentAccountContactRecord
  **/

  public BQContactRequestInputModelContactInstanceRecordCustomerDelinquentAccountContactRecord getCustomerDelinquentAccountContactRecord() {
    return customerDelinquentAccountContactRecord;
  }

  public void setCustomerDelinquentAccountContactRecord(BQContactRequestInputModelContactInstanceRecordCustomerDelinquentAccountContactRecord customerDelinquentAccountContactRecord) {
    this.customerDelinquentAccountContactRecord = customerDelinquentAccountContactRecord;
  }


}

