package com.dcl.iservice;

import com.dcl.entity.Profile;

public interface ProfileService {
	
	public Profile createProfile(Profile p);
	
	public Profile showProfile(Integer profileId);

}
