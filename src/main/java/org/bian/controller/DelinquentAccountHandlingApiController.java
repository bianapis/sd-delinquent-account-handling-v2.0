/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class DelinquentAccountHandlingApiController {

	@Autowired
	DelinquentAccountHandlingApiService service;
	
	@Process.Activate
	public BianResponse<SDDelinquentAccountHandlingActivateOutputModel> activate(@RequestBody BianRequest<SDDelinquentAccountHandlingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDDelinquentAccountHandlingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDelinquentAccountHandlingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRDelinquentAccountProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDelinquentAccountProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Exchange
	public BianResponse<BQPaymentExchangeOutputModel> exchangePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("resolution")
	@Process.Exchange
	public BianResponse<BQResolutionExchangeOutputModel> exchangeResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQResolutionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeResolution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRDelinquentAccountProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDelinquentAccountProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDDelinquentAccountHandlingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDDelinquentAccountHandlingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRDelinquentAccountProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRDelinquentAccountProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Process.Initiate
	public BianResponse<BQContactInitiateOutputModel> initiateContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQContactInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateContact(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Initiate
	public BianResponse<BQPaymentInitiateOutputModel> initiatePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPaymentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePayment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Process.Request
	public BianResponse<BQContactRequestOutputModel> requestContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRDelinquentAccountProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("assessment")
	@Process.Retrieve
	public BianResponse<BQAssessmentRetrieveOutputModel> retrieveAssessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssessment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("contact")
	@Process.Retrieve
	public BianResponse<BQContactRetrieveOutputModel> retrieveContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContact(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("payment")
	@Process.Retrieve
	public BianResponse<BQPaymentRetrieveOutputModel> retrievePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("resolution")
	@Process.Retrieve
	public BianResponse<BQResolutionRetrieveOutputModel> retrieveResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDDelinquentAccountHandlingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRDelinquentAccountProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRDelinquentAccountProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment")
	@Process.Update
	public BianResponse<BQPaymentUpdateOutputModel> updatePayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("resolution")
	@Process.Update
	public BianResponse<BQResolutionUpdateOutputModel> updateResolution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQResolutionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateResolution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
