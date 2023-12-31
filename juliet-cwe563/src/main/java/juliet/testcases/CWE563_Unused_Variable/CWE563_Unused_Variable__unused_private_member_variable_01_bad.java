/*
 * @description Unused private class member variable
 * 
 * */

package juliet.testcases.CWE563_Unused_Variable;

import juliet.support.*;

public class CWE563_Unused_Variable__unused_private_member_variable_01_bad extends AbstractTestCaseClassIssueBad 
{
    private int intBad = 1; /* FLAW: This member is never used */

    public void bad() 
    {    
        /* FLAW: Don't use intBad */
        IO.writeLine("" + 5);
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
