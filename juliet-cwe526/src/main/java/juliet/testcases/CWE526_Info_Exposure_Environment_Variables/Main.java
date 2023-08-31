package juliet.testcases.CWE526_Info_Exposure_Environment_Variables;

import juliet.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java juliet.support.Main juliet.testcases.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference.custom_function.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference__custom_function_01 juliet.testcases.CWE481_Assigning_instead_of_Comparing.bool.CWE481_Assigning_instead_of_Comparing__bool_01");
				System.exit(1);
			}
			
			/* User supplied some class names on the command line, just use those with introspection
			 *
			 * String classNames[] = { "CWE481_Assigning_instead_of_Comparing__boolean_01",
			 *		"CWE476_Null_Pointer_Dereference__getProperty_01" };
 			 * could read class names from command line or use
			 * http://sadun-util.sourceforge.net/api/org/sadun/util/
			 * ClassPackageExplorer.html
			 */

			for (String className : args) {

				try {
					
					/* String classNameWithPackage = "testcases." + className; */
					
					/* IO.writeLine("classNameWithPackage = " + classNameWithPackage); */

					Class<?> myClass = Class.forName(className);

					AbstractTestCase myObject = (AbstractTestCase) myClass
							.newInstance();

					myObject.runTest(className);

				} catch (Exception ex) {

					IO.writeLine("Could not run test for class " + className);
					ex.printStackTrace();

				}
				
				IO.writeLine(""); /* leave a blank line between classes */

			}

		} else {
		
			/* No command line args were used, we want to run every testcase */
			
			/* needed to separate these calls into other methods because
			   we were running into the size limit Java has for a single method */
			runTestCWE1();
			runTestCWE2();
			runTestCWE3();
			runTestCWE4();
			runTestCWE5();
			runTestCWE6();
			runTestCWE7();
			runTestCWE8();
			runTestCWE9();
		}			
	}

private static void runTestCWE1() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-1 */

			/* END-AUTOGENERATED-JAVA-TESTS-1 */
}

private static void runTestCWE2() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-2 */

			/* END-AUTOGENERATED-JAVA-TESTS-2 */
}

private static void runTestCWE3() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-3 */

			/* END-AUTOGENERATED-JAVA-TESTS-3 */
}

private static void runTestCWE4() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-4 */

			/* END-AUTOGENERATED-JAVA-TESTS-4 */
}

private static void runTestCWE5() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-5 */
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_01()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_01");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_02()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_02");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_03()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_03");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_04()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_04");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_05()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_05");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_06()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_06");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_07()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_07");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_08()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_08");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_09()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_09");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_10()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_10");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_11()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_11");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_12()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_12");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_13()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_13");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_14()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_14");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_15()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_15");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_16()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_16");
			(new juliet.testcases.CWE526_Info_Exposure_Environment_Variables.CWE526_Info_Exposure_Environment_Variables__writeLine_17()).runTest("CWE526_Info_Exposure_Environment_Variables__writeLine_17");
			/* END-AUTOGENERATED-JAVA-TESTS-5 */
}

private static void runTestCWE6() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-6 */

			/* END-AUTOGENERATED-JAVA-TESTS-6 */
}

private static void runTestCWE7() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-7 */

			/* END-AUTOGENERATED-JAVA-TESTS-7 */
}

private static void runTestCWE8() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-8 */

			/* END-AUTOGENERATED-JAVA-TESTS-8 */
}

private static void runTestCWE9() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-9 */

			/* END-AUTOGENERATED-JAVA-TESTS-9 */
}
}