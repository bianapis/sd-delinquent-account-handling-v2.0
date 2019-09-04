package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestInputModelContactInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactRequestOutputModel
 */
public class BQContactRequestOutputModel   {
  private BQContactRequestInputModelContactInstanceRecord contactInstanceRecord = null;

  private String contactRequestActionTaskReference = null;

  private Object contactRequestActionTaskRecord = null;

  private String contactRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get contactInstanceRecord
   * @return contactInstanceRecord
  **/

  public BQContactRequestInputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactRequestInputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact instance request service call 
   * @return contactRequestActionTaskReference
  **/

  public String getContactRequestActionTaskReference() {
    return contactRequestActionTaskReference;
  }

  public void setContactRequestActionTaskReference(String contactRequestActionTaskReference) {
    this.contactRequestActionTaskReference = contactRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return contactRequestActionTaskRecord
  **/

  public Object getContactRequestActionTaskRecord() {
    return contactRequestActionTaskRecord;
  }

  public void setContactRequestActionTaskRecord(Object contactRequestActionTaskRecord) {
    this.contactRequestActionTaskRecord = contactRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Contact service request record 
   * @return contactRequestRecordReference
  **/

  public String getContactRequestRecordReference() {
    return contactRequestRecordReference;
  }

  public void setContactRequestRecordReference(String contactRequestRecordReference) {
    this.contactRequestRecordReference = contactRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

