/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE396_Catch_Generic_Exception__Throwable_10.java
Label Definition File: CWE396_Catch_Generic_Exception.label.xml
Template File: point-flaw-10.tmpl.java
*/
/*
* @description
* CWE: 396 An overly broad catch statement may cause errors in program execution if unexpected exceptions are thrown
* Sinks: Throwable
*    GoodSink: Catch specific exception type (NumberFormatException)
*    BadSink : Catch Throwable, which is overly generic
* Flow Variant: 10 Control flow: if(IO.staticTrue) and if(IO.staticFalse)
*
* */

package juliet.testcases.CWE396_Catch_Generic_Exception;

import juliet.support.*;

public class CWE396_Catch_Generic_Exception__Throwable_10 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticTrue)
        {
            try
            {
                Integer.parseInt("Test"); /* Will throw NumberFormatException */
            }
            catch (Throwable throwable) /* FLAW: Catch Throwable, which is overly generic */
            {
                IO.writeLine("Caught Throwable");
                throw throwable; /* Rethrow */
            }
        }
    }

    /* good1() changes IO.staticTrue to IO.staticFalse */
    private void good1() throws Throwable
    {
        if (IO.staticFalse)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
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

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (IO.staticTrue)
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
        good2();
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
