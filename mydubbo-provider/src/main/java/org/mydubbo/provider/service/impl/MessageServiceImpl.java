package org.mydubbo.provider.service.impl;

import org.mydubbo.service.IMessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements IMessageService {
	@Override
	public String echo(String str) {
		return "【ECHO】" + str;
	}

}
