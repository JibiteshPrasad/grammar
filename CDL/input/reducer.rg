@Reducer(Model="Person", Pivot="Year", Input="key<Text>, values<IntWritable>", Output="age<IntWritable>")
function MyReducer(){
	sfunction.max(values);
}
