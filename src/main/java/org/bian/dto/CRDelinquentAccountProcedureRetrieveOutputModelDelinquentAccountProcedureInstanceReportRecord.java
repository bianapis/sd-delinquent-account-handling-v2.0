package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceReportRecord
 */
public class CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceReportRecord   {
  private String delinquentAccountProcedureInstanceReportData = null;

  private String delinquentAccountProcedureInstanceReportType = null;

  private Object delinquentAccountProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return delinquentAccountProcedureInstanceReportData
  **/

  public String getDelinquentAccountProcedureInstanceReportData() {
    return delinquentAccountProcedureInstanceReportData;
  }

  public void setDelinquentAccountProcedureInstanceReportData(String delinquentAccountProcedureInstanceReportData) {
    this.delinquentAccountProcedureInstanceReportData = delinquentAccountProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return delinquentAccountProcedureInstanceReportType
  **/

  public String getDelinquentAccountProcedureInstanceReportType() {
    return delinquentAccountProcedureInstanceReportType;
  }

  public void setDelinquentAccountProcedureInstanceReportType(String delinquentAccountProcedureInstanceReportType) {
    this.delinquentAccountProcedureInstanceReportType = delinquentAccountProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return delinquentAccountProcedureInstanceReport
  **/

  public Object getDelinquentAccountProcedureInstanceReport() {
    return delinquentAccountProcedureInstanceReport;
  }

  public void setDelinquentAccountProcedureInstanceReport(Object delinquentAccountProcedureInstanceReport) {
    this.delinquentAccountProcedureInstanceReport = delinquentAccountProcedureInstanceReport;
  }


}

