package juliet.testcases.CWE571_Expression_Always_True;

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
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__class_getClass_not_equal_01()).runTest("CWE571_Expression_Always_True__class_getClass_not_equal_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__n_equal_m_minus_one_01()).runTest("CWE571_Expression_Always_True__n_equal_m_minus_one_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__n_less_int_max_01()).runTest("CWE571_Expression_Always_True__n_less_int_max_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__private_01()).runTest("CWE571_Expression_Always_True__private_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__private_five_01()).runTest("CWE571_Expression_Always_True__private_five_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__private_return_01()).runTest("CWE571_Expression_Always_True__private_return_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__private_static_final_01()).runTest("CWE571_Expression_Always_True__private_static_final_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__private_static_final_five_01()).runTest("CWE571_Expression_Always_True__private_static_final_five_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__static_01()).runTest("CWE571_Expression_Always_True__static_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__static_final_01()).runTest("CWE571_Expression_Always_True__static_final_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__static_final_five_01()).runTest("CWE571_Expression_Always_True__static_final_five_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__static_five_01()).runTest("CWE571_Expression_Always_True__static_five_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__static_return_01()).runTest("CWE571_Expression_Always_True__static_return_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__string_equals_01()).runTest("CWE571_Expression_Always_True__string_equals_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__true_01()).runTest("CWE571_Expression_Always_True__true_01");
			(new juliet.testcases.CWE571_Expression_Always_True.CWE571_Expression_Always_True__two_equals_two_01()).runTest("CWE571_Expression_Always_True__two_equals_two_01");
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