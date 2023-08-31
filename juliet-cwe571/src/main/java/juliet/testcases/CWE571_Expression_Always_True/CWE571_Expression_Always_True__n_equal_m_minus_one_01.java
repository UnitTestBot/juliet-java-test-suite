/*
 * @description statement always evaluates to true
 * 
 * */
package juliet.testcases.CWE571_Expression_Always_True;

import juliet.support.AbstractTestCase;
import juliet.support.IO;
import java.security.SecureRandom;

public class CWE571_Expression_Always_True__n_equal_m_minus_one_01 extends AbstractTestCase 
{
    public void bad()
    {
        /* FLAW: always evaluates to true */
        int intThirty = 30;
        int intThirtyOne = 31;
        if (intThirty == (intThirtyOne - 1))
        {
            IO.writeLine("always prints");
        }
    }
    
    public void good()
    {
        good1();
    }
    
    private void good1()
    {
        /* FIX: may evaluate to true or false */
        int intSecureRandom1 = (new SecureRandom()).nextInt();
        int intSecureRandom2 = (new SecureRandom()).nextInt();
        if (intSecureRandom1 != intSecureRandom2)
        {
            IO.writeLine("sometimes prints");
        }
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
