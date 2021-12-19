package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import member.dao.MemberDao;
import member.service.ChangePasswordService;

@Configuration
public class JavaConfig2 {

	@Autowired
	private MemberDao memberDao;

	@Bean
	public ChangePasswordService changePwoSvc() {
		return new ChangePasswordService(memberDao);
	}

}
