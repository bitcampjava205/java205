package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import member.dao.MemberDao;
import member.service.MemberRegService;

@Configuration
@Import(JavaConfigSub.class)
public class JavaConfigMain {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegService memberRegSvc() {
		MemberRegService memberRegService = new MemberRegService();
		memberRegService.setMemberDao(memberDao());
		memberRegService.setNum(1);
		return memberRegService;
	}

}
