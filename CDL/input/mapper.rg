@Mapper(Model="Person", Pivot="Year", Input="Text", Output="age<IntWritable>, sex<Text>")
function MyMapper(){
	if (function.checkAge() and function.checkSex()){
		return record;
	}
}

function boolean checkAge(){
	if ( Person.age >= 30 ){
		return true;
	}
}

function boolean checkSex(){
	if ( Person.sex == "M" ){
		return true;
	}
}

