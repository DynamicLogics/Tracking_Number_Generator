package com.tng.servc;

import com.tng.bean.NewTrkngNumbGenDtls;
import com.tng.bean.TrackingDetails;

public interface TrackingNumberSrvc {
	
	public TrackingDetails generateNewTrackingNumber(NewTrkngNumbGenDtls newTrkngNumbGenDtls);
	
}
