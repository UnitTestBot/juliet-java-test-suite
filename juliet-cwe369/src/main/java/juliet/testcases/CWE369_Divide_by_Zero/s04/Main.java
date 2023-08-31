package juliet.testcases.CWE369_Divide_by_Zero.s04;

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
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_01()).runTest("CWE369_Divide_by_Zero__int_zero_divide_01");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_02()).runTest("CWE369_Divide_by_Zero__int_zero_divide_02");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_03()).runTest("CWE369_Divide_by_Zero__int_zero_divide_03");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_04()).runTest("CWE369_Divide_by_Zero__int_zero_divide_04");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_05()).runTest("CWE369_Divide_by_Zero__int_zero_divide_05");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_06()).runTest("CWE369_Divide_by_Zero__int_zero_divide_06");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_07()).runTest("CWE369_Divide_by_Zero__int_zero_divide_07");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_08()).runTest("CWE369_Divide_by_Zero__int_zero_divide_08");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_09()).runTest("CWE369_Divide_by_Zero__int_zero_divide_09");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_10()).runTest("CWE369_Divide_by_Zero__int_zero_divide_10");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_11()).runTest("CWE369_Divide_by_Zero__int_zero_divide_11");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_12()).runTest("CWE369_Divide_by_Zero__int_zero_divide_12");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_13()).runTest("CWE369_Divide_by_Zero__int_zero_divide_13");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_14()).runTest("CWE369_Divide_by_Zero__int_zero_divide_14");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_15()).runTest("CWE369_Divide_by_Zero__int_zero_divide_15");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_16()).runTest("CWE369_Divide_by_Zero__int_zero_divide_16");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_17()).runTest("CWE369_Divide_by_Zero__int_zero_divide_17");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_21()).runTest("CWE369_Divide_by_Zero__int_zero_divide_21");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_22a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_22a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_31()).runTest("CWE369_Divide_by_Zero__int_zero_divide_31");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_41()).runTest("CWE369_Divide_by_Zero__int_zero_divide_41");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_42()).runTest("CWE369_Divide_by_Zero__int_zero_divide_42");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_45()).runTest("CWE369_Divide_by_Zero__int_zero_divide_45");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_51a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_51a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_52a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_52a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_53a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_53a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_54a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_54a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_61a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_61a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_66a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_66a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_67a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_67a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_68a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_68a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_71a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_71a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_72a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_72a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_73a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_73a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_74a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_74a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_75a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_75a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_divide_81a()).runTest("CWE369_Divide_by_Zero__int_zero_divide_81a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_01()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_01");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_02()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_02");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_03()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_03");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_04()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_04");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_05()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_05");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_06()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_06");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_07()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_07");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_08()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_08");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_09()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_09");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_10()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_10");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_11()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_11");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_12()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_12");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_13()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_13");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_14()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_14");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_15()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_15");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_16()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_16");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_17()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_17");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_21()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_21");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_22a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_22a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_31()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_31");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_41()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_41");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_42()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_42");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_45()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_45");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_51a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_51a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_52a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_52a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_53a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_53a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_54a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_54a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_61a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_61a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_66a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_66a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_67a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_67a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_68a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_68a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_71a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_71a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_72a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_72a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_73a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_73a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_74a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_74a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_75a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_75a");
			(new juliet.testcases.CWE369_Divide_by_Zero.s04.CWE369_Divide_by_Zero__int_zero_modulo_81a()).runTest("CWE369_Divide_by_Zero__int_zero_modulo_81a");
			/* END-AUTOGENERATED-JAVA-TESTS-3 */
}

private static void runTestCWE4() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-4 */

			/* END-AUTOGENERATED-JAVA-TESTS-4 */
}

private static void runTestCWE5() {
/* BEGIN-AUTOGENERATED-JAVA-TESTS-5 */

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