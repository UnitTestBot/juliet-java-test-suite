/*
 * @description Unused public class member variable
 * 
 * */

package juliet.testcases.CWE563_Unused_Variable;

import juliet.support.*;

public class CWE563_Unused_Variable__unused_public_member_variable_01_good1 extends AbstractTestCaseClassIssueGood 
{
    public int intGood1 = 0;

    private void good1() 
    { 
        /* FIX: Use intGood1 */
        IO.writeLine("" + intGood1);
    }

    public void good() 
    { 
        good1();
    }

    /* Below is the main(). It is only used when building this testcase on 
     * its own for testing or for building a binary to use in testing binary 
     * analysis tools. It is not used when compiling all the juliet.testcases as one 
     * application, which is how source code analysis tools are tested. 
	 */ 
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}
