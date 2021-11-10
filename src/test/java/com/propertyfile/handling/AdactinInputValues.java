package com.propertyfile.handling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.adactin.BaseClass;

public class AdactinInputValues {


	/*public AdactinInputValues() throws Exception {
		
	}*/

	public  String getUsername() throws Exception {
		
		return BaseClass.propertyValue("username") ;
	}

	public  String getPassword() throws Exception {
	
		return BaseClass.propertyValue("password") ;
	}

	
}
