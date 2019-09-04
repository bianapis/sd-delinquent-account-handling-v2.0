package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceAnalysis;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecord;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveOutputModel
 */
public class CRDelinquentAccountProcedureRetrieveOutputModel   {
  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcessingSchedule = null;

  private String delinquentAccountProcedureRetrieveActionTaskReference = null;

  private Object delinquentAccountProcedureRetrieveActionTaskRecord = null;

  private String delinquentAccountProcedureRetrieveActionResponse = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceReportRecord delinquentAccountProcedureInstanceReportRecord = null;

  private CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceAnalysis delinquentAccountProcedureInstanceAnalysis = null;


  /**
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Delinquent Account Procedure instance retrieve service call 
   * @return delinquentAccountProcedureRetrieveActionTaskReference
  **/

  public String getDelinquentAccountProcedureRetrieveActionTaskReference() {
    return delinquentAccountProcedureRetrieveActionTaskReference;
  }

  public void setDelinquentAccountProcedureRetrieveActionTaskReference(String delinquentAccountProcedureRetrieveActionTaskReference) {
    this.delinquentAccountProcedureRetrieveActionTaskReference = delinquentAccountProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return delinquentAccountProcedureRetrieveActionTaskRecord
  **/

  public Object getDelinquentAccountProcedureRetrieveActionTaskRecord() {
    return delinquentAccountProcedureRetrieveActionTaskRecord;
  }

  public void setDelinquentAccountProcedureRetrieveActionTaskRecord(Object delinquentAccountProcedureRetrieveActionTaskRecord) {
    this.delinquentAccountProcedureRetrieveActionTaskRecord = delinquentAccountProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return delinquentAccountProcedureRetrieveActionResponse
  **/

  public String getDelinquentAccountProcedureRetrieveActionResponse() {
    return delinquentAccountProcedureRetrieveActionResponse;
  }

  public void setDelinquentAccountProcedureRetrieveActionResponse(String delinquentAccountProcedureRetrieveActionResponse) {
    this.delinquentAccountProcedureRetrieveActionResponse = delinquentAccountProcedureRetrieveActionResponse;
  }


  /**
   * Get delinquentAccountProcedureInstanceReportRecord
   * @return delinquentAccountProcedureInstanceReportRecord
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceReportRecord getDelinquentAccountProcedureInstanceReportRecord() {
    return delinquentAccountProcedureInstanceReportRecord;
  }

  public void setDelinquentAccountProcedureInstanceReportRecord(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceReportRecord delinquentAccountProcedureInstanceReportRecord) {
    this.delinquentAccountProcedureInstanceReportRecord = delinquentAccountProcedureInstanceReportRecord;
  }


  /**
   * Get delinquentAccountProcedureInstanceAnalysis
   * @return delinquentAccountProcedureInstanceAnalysis
  **/

  public CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceAnalysis getDelinquentAccountProcedureInstanceAnalysis() {
    return delinquentAccountProcedureInstanceAnalysis;
  }

  public void setDelinquentAccountProcedureInstanceAnalysis(CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceAnalysis delinquentAccountProcedureInstanceAnalysis) {
    this.delinquentAccountProcedureInstanceAnalysis = delinquentAccountProcedureInstanceAnalysis;
  }


}

