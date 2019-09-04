package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureControlInputModelDelinquentAccountProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureControlInputModel
 */
public class CRDelinquentAccountProcedureControlInputModel   {
  private String delinquentAccountHandlingServicingSessionReference = null;

  private String delinquentAccountProcedureInstanceReference = null;

  private Object delinquentAccountProcedureControlActionTaskRecord = null;

  private CRDelinquentAccountProcedureControlInputModelDelinquentAccountProcedureControlActionRequest delinquentAccountProcedureControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return delinquentAccountProcedureControlActionTaskRecord
  **/

  public Object getDelinquentAccountProcedureControlActionTaskRecord() {
    return delinquentAccountProcedureControlActionTaskRecord;
  }

  public void setDelinquentAccountProcedureControlActionTaskRecord(Object delinquentAccountProcedureControlActionTaskRecord) {
    this.delinquentAccountProcedureControlActionTaskRecord = delinquentAccountProcedureControlActionTaskRecord;
  }


  /**
   * Get delinquentAccountProcedureControlActionRequest
   * @return delinquentAccountProcedureControlActionRequest
  **/

  public CRDelinquentAccountProcedureControlInputModelDelinquentAccountProcedureControlActionRequest getDelinquentAccountProcedureControlActionRequest() {
    return delinquentAccountProcedureControlActionRequest;
  }

  public void setDelinquentAccountProcedureControlActionRequest(CRDelinquentAccountProcedureControlInputModelDelinquentAccountProcedureControlActionRequest delinquentAccountProcedureControlActionRequest) {
    this.delinquentAccountProcedureControlActionRequest = delinquentAccountProcedureControlActionRequest;
  }


}

