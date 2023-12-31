/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE396_Catch_Generic_Exception__Exception_17.java
Label Definition File: CWE396_Catch_Generic_Exception.label.xml
Template File: point-flaw-17.tmpl.java
*/
/*
* @description
* CWE: 396 An overly broad catch statement may cause errors in program execution if unexpected exceptions are thrown
* Sinks: Exception
*    GoodSink: Catch specific exception type (NumberFormatException)
*    BadSink : Catch Exception, which is overly generic
* Flow Variant: 17 Control flow: for loops
*
* */

package juliet.testcases.CWE396_Catch_Generic_Exception;

import juliet.support.*;

public class CWE396_Catch_Generic_Exception__Exception_17 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            try
            {
                Integer.parseInt("Test"); /* Will throw NumberFormatException */
            }
            catch (Exception exception) /* FLAW: Catch Exception, which is overly generic */
            {
                IO.writeLine("Caught Exception");
                throw exception; /* Rethrow */
            }
        }
    }

    /* good1() use the GoodSinkBody in the for statement */
    private void good1() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            try
            {
                Integer.parseInt("Test"); /* Will throw NumberFormatException */
            }
            catch (NumberFormatException exceptNumberFormat) /* FIX: Catch NumberFormatException */
            {
                IO.writeLine("Caught Exception");
                throw exceptNumberFormat; /* Rethrow */
            }
        }
    }

    public void good() throws Throwable
    {
        good1();
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the juliet.testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
