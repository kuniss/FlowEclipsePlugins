namespace de.grammarcraft.transformer {
	static void Main(string[] args)
	{
		var config = new FlowRuntimeConfiguration();
		
		// registration of streams
		config.AddStreamsFrom(@"/
			// main flow definition comes here
			main
			.in,Transform
			Transform,.out
			// Transform flow definition comes here
			Transform
			.,toUpper
			toUpper,reverse
			reverse,toLower.process
			toLower.result,.
		");
		
		// registration of operations
		config
			.addOperation(new de.grammarcraft.firstflow.operations.ToLower())
			.addEventBasedComponent("toUpper", new de.grammarcraft.firstflow.operations.ToUpper())
			.addFunc<string,tring>("reverse", de.grammarcraft.firstflow.operations.StringOperations.reverse)
	}
}
