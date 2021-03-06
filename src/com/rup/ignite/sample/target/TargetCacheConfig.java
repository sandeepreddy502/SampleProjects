package com.rup.ignite.sample.target;

import java.util.Date;

import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.configuration.CacheConfiguration;

import com.rup.ignite.sample.target.model.AllocTargetMaster;

public class TargetCacheConfig {

	public static CacheConfiguration<Integer, AllocTargetMaster> targetMasterCache() {
		CacheConfiguration<Integer, AllocTargetMaster> targetMasterCache = new CacheConfiguration<>("targetMasterCache");
		targetMasterCache.setCacheMode(CacheMode.PARTITIONED);
		targetMasterCache.setIndexedTypes(Integer.class, AllocTargetMaster.class,Date.class, AllocTargetMaster.class, String.class, AllocTargetMaster.class);
		return targetMasterCache;
	}
}
