package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureExecuteOutputModel
 */
public class CRDelinquentAccountProcedureExecuteOutputModel   {
  private CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcessingSchedule = null;

  private String delinquentAccountProcedureExecuteActionTaskReference = null;

  private Object delinquentAccountProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Delinquent Account Procedure instance execute service call 
   * @return delinquentAccountProcedureExecuteActionTaskReference
  **/

  public String getDelinquentAccountProcedureExecuteActionTaskReference() {
    return delinquentAccountProcedureExecuteActionTaskReference;
  }

  public void setDelinquentAccountProcedureExecuteActionTaskReference(String delinquentAccountProcedureExecuteActionTaskReference) {
    this.delinquentAccountProcedureExecuteActionTaskReference = delinquentAccountProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return delinquentAccountProcedureExecuteActionTaskRecord
  **/

  public Object getDelinquentAccountProcedureExecuteActionTaskRecord() {
    return delinquentAccountProcedureExecuteActionTaskRecord;
  }

  public void setDelinquentAccountProcedureExecuteActionTaskRecord(Object delinquentAccountProcedureExecuteActionTaskRecord) {
    this.delinquentAccountProcedureExecuteActionTaskRecord = delinquentAccountProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

