package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentUpdateInputModelPaymentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentUpdateOutputModel
 */
public class BQPaymentUpdateOutputModel   {
  private BQPaymentUpdateInputModelPaymentInstanceRecord paymentInstanceRecord = null;

  private String paymentUpdateActionTaskReference = null;

  private Object paymentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get paymentInstanceRecord
   * @return paymentInstanceRecord
  **/

  public BQPaymentUpdateInputModelPaymentInstanceRecord getPaymentInstanceRecord() {
    return paymentInstanceRecord;
  }

  public void setPaymentInstanceRecord(BQPaymentUpdateInputModelPaymentInstanceRecord paymentInstanceRecord) {
    this.paymentInstanceRecord = paymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return paymentUpdateActionTaskReference
  **/

  public String getPaymentUpdateActionTaskReference() {
    return paymentUpdateActionTaskReference;
  }

  public void setPaymentUpdateActionTaskReference(String paymentUpdateActionTaskReference) {
    this.paymentUpdateActionTaskReference = paymentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentUpdateActionTaskRecord
  **/

  public Object getPaymentUpdateActionTaskRecord() {
    return paymentUpdateActionTaskRecord;
  }

  public void setPaymentUpdateActionTaskRecord(Object paymentUpdateActionTaskRecord) {
    this.paymentUpdateActionTaskRecord = paymentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

