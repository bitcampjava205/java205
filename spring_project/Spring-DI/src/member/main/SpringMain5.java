package member.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfig1;
import config.JavaConfig2;
import member.service.ChangePasswordService;
import member.service.MemberRegService;

public class SpringMain5 {

	static ApplicationContext ctx;

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig1.class, JavaConfig2.class);

		MemberRegService regSvc = ctx.getBean("memberRegSvc", MemberRegService.class);

		ChangePasswordService changePwoSvc = ctx.getBean("changePwoSvc", ChangePasswordService.class);

	}

}
