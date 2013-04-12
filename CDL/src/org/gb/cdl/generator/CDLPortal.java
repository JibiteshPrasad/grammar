package org.gb.cdl.generator;

import org.gb.cdl.generator.beans.ModelAnnotations;
import org.gb.cdl.generator.beans.ModelBean;

public enum CDLPortal {
	INSTANCE;
	
	private static ModelBean model;
	
	static{
		model = new ModelBean();
		ModelAnnotations annotations = new ModelAnnotations();
		model.setAnnotations(annotations);
	}
	
	public static ModelBean getModelBean(){
		return model;
	}
	

}
