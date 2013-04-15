package org.gb.cdl.generator.beans;

import java.util.ArrayList;
import java.util.List;

public class ReducerBean {
	private String name;
	private List<String> inputlist;
	private List<String> outputlist;
	private String sfunction;

	public ReducerBean(){
		inputlist = new ArrayList<>();
		outputlist = new ArrayList<>();
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

	public void setSFunction( String sfunction){
		this.sfunction = sfunction;
	}
	
	public String getSFunction(){
		return this.sfunction;
	}
}
