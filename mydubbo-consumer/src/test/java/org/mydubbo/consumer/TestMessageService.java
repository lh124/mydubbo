package org.mydubbo.consumer;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mydubbo.service.IMessageService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
	@Resource
	private IMessageService messageService ;
	@Test
	public void testEcho() {
		String echo = this.messageService.echo("www.mldn.cn") ;
		System.err.println(echo);
	}
}
