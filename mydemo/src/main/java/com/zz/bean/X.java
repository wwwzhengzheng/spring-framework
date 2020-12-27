package com.zz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {

	@Autowired
	private Y y;

	public X() {
		System.out.println("X 被创建了。。。");
	}
}
