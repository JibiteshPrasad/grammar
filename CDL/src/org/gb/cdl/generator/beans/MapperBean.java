package org.gb.cdl.generator.beans;

import java.util.ArrayList;
import java.util.List;

public class MapperBean {
	
	private String model;
	private String name;
	private List<String> inputlist;
	private List<String> outputlist;
	private List<FunctionBean> functionbeanlist;
	private String statement;
	private FunctionBean root;
	
	public FunctionBean getRoot() {
		return root;
	}

	public void setRoot(FunctionBean root) {
		this.root = root;
	}

	public MapperBean(){
		inputlist = new ArrayList<>();
		outputlist = new ArrayList<>();
		functionbeanlist = new ArrayList<>();
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getInput() {
		return inputlist;
	}
	public void addInput(String input) {
		this.inputlist.add(input);
	}
	public List<String> getOutput() {
		return outputlist;
	}
	public void addOutput(String output) {
		this.outputlist.add(output);
	}
	
	public List<FunctionBean> getFunctionBean(){
		return this.functionbeanlist;
	}

	public void addFunctionBean( FunctionBean functionbean){
		this.functionbeanlist.add(functionbean);
	}
	
	public void setStatement( String statement){
		this.statement = statement;
	}
	
	public String getStatement(){
		return this.statement;
	}
}
