package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceAnalysis;
import org.bian.dto.CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveInputModel
 */
public class CRDelinquentAccountProcedureRetrieveInputModel   {
  private Object delinquentAccountProcedureRetrieveActionTaskRecord = null;

  private String delinquentAccountProcedureRetrieveActionRequest = null;

  private CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceReportRecord delinquentAccountProcedureInstanceReportRecord = null;

  private CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceAnalysis delinquentAccountProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return delinquentAccountProcedureRetrieveActionRequest
  **/

  public String getDelinquentAccountProcedureRetrieveActionRequest() {
    return delinquentAccountProcedureRetrieveActionRequest;
  }

  public void setDelinquentAccountProcedureRetrieveActionRequest(String delinquentAccountProcedureRetrieveActionRequest) {
    this.delinquentAccountProcedureRetrieveActionRequest = delinquentAccountProcedureRetrieveActionRequest;
  }


  /**
   * Get delinquentAccountProcedureInstanceReportRecord
   * @return delinquentAccountProcedureInstanceReportRecord
  **/

  public CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceReportRecord getDelinquentAccountProcedureInstanceReportRecord() {
    return delinquentAccountProcedureInstanceReportRecord;
  }

  public void setDelinquentAccountProcedureInstanceReportRecord(CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceReportRecord delinquentAccountProcedureInstanceReportRecord) {
    this.delinquentAccountProcedureInstanceReportRecord = delinquentAccountProcedureInstanceReportRecord;
  }


  /**
   * Get delinquentAccountProcedureInstanceAnalysis
   * @return delinquentAccountProcedureInstanceAnalysis
  **/

  public CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceAnalysis getDelinquentAccountProcedureInstanceAnalysis() {
    return delinquentAccountProcedureInstanceAnalysis;
  }

  public void setDelinquentAccountProcedureInstanceAnalysis(CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceAnalysis delinquentAccountProcedureInstanceAnalysis) {
    this.delinquentAccountProcedureInstanceAnalysis = delinquentAccountProcedureInstanceAnalysis;
  }


}

