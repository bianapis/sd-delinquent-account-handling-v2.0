package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceAnalysis
 */
public class CRDelinquentAccountProcedureRetrieveOutputModelDelinquentAccountProcedureInstanceAnalysis   {
  private String delinquentAccountProcedureInstanceAnalysisData = null;

  private String delinquentAccountProcedureInstanceAnalysisReportType = null;

  private Object delinquentAccountProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return delinquentAccountProcedureInstanceAnalysisData
  **/

  public String getDelinquentAccountProcedureInstanceAnalysisData() {
    return delinquentAccountProcedureInstanceAnalysisData;
  }

  public void setDelinquentAccountProcedureInstanceAnalysisData(String delinquentAccountProcedureInstanceAnalysisData) {
    this.delinquentAccountProcedureInstanceAnalysisData = delinquentAccountProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return delinquentAccountProcedureInstanceAnalysisReportType
  **/

  public String getDelinquentAccountProcedureInstanceAnalysisReportType() {
    return delinquentAccountProcedureInstanceAnalysisReportType;
  }

  public void setDelinquentAccountProcedureInstanceAnalysisReportType(String delinquentAccountProcedureInstanceAnalysisReportType) {
    this.delinquentAccountProcedureInstanceAnalysisReportType = delinquentAccountProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return delinquentAccountProcedureInstanceAnalysisReport
  **/

  public Object getDelinquentAccountProcedureInstanceAnalysisReport() {
    return delinquentAccountProcedureInstanceAnalysisReport;
  }

  public void setDelinquentAccountProcedureInstanceAnalysisReport(Object delinquentAccountProcedureInstanceAnalysisReport) {
    this.delinquentAccountProcedureInstanceAnalysisReport = delinquentAccountProcedureInstanceAnalysisReport;
  }


}

