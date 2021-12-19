package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import member.dao.MemberDao;
import member.service.MemberRegService;

@Configuration
public class JavaConfig1 {

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
