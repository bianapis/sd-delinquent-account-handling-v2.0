package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord
 */
public class CRDelinquentAccountProcedureInitiateOutputModelDelinquentAccountProcedureInstanceRecord   {
  private CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType dateType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRDelinquentAccountProcedureInitiateInputModelDelinquentAccountProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

