/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE398_Poor_Code_Quality__empty_if_08.java
Label Definition File: CWE398_Poor_Code_Quality.label.xml
Template File: point-flaw-08.tmpl.java
*/
/*
* @description
* CWE: 398 Indicator of Poor Code Quality
* Sinks: empty_if
*    GoodSink: If statement contains code
*    BadSink : An empty if statement has no effect
* Flow Variant: 08 Control flow: if(privateReturnsTrue()) and if(privateReturnsFalse())
*
* */

package juliet.testcases.CWE398_Poor_Code_Quality;

import juliet.support.*;

import java.security.SecureRandom;

public class CWE398_Poor_Code_Quality__empty_if_08 extends AbstractTestCase
{
    /* The methods below always return the same value, so a tool
     * should be able to figure out that every call to these
     * methods will return true or return false.
     */
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void bad() throws Throwable
    {
        if (privateReturnsTrue())
        {
            int x;
            x = (new SecureRandom()).nextInt();
            /* FLAW: An empty if statement has no effect */
            if (x == 0)
            {
            }
            else
            {
                IO.writeLine("Inside the else statement");
            }
            IO.writeLine("Hello from bad()");
        }
    }

    /* good1() changes privateReturnsTrue() to privateReturnsFalse() */
    private void good1() throws Throwable
    {
        if (privateReturnsFalse())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            int x;

            x = (new SecureRandom()).nextInt();

            /* FIX: Do not include an empty if statement */
            if (x == 0)
            {
                IO.writeLine("Inside the if statement");
            }
            else
            {
                IO.writeLine("Inside the else statement");
            }

            IO.writeLine("Hello from good()");

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (privateReturnsTrue())
        {
            int x;
            x = (new SecureRandom()).nextInt();
            /* FIX: Do not include an empty if statement */
            if (x == 0)
            {
                IO.writeLine("Inside the if statement");
            }
            else
            {
                IO.writeLine("Inside the else statement");
            }
            IO.writeLine("Hello from good()");
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
