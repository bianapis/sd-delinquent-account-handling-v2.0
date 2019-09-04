/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DelinquentAccountHandlingApiService {

	SDDelinquentAccountHandlingActivateOutputModel activate(SDDelinquentAccountHandlingActivateInputModel request);
	
	SDDelinquentAccountHandlingConfigureOutputModel configure(String sdReferenceId, SDDelinquentAccountHandlingConfigureInputModel request);
	
	CRDelinquentAccountProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRDelinquentAccountProcedureControlInputModel request);
	
	BQPaymentExchangeOutputModel exchangePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExchangeInputModel request);
	
	BQResolutionExchangeOutputModel exchangeResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionExchangeInputModel request);
	
	CRDelinquentAccountProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRDelinquentAccountProcedureExecuteInputModel request);
	
	SDDelinquentAccountHandlingFeedbackOutputModel feedback(String sdReferenceId, SDDelinquentAccountHandlingFeedbackInputModel request);
	
	CRDelinquentAccountProcedureInitiateOutputModel initiate(String sdReferenceId, CRDelinquentAccountProcedureInitiateInputModel request);
	
	BQContactInitiateOutputModel initiateContact(String sdReferenceId, String crReferenceId, BQContactInitiateInputModel request);
	
	BQPaymentInitiateOutputModel initiatePayment(String sdReferenceId, String crReferenceId, BQPaymentInitiateInputModel request);
	
	BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request);
	
	CRDelinquentAccountProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAssessmentRetrieveOutputModel retrieveAssessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDDelinquentAccountHandlingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRDelinquentAccountProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDelinquentAccountProcedureUpdateInputModel request);
	
	BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request);
	
	BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request);
	
}
