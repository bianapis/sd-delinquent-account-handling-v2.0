package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureUpdateOutputModel
 */
public class CRDelinquentAccountProcedureUpdateOutputModel   {
  private CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcessingSchedule = null;

  private String delinquentAccountProcedureUpdateActionTaskReference = null;

  private Object delinquentAccountProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(CRDelinquentAccountProcedureUpdateInputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return delinquentAccountProcedureUpdateActionTaskReference
  **/

  public String getDelinquentAccountProcedureUpdateActionTaskReference() {
    return delinquentAccountProcedureUpdateActionTaskReference;
  }

  public void setDelinquentAccountProcedureUpdateActionTaskReference(String delinquentAccountProcedureUpdateActionTaskReference) {
    this.delinquentAccountProcedureUpdateActionTaskReference = delinquentAccountProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return delinquentAccountProcedureUpdateActionTaskRecord
  **/

  public Object getDelinquentAccountProcedureUpdateActionTaskRecord() {
    return delinquentAccountProcedureUpdateActionTaskRecord;
  }

  public void setDelinquentAccountProcedureUpdateActionTaskRecord(Object delinquentAccountProcedureUpdateActionTaskRecord) {
    this.delinquentAccountProcedureUpdateActionTaskRecord = delinquentAccountProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

