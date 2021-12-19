package member.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfigMain;
import member.service.ChangePasswordService;
import member.service.MemberRegService;

public class SpringMain6 {

	static ApplicationContext ctx;

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigMain.class);

		MemberRegService regSvc = ctx.getBean("memberRegSvc", MemberRegService.class);

		ChangePasswordService changePwoSvc = ctx.getBean("changePwoSvc", ChangePasswordService.class);

	}

}
