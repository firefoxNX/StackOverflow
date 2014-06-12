package com.vineetb.stackoverflow.commonscli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		test("job", "-update"); // works fine
		test("job", "-dryrun"); // works fine
//		test("job", "-update", "-dryrun"); // doesn't work
	}

	public static void test(String... args) throws ParseException {
		
		Options options = new Options();

		// OptionGroup option = new OptionGroup();
		// option.addOption(new Option("dryrun", "dryrun"));
		// option.addOption(new Option("update", "update"));
		// options.addOptionGroup(option);

		Option dryrunOption = OptionBuilder.withArgName("dryrun")
				.withDescription("dry run").create("dryrun");
		options.addOption(dryrunOption);

		Option updateOption = OptionBuilder.withArgName("update")
				.withDescription("update").create("update");
		options.addOption(updateOption);

		// create the parser
		GnuParser parser = new GnuParser();
		try {
			// parse the command line arguments
			CommandLine line = parser.parse(options, args);
			Option[] opts = line.getOptions();
			for(String arg: line.getArgs()){
				System.out.println(arg);
			}
			for(Option opt: opts){
				System.out.println(opt.getOpt()+" : "+opt.getValue());
			}
		} catch (ParseException exp) {
			exp.printStackTrace();
		}
	}
}
