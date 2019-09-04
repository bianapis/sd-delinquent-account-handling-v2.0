package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateOutputModelContactInstanceRecord;
import org.bian.dto.CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactInitiateOutputModel
 */
public class BQContactInitiateOutputModel   {
  private CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcessingSchedule = null;

  private String contactInstanceReference = null;

  private String contactInitiateActionReference = null;

  private Object contactInitiateActionRecord = null;

  private String contactInstanceStatus = null;

  private BQContactInitiateOutputModelContactInstanceRecord contactInstanceRecord = null;


  /**
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
    this.delinquentAccountProcedureInstanceRecord = delinquentAccountProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the schedule of actions to be applied to the delinquent account 
   * @return delinquentAccountProcessingSchedule
  **/

  public String getDelinquentAccountProcessingSchedule() {
    return delinquentAccountProcessingSchedule;
  }

  public void setDelinquentAccountProcessingSchedule(String delinquentAccountProcessingSchedule) {
    this.delinquentAccountProcessingSchedule = delinquentAccountProcessingSchedule;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return contactInitiateActionReference
  **/

  public String getContactInitiateActionReference() {
    return contactInitiateActionReference;
  }

  public void setContactInitiateActionReference(String contactInitiateActionReference) {
    this.contactInitiateActionReference = contactInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return contactInitiateActionRecord
  **/

  public Object getContactInitiateActionRecord() {
    return contactInitiateActionRecord;
  }

  public void setContactInitiateActionRecord(Object contactInitiateActionRecord) {
    this.contactInitiateActionRecord = contactInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Contact instance (e.g. initialised, pending, active) 
   * @return contactInstanceStatus
  **/

  public String getContactInstanceStatus() {
    return contactInstanceStatus;
  }

  public void setContactInstanceStatus(String contactInstanceStatus) {
    this.contactInstanceStatus = contactInstanceStatus;
  }


  /**
   * Get contactInstanceRecord
   * @return contactInstanceRecord
  **/

  public BQContactInitiateOutputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactInitiateOutputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
  }


}

