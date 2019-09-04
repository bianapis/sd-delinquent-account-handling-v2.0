/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DelinquentAccountHandlingApiServiceImpl implements DelinquentAccountHandlingApiService {

	public SDDelinquentAccountHandlingActivateOutputModel activate(SDDelinquentAccountHandlingActivateInputModel request){
		return JsonReader.read("activate-SDDelinquentAccountHandlingActivateOutputModel.json",new TypeReference<SDDelinquentAccountHandlingActivateOutputModel>(){});
	}
	
	public SDDelinquentAccountHandlingConfigureOutputModel configure(String sdReferenceId, SDDelinquentAccountHandlingConfigureInputModel request){
		return JsonReader.read("configure-SDDelinquentAccountHandlingConfigureOutputModel.json",new TypeReference<SDDelinquentAccountHandlingConfigureOutputModel>(){});
	}
	
	public CRDelinquentAccountProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRDelinquentAccountProcedureControlInputModel request){
		return JsonReader.read("control-CRDelinquentAccountProcedureControlOutputModel.json",new TypeReference<CRDelinquentAccountProcedureControlOutputModel>(){});
	}
	
	public BQPaymentExchangeOutputModel exchangePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentExchangeOutputModel.json",new TypeReference<BQPaymentExchangeOutputModel>(){});
	}
	
	public BQResolutionExchangeOutputModel exchangeResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionExchangeInputModel request){
		return JsonReader.read("exchange-BQResolutionExchangeOutputModel.json",new TypeReference<BQResolutionExchangeOutputModel>(){});
	}
	
	public CRDelinquentAccountProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRDelinquentAccountProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRDelinquentAccountProcedureExecuteOutputModel.json",new TypeReference<CRDelinquentAccountProcedureExecuteOutputModel>(){});
	}
	
	public SDDelinquentAccountHandlingFeedbackOutputModel feedback(String sdReferenceId, SDDelinquentAccountHandlingFeedbackInputModel request){
		return JsonReader.read("feedback-SDDelinquentAccountHandlingFeedbackOutputModel.json",new TypeReference<SDDelinquentAccountHandlingFeedbackOutputModel>(){});
	}
	
	public CRDelinquentAccountProcedureInitiateOutputModel initiate(String sdReferenceId, CRDelinquentAccountProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRDelinquentAccountProcedureInitiateOutputModel.json",new TypeReference<CRDelinquentAccountProcedureInitiateOutputModel>(){});
	}
	
	public BQContactInitiateOutputModel initiateContact(String sdReferenceId, String crReferenceId, BQContactInitiateInputModel request){
		return JsonReader.read("initiate-BQContactInitiateOutputModel.json",new TypeReference<BQContactInitiateOutputModel>(){});
	}
	
	public BQPaymentInitiateOutputModel initiatePayment(String sdReferenceId, String crReferenceId, BQPaymentInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentInitiateOutputModel.json",new TypeReference<BQPaymentInitiateOutputModel>(){});
	}
	
	public BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request){
		return JsonReader.read("request-BQContactRequestOutputModel.json",new TypeReference<BQContactRequestOutputModel>(){});
	}
	
	public CRDelinquentAccountProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRDelinquentAccountProcedureRetrieveOutputModel.json",new TypeReference<CRDelinquentAccountProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAssessmentRetrieveOutputModel retrieveAssessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssessmentRetrieveOutputModel.json",new TypeReference<BQAssessmentRetrieveOutputModel>(){});
	}
	
	public BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQContactRetrieveOutputModel.json",new TypeReference<BQContactRetrieveOutputModel>(){});
	}
	
	public BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentRetrieveOutputModel.json",new TypeReference<BQPaymentRetrieveOutputModel>(){});
	}
	
	public BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQResolutionRetrieveOutputModel.json",new TypeReference<BQResolutionRetrieveOutputModel>(){});
	}
	
	public SDDelinquentAccountHandlingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDDelinquentAccountHandlingRetrieveOutputModel.json",new TypeReference<SDDelinquentAccountHandlingRetrieveOutputModel>(){});
	}
	
	public CRDelinquentAccountProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDelinquentAccountProcedureUpdateInputModel request){
		return JsonReader.read("update-CRDelinquentAccountProcedureUpdateOutputModel.json",new TypeReference<CRDelinquentAccountProcedureUpdateOutputModel>(){});
	}
	
	public BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request){
		return JsonReader.read("update-BQPaymentUpdateOutputModel.json",new TypeReference<BQPaymentUpdateOutputModel>(){});
	}
	
	public BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request){
		return JsonReader.read("update-BQResolutionUpdateOutputModel.json",new TypeReference<BQResolutionUpdateOutputModel>(){});
	}
	
}
