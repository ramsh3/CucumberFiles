package com.runnner;

import com.adactin.BaseClass;
import com.propertyfile.handling.FileReaderManager;

public class UsingPropertyFile extends BaseClass {

	public static void main(String args[]) throws Exception {
		String un = FileReaderManager.getvalues().getUsername();
		String u = propertyValue("username");
		String pass = FileReaderManager.getvalues().getPassword();
		System.out.println(u);
		System.out.println(pass);

	}

}
