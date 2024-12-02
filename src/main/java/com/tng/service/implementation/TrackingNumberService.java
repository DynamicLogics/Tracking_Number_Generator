package com.tng.service.implementation;

import org.springframework.stereotype.Service;

import com.tng.bean.NewTrkngNumbGenDtls;
import com.tng.bean.TrackingDetails;

@Service
public class TrackingNumberService {
	
	public TrackingNumberAsyncService trackingNumberAsyncService;
	
	public TrackingDetails generateNewTrackingNumber(NewTrkngNumbGenDtls newTrkngNumbGenDtls) {
		trackingNumberAsyncService = new TrackingNumberAsyncService();
		TrackingDetails trackingDetails = trackingNumberAsyncService.generateNewTrackingNumber(newTrkngNumbGenDtls);
		return trackingDetails;
	}
	
	
}
