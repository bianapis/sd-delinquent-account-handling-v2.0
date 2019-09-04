package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureInitiateInputModel
 */
public class CRDelinquentAccountProcedureInitiateInputModel   {
  private String delinquentAccountHandlingServicingSessionReference = null;

  private Object delinquentAccountProcedureInitiateActionRecord = null;

  private String delinquentAccountProcedureInstanceStatus = null;

  private CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;


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

  public CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
    this.delinquentAccountProcedureInstanceRecord = delinquentAccountProcedureInstanceRecord;
  }


}

