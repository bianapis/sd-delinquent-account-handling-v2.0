package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureInitiateOutputModel
 */
public class CRDelinquentAccountProcedureInitiateOutputModel   {
  private String delinquentAccountProcedureInstanceReference = null;

  private String delinquentAccountProcedureInitiateActionReference = null;

  private Object delinquentAccountProcedureInitiateActionRecord = null;

  private String delinquentAccountProcedureInstanceStatus = null;

  private CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcessingSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Delinquent Account Procedure instance 
   * @return delinquentAccountProcedureInstanceReference
  **/

  public String getDelinquentAccountProcedureInstanceReference() {
    return delinquentAccountProcedureInstanceReference;
  }

  public void setDelinquentAccountProcedureInstanceReference(String delinquentAccountProcedureInstanceReference) {
    this.delinquentAccountProcedureInstanceReference = delinquentAccountProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return delinquentAccountProcedureInitiateActionReference
  **/

  public String getDelinquentAccountProcedureInitiateActionReference() {
    return delinquentAccountProcedureInitiateActionReference;
  }

  public void setDelinquentAccountProcedureInitiateActionReference(String delinquentAccountProcedureInitiateActionReference) {
    this.delinquentAccountProcedureInitiateActionReference = delinquentAccountProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return delinquentAccountProcedureInitiateActionRecord
  **/

  public Object getDelinquentAccountProcedureInitiateActionRecord() {
    return delinquentAccountProcedureInitiateActionRecord;
  }

  public void setDelinquentAccountProcedureInitiateActionRecord(Object delinquentAccountProcedureInitiateActionRecord) {
    this.delinquentAccountProcedureInitiateActionRecord = delinquentAccountProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Delinquent Account Procedure instance (e.g. initialised, pending, active) 
   * @return delinquentAccountProcedureInstanceStatus
  **/

  public String getDelinquentAccountProcedureInstanceStatus() {
    return delinquentAccountProcedureInstanceStatus;
  }

  public void setDelinquentAccountProcedureInstanceStatus(String delinquentAccountProcedureInstanceStatus) {
    this.delinquentAccountProcedureInstanceStatus = delinquentAccountProcedureInstanceStatus;
  }


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


}

