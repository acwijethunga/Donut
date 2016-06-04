package com.donut.tests;

import org.junit.Test;

import utill.BaseClass;
import utill.CommanUtils;

public class LoginTest extends BaseClass {
	@Test
	public void login() throws InterruptedException{
		commonUtil.getUrl("http://www.srilankan.com/zh_cn/cn");
		
		commonUtil.click(loginPg.login2);
		Thread.sleep(100);
		commonUtil.SwitchToPopup();
	commonUtil.typeToTb(loginPg.userName, "amila");
		commonUtil.typeToTb(loginPg.password, "Test");
		
		commonUtil.click(loginPg.login);
		
	}

}
