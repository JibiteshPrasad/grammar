package org.gb.cdl.generator;

import org.gb.cdl.generator.beans.ModelBean;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JPackage;

public class ModelGenerator {
	
	private ModelBean model;
	
	private void init(){
		model = CDLPortal.getModelBean();
	}
	
	private void generateCode(){
		JCodeModel jcm = new JCodeModel();
		try {
		JPackage jp = jcm._package("org.gb.cdl.source");
			JDefinedClass jc = jp._class("GeneratedFactory");
		} catch (JClassAlreadyExistsException e) {
			e.printStackTrace();
		}
		
	}

}
