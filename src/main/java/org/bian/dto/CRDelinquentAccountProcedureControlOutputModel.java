package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureControlOutputModel
 */
public class CRDelinquentAccountProcedureControlOutputModel   {
  private String delinquentAccountProcedureControlActionTaskReference = null;

  private Object delinquentAccountProcedureControlActionTaskRecord = null;

  private String delinquentAccountProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Delinquent Account Procedure instance control processing service call 
   * @return delinquentAccountProcedureControlActionTaskReference
  **/

  public String getDelinquentAccountProcedureControlActionTaskReference() {
    return delinquentAccountProcedureControlActionTaskReference;
  }

  public void setDelinquentAccountProcedureControlActionTaskReference(String delinquentAccountProcedureControlActionTaskReference) {
    this.delinquentAccountProcedureControlActionTaskReference = delinquentAccountProcedureControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return delinquentAccountProcedureControlActionResponse
  **/

  public String getDelinquentAccountProcedureControlActionResponse() {
    return delinquentAccountProcedureControlActionResponse;
  }

  public void setDelinquentAccountProcedureControlActionResponse(String delinquentAccountProcedureControlActionResponse) {
    this.delinquentAccountProcedureControlActionResponse = delinquentAccountProcedureControlActionResponse;
  }


}

