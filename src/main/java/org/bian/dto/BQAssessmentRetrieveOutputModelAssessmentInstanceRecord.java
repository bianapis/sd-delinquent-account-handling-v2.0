package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentRetrieveOutputModelAssessmentInstanceRecord
 */
public class BQAssessmentRetrieveOutputModelAssessmentInstanceRecord   {
  private String delinquentAccountAssessmentWorkProduct = null;

  private Object delinquentAccountAssessmentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return delinquentAccountAssessmentWorkProduct
  **/

  public String getDelinquentAccountAssessmentWorkProduct() {
    return delinquentAccountAssessmentWorkProduct;
  }

  public void setDelinquentAccountAssessmentWorkProduct(String delinquentAccountAssessmentWorkProduct) {
    this.delinquentAccountAssessmentWorkProduct = delinquentAccountAssessmentWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The outcome of the assessment of the delinquent product account based on billing/payment and transaction history 
   * @return delinquentAccountAssessmentRecord
  **/

  public Object getDelinquentAccountAssessmentRecord() {
    return delinquentAccountAssessmentRecord;
  }

  public void setDelinquentAccountAssessmentRecord(Object delinquentAccountAssessmentRecord) {
    this.delinquentAccountAssessmentRecord = delinquentAccountAssessmentRecord;
  }


}

