package member.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfig;
import member.service.ChangePasswordService;
import member.service.MemberRegService;

public class SpringMain4 {

	static ApplicationContext ctx;

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

		MemberRegService regSvc = ctx.getBean("memberRegSvc", MemberRegService.class);

		ChangePasswordService changePwoSvc = ctx.getBean("changePwoSvc", ChangePasswordService.class);

	}

}
