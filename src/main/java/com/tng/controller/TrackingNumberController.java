package com.tng.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.tng.bean.NewTrkngNumbGenDtls;
import com.tng.bean.TrackingDetails;
import com.tng.servc.TrackingNumberSrvc;
import com.tng.service.implementation.TrackingNumberService;

/*
* Author: Shubham.S.Ashtaputre
* License: Open Source Project
* Created Date: 02/12/2024
*/

//for allowing requests from different applications like angular,react or from different sources
//etc we use @CrossOrigin
@CrossOrigin
@RestController
@RequestMapping("tng")
public class TrackingNumberController {
	
	//@Autowired
	//TrackingNumberSrvc trackingNumberService;
	TrackingNumberService trackingNumberService;
	
	@GetMapping(path="/next-tracking-number",
		    	produces=MediaType.APPLICATION_JSON_VALUE)
	public TrackingDetails generateNewTrackingNumber(@RequestBody NewTrkngNumbGenDtls newTrkngNumbGenDtls) {
		trackingNumberService = new TrackingNumberService();
		return trackingNumberService.generateNewTrackingNumber(newTrkngNumbGenDtls);
	}
	
}
