package ems.member.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ems.member.service.EMSInformationService;
import ems.member.service.StudentRegisterService;

public class MainClassUseXMLsImport {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:appCtxImport.xml");
		
		EMSInformationService informationService=ctx.getBean("informationService",EMSInformationService.class);
		informationService.outputEMSInformation();
		
		StudentRegisterService registerService = ctx.getBean("registerService", StudentRegisterService.class);
		
		
	}

}
