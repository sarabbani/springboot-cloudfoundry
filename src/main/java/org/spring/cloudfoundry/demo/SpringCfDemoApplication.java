package org.spring.cloudfoundry.demo;

import org.h2.server.web.WebServlet;
import org.h2.tools.Server;
import org.spring.cloudfoundry.demo.gateway.MysqlBookGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class SpringCfDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCfDemoApplication.class, args);
	}
    @Bean
    protected ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        registrationBean.addInitParameter("webAllowOthers", "true");
        return registrationBean;
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server h2Server() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9292");
    }

    @Bean
    public MysqlBookGateway mysqlBookGateway(){
        return new MysqlBookGateway();
    }
}
