package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionUpdateInputModelResolutionInstanceRecord
 */
public class BQResolutionUpdateInputModelResolutionInstanceRecord   {
  private String delinquentAccountResolutionTaskResult = null;

  private String delinquentAccountResolutionActionPlan = null;

  private String delinquentAccountResolutionWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the resolution planning activity (e.g.. account recovered, passed to collections) 
   * @return delinquentAccountResolutionTaskResult
  **/

  public String getDelinquentAccountResolutionTaskResult() {
    return delinquentAccountResolutionTaskResult;
  }

  public void setDelinquentAccountResolutionTaskResult(String delinquentAccountResolutionTaskResult) {
    this.delinquentAccountResolutionTaskResult = delinquentAccountResolutionTaskResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The recommended processing for the delinquent account - details passed on to associated function for execution as necessary 
   * @return delinquentAccountResolutionActionPlan
  **/

  public String getDelinquentAccountResolutionActionPlan() {
    return delinquentAccountResolutionActionPlan;
  }

  public void setDelinquentAccountResolutionActionPlan(String delinquentAccountResolutionActionPlan) {
    this.delinquentAccountResolutionActionPlan = delinquentAccountResolutionActionPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return delinquentAccountResolutionWorkProduct
  **/

  public String getDelinquentAccountResolutionWorkProduct() {
    return delinquentAccountResolutionWorkProduct;
  }

  public void setDelinquentAccountResolutionWorkProduct(String delinquentAccountResolutionWorkProduct) {
    this.delinquentAccountResolutionWorkProduct = delinquentAccountResolutionWorkProduct;
  }


}

