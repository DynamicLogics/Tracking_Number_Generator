package com.tng.service.implementation;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.tng.bean.NewTrkngNumbGenDtls;
import com.tng.bean.TrackingDetails;
import com.tng.servc.Common;
import com.tng.servc.TrackingNumberSrvc;

//here the business logic related to new tracking number generation will be implemented
@Service
public class TrackingNumberAsyncService implements TrackingNumberSrvc{

	private TrackingDetails trackingDetails;
	private Common common;
	
	public TrackingDetails validateNewTrackingNumbmerGenParmater(NewTrkngNumbGenDtls newTrkngNumbGenDtls) {
		
		common = new Common();
		
		//here initially I'm implementing the validation for all the request paramenters that i had received
		//for the generation of new tracking number
		
		//validating the origin and destination country ID's
		if(newTrkngNumbGenDtls.getOrigin_country_id().length()>2) {
			return trackingDetails = new TrackingDetails("null","null","invalid origin country ID passed");
		}
		
		//validating the destination country ID's
		if(newTrkngNumbGenDtls.getDestination_country_id().length()>2) {
			return trackingDetails = new TrackingDetails("null","null","invalid destination country ID passed");
		}
		
		//validating the weight of the item 
		String[] checkDecimalNumberLengths = newTrkngNumbGenDtls.getWeight().split("\\.", 2);
		if(checkDecimalNumberLengths[1].length()>3) {
			return trackingDetails = new TrackingDetails("null","null","invalid wight passed");
		}
		
		//validating creation timmestamp
		if(common.isValidTimestamp(newTrkngNumbGenDtls.getCreated_at())==false) {
			return trackingDetails = new TrackingDetails("null","null","invalid time stamp passed");
		}

		//validating customer id
		if(newTrkngNumbGenDtls.getCustomer_id()==null) {
			return trackingDetails = new TrackingDetails("null","null","invalid customer slug passed");
		}
		
		//validating customer name
		if(newTrkngNumbGenDtls.getCustomer_name()==null) {
			return trackingDetails = new TrackingDetails("null","null","invalid customer name passed");
		}
		
		if(newTrkngNumbGenDtls.getCustomer_name().length()<=0) {
			return trackingDetails = new TrackingDetails("null","null","invalid customer name passed");
		}
		
		//validation for the customer’s name in slug-case/kebab-case
		if(common.isValidCustomerName(newTrkngNumbGenDtls.getCustomer_slug())==false) {
			return trackingDetails = new TrackingDetails("null","null","invalid customer slug passed");
		}
		
		return new TrackingDetails("Validated", "Validated", "Validated");
	}
	
	@Async
	public TrackingDetails generateNewTrackingNumber(NewTrkngNumbGenDtls newTrkngNumbGenDtls){
		
		//validating the paramters required to generate the new tracking id
		TrackingDetails trackingDetails = validateNewTrackingNumbmerGenParmater(newTrkngNumbGenDtls);
		if(trackingDetails.getTracking_number().equals("null")) {
			return trackingDetails;
		}
		
		//logic to implement new tracking id
		String newTrackingId = common.generateTrackingNumber();
		
		//logic to implement current datestamp
		String newDateStamp = common.generateTimestamp();
		
		TrackingDetails newTrackingDetails = new TrackingDetails(newTrackingId, newDateStamp, "Traking ID generated successfully...");
		return newTrackingDetails;
		
	}
	
}
