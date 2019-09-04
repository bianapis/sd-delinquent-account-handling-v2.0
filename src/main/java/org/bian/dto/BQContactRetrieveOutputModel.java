package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRetrieveOutputModelContactInstanceAnalysis;
import org.bian.dto.BQContactRetrieveOutputModelContactInstanceRecord;
import org.bian.dto.BQContactRetrieveOutputModelContactInstanceReport;
import org.bian.dto.BQContactRetrieveOutputModelDelinquentAccountProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveOutputModel
 */
public class BQContactRetrieveOutputModel   {
  private BQContactRetrieveOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord = null;

  private String delinquentAccountProcessingSchedule = null;

  private BQContactRetrieveOutputModelContactInstanceRecord contactInstanceRecord = null;

  private String contactRetrieveActionTaskReference = null;

  private Object contactRetrieveActionTaskRecord = null;

  private String contactRetrieveActionResponse = null;

  private BQContactRetrieveOutputModelContactInstanceReport contactInstanceReport = null;

  private BQContactRetrieveOutputModelContactInstanceAnalysis contactInstanceAnalysis = null;


  /**
   * Get delinquentAccountProcedureInstanceRecord
   * @return delinquentAccountProcedureInstanceRecord
  **/

  public BQContactRetrieveOutputModelDelinquentAccountProcedureInstanceRecord getDelinquentAccountProcedureInstanceRecord() {
    return delinquentAccountProcedureInstanceRecord;
  }

  public void setDelinquentAccountProcedureInstanceRecord(BQContactRetrieveOutputModelDelinquentAccountProcedureInstanceRecord delinquentAccountProcedureInstanceRecord) {
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
   * Get contactInstanceRecord
   * @return contactInstanceRecord
  **/

  public BQContactRetrieveOutputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactRetrieveOutputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact instance retrieve service call 
   * @return contactRetrieveActionTaskReference
  **/

  public String getContactRetrieveActionTaskReference() {
    return contactRetrieveActionTaskReference;
  }

  public void setContactRetrieveActionTaskReference(String contactRetrieveActionTaskReference) {
    this.contactRetrieveActionTaskReference = contactRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return contactRetrieveActionTaskRecord
  **/

  public Object getContactRetrieveActionTaskRecord() {
    return contactRetrieveActionTaskRecord;
  }

  public void setContactRetrieveActionTaskRecord(Object contactRetrieveActionTaskRecord) {
    this.contactRetrieveActionTaskRecord = contactRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return contactRetrieveActionResponse
  **/

  public String getContactRetrieveActionResponse() {
    return contactRetrieveActionResponse;
  }

  public void setContactRetrieveActionResponse(String contactRetrieveActionResponse) {
    this.contactRetrieveActionResponse = contactRetrieveActionResponse;
  }


  /**
   * Get contactInstanceReport
   * @return contactInstanceReport
  **/

  public BQContactRetrieveOutputModelContactInstanceReport getContactInstanceReport() {
    return contactInstanceReport;
  }

  public void setContactInstanceReport(BQContactRetrieveOutputModelContactInstanceReport contactInstanceReport) {
    this.contactInstanceReport = contactInstanceReport;
  }


  /**
   * Get contactInstanceAnalysis
   * @return contactInstanceAnalysis
  **/

  public BQContactRetrieveOutputModelContactInstanceAnalysis getContactInstanceAnalysis() {
    return contactInstanceAnalysis;
  }

  public void setContactInstanceAnalysis(BQContactRetrieveOutputModelContactInstanceAnalysis contactInstanceAnalysis) {
    this.contactInstanceAnalysis = contactInstanceAnalysis;
  }


}

