package hyj.springboot.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan(basePackages={"hyj.springboot"})
@MapperScan("hyj.springboot.mapper")
@Controller
@Configuration
@EnableAutoConfiguration
@RequestMapping("")
public class SampleController {
	
	/**
	 * 首页
	 * @return
	 * @throws Exception
	 */
    @RequestMapping("")
    public String index() throws Exception {
    	return "index";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}