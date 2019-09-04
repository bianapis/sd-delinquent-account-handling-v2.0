package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureExecuteInputModelDelinquentAccountProcedureInstanceRecord;
import org.bian.dto.CRDelinquentAccountProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureExecuteInputModel
 */
public class CRDelinquentAccountProcedureExecuteInputModel   {
  private String delinquentAccountHandlingServicingSessionReference = null;

  private String delinquentAccountProcedureInstanceReference = null;

  private CRDelinquentAccountProcedureExecuteInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private Object delinquentAccountProcedureExecuteActionTaskRecord = null;

  private CRDelinquentAccountProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return delinquentAccountHandlingServicingSessionReference
  **/

  public String getDelinquentAccountHandlingServicingSessionReference() {
    return delinquentAccountHandlingServicingSessionReference;
  }

  public void setDelinquentAccountHandlingServicingSessionReference(String delinquentAccountHandlingServicingSessionReference) {
    this.delinquentAccountHandlingServicingSessionReference = delinquentAccountHandlingServicingSessionReference;
  }


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
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public CRDelinquentAccountProcedureExecuteInputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(CRDelinquentAccountProcedureExecuteInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
    this.delinquentAccountProcedureInstanceRecord = delinquentAccountProcedureInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRDelinquentAccountProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRDelinquentAccountProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

