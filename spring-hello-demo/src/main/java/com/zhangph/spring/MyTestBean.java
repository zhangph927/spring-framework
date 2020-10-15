package com.zhangph.spring;

/**
 * @ClassName : MyTestBean
 * @Description :
 * @Author : zph
 * @Date: 2020-05-12 10:53
 * @Version : V1.0
 */
public class MyTestBean {
	private String name = "ChenHao";

	public MyTestBean(String name) {
		this.name = name;
	}

	public MyTestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
