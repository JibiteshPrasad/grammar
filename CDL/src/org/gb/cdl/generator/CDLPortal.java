package org.gb.cdl.generator;

import org.gb.cdl.generator.beans.MapperBean;
import org.gb.cdl.generator.beans.ModelAnnotations;
import org.gb.cdl.generator.beans.ModelBean;

public enum CDLPortal {
	INSTANCE;
	
	private static ModelBean model;
	private static MapperBean mapper;
	
	static{
		model = new ModelBean();
		ModelAnnotations annotations = new ModelAnnotations();
		model.setAnnotations(annotations);
		mapper = new MapperBean();
	}
	
	public static ModelBean getModelBean(){
		return model;
	}
	
	public static MapperBean getMapperBean(){
		return mapper;
	}
	

}
