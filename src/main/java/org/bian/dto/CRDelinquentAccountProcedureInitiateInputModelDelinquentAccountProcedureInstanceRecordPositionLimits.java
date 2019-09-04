package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordPositionLimits
 */
public class CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordPositionLimits   {
  private String positionLimitType = null;

  private String positionLimitSettings = null;

  private String positionLimitValue = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of position maintained for the account (e.g. transaction credit/debit, netting, position) 
   * @return positionLimitType
  **/

  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position definition, associated limit settings and rules 
   * @return positionLimitSettings
  **/

  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current calculated position 
   * @return positionLimitValue
  **/

  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }


}

