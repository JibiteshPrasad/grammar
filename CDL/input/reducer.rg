@Reducer(Model="Person", Pivot="Year", Input="key<Text>, values<IntWritable>", Output="age<IntWritable>")
function MyReducer(){
		if (function.getMax(key, value)){
		return record;
	}
}

function boolean getMax(Text key, IntWritable values){
	if( max( values)){
		return true;
	}
}
