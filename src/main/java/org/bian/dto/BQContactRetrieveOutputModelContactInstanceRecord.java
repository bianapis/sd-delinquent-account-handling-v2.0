package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRetrieveOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveOutputModelContactInstanceRecord
 */
public class BQContactRetrieveOutputModelContactInstanceRecord   {
  private BQContactRetrieveOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord customerDelinquentAccountContactRecord = null;


  /**
   * Get customerDelinquentAccountContactRecord
   * @return customerDelinquentAccountContactRecord
  **/

  public BQContactRetrieveOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord getCustomerDelinquentAccountContactRecord() {
    return customerDelinquentAccountContactRecord;
  }

  public void setCustomerDelinquentAccountContactRecord(BQContactRetrieveOutputModelContactInstanceRecordCustomerDelinquentAccountContactRecord customerDelinquentAccountContactRecord) {
    this.customerDelinquentAccountContactRecord = customerDelinquentAccountContactRecord;
  }


}

