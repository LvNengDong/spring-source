package cn.lnd.service.impl;

import cn.lnd.service.WelcomeService;

/**
 * @Author lnd
 * @Description
 * @Date 2022/8/4 22:38
 */
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello(String name) {
		System.out.println("Welcome " + name);
		return "success";
	}
}
