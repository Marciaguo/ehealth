package com.zhanglin.networkSlicingBackend.ms.utils;

import java.util.UUID;

public class uuidUtil {
	public static String GeneratedKeySecret() {
		  return UUID.randomUUID().toString().trim().replaceAll("-", "");
		 }
}
