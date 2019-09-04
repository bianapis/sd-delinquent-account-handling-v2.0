package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceReportRecord
 */
public class CRDelinquentAccountProcedureRetrieveInputModelDelinquentAccountProcedureInstanceReportRecord   {
  private String delinquentAccountProcedureInstanceReportReference = null;

  private String delinquentAccountProcedureInstanceReportType = null;

  private String delinquentAccountProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return delinquentAccountProcedureInstanceReportReference
  **/

  public String getDelinquentAccountProcedureInstanceReportReference() {
    return delinquentAccountProcedureInstanceReportReference;
  }

  public void setDelinquentAccountProcedureInstanceReportReference(String delinquentAccountProcedureInstanceReportReference) {
    this.delinquentAccountProcedureInstanceReportReference = delinquentAccountProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return delinquentAccountProcedureInstanceReportParameters
  **/

  public String getDelinquentAccountProcedureInstanceReportParameters() {
    return delinquentAccountProcedureInstanceReportParameters;
  }

  public void setDelinquentAccountProcedureInstanceReportParameters(String delinquentAccountProcedureInstanceReportParameters) {
    this.delinquentAccountProcedureInstanceReportParameters = delinquentAccountProcedureInstanceReportParameters;
  }


}

