package com.zz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Y {

	@Autowired
	private X x;

	public Y(){
		System.out.println("Y 被创建了。。。");
	}
}
