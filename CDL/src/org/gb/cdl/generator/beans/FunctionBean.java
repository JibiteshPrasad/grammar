package org.gb.cdl.generator.beans;

import java.util.ArrayList;
import java.util.List;

public class FunctionBean {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String returntype;
	private List<String> parameterlist;
	private List<String> statementlist;
	private List<IfCondition> conditionlist;
	
	public FunctionBean(){
		parameterlist = new ArrayList<>();
		statementlist = new ArrayList<>();
		conditionlist = new ArrayList<>();
	}
	
	public String getReturntype() {
		return returntype;
	}
	public void setReturntype(String returntype) {
		this.returntype = returntype;
	}
	public List<String> getParameters() {
		return parameterlist;
	}
	public void addParameters(String parameter) {
		this.parameterlist.add(parameter);
	}
	public List<String> getStatement() {
		return statementlist;
	}
	public void addStatement(String statement) {
		this.statementlist.add(statement);
	}
	
	public List<IfCondition> getconditions(){
		return this.conditionlist;
	}
	
	public void addCondition( IfCondition condition){
		conditionlist.add(condition);
	}

}
