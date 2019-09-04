package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestInputModelContactInstanceRecord;
import org.bian.dto.BQContactRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQContactRequestInputModel
 */
public class BQContactRequestInputModel   {
  private String delinquentAccountProcedureInstanceReference = null;

  private String contactInstanceReference = null;

  private BQContactRequestInputModelContactInstanceRecord contactInstanceRecord = null;

  private Object contactRequestActionTaskRecord = null;

  private BQContactRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Contact instance 
   * @return contactInstanceReference
  **/

  public String getContactInstanceReference() {
    return contactInstanceReference;
  }

  public void setContactInstanceReference(String contactInstanceReference) {
    this.contactInstanceReference = contactInstanceReference;
  }


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQContactRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQContactRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

