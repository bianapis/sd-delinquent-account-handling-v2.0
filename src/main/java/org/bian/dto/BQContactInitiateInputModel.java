package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateInputModelDelinquentAccountProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactInitiateInputModel
 */
public class BQContactInitiateInputModel   {
  private BQContactInitiateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcessingSchedule = null;

  private String delinquentAccountProcedureInstanceReference = null;

  private Object contactInitiateActionRecord = null;


  /**
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public BQContactInitiateInputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(BQContactInitiateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
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
   * @return contactInitiateActionRecord
  **/

  public Object getContactInitiateActionRecord() {
    return contactInitiateActionRecord;
  }

  public void setContactInitiateActionRecord(Object contactInitiateActionRecord) {
    this.contactInitiateActionRecord = contactInitiateActionRecord;
  }


}

