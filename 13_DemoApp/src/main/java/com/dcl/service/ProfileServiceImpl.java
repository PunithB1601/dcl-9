package com.dcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Profile;
import com.dcl.iservice.ProfileService;
import com.dcl.repo.ProfileRepo;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepo prepo;
	
	@Override
	public Profile createProfile(Profile p) {
		return prepo.save(p);
	}

	@Override
	public Profile showProfile(Integer profileId) {
		return prepo.findById(profileId).orElse(null);
	}

}
