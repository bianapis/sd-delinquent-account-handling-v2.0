package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceAnalysis
 */
public class CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceAnalysis   {
  private String delinquentAccountProcedureInstanceAnalysisReference = null;

  private String delinquentAccountProcedureInstanceAnalysisReportType = null;

  private String delinquentAccountProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return delinquentAccountProcedureInstanceAnalysisReference
  **/

  public String getDelinquentAccountProcedureInstanceAnalysisReference() {
    return delinquentAccountProcedureInstanceAnalysisReference;
  }

  public void setDelinquentAccountProcedureInstanceAnalysisReference(String delinquentAccountProcedureInstanceAnalysisReference) {
    this.delinquentAccountProcedureInstanceAnalysisReference = delinquentAccountProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return delinquentAccountProcedureInstanceAnalysisParameters
  **/

  public String getDelinquentAccountProcedureInstanceAnalysisParameters() {
    return delinquentAccountProcedureInstanceAnalysisParameters;
  }

  public void setDelinquentAccountProcedureInstanceAnalysisParameters(String delinquentAccountProcedureInstanceAnalysisParameters) {
    this.delinquentAccountProcedureInstanceAnalysisParameters = delinquentAccountProcedureInstanceAnalysisParameters;
  }


}

