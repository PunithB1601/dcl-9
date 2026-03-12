package com.dcl.iservice;

import com.dcl.entity.Platform;

public interface PlatformService {

	public Platform createPlatform(Platform platform);

	public Platform getPlatform(Integer platformId);
}
