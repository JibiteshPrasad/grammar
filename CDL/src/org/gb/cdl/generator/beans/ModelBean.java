package org.gb.cdl.generator.beans;

import java.util.ArrayList;
import java.util.List;

public class ModelBean {
	
	private String modelname;
	private ModelAnnotations annotations;
	private List<FieldBean> fields;
	

	public ModelBean(){
		annotations = new ModelAnnotations();
		fields = new ArrayList<>();
	}
	
	public List<FieldBean> getFields() {
		return fields;
	}

	public void addField(FieldBean field) {
		this.fields.add(field);
	}
	
	public ModelAnnotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(ModelAnnotations annotations) {
		this.annotations = annotations;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	} 

	
	
}
