/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__deref_after_check_12.java
Label Definition File: CWE476_NULL_Pointer_Dereference.pointflaw.label.xml
Template File: point-flaw-12.tmpl.java
*/
/*
* @description
* CWE: 476 NULL Pointer Dereference
* Sinks: deref_after_check
*    GoodSink: Do not dereference an object if it is null
*    BadSink : Dereference after checking to see if an object is null
* Flow Variant: 12 Control flow: if(IO.staticReturnsTrueOrFalse())
*
* */

package juliet.testcases.CWE476_NULL_Pointer_Dereference;

import juliet.support.*;

public class CWE476_NULL_Pointer_Dereference__deref_after_check_12 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            {
                /* FLAW: Check for null, but still dereference the object */
                String myString = null;
                if (myString == null)
                {
                    IO.writeLine(myString.length());
                }
            }
        }
        else
        {

            {
                /* FIX: Check for null and do not dereference the object if it is null */
                String myString = null;

                if (myString == null)
                {
                    IO.writeLine("The string is null");
                }
            }

        }
    }

    /* good1() changes the "if" so that both branches use the GoodSink */
    private void good1() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            {
                /* FIX: Check for null and do not dereference the object if it is null */
                String myString = null;
                if (myString == null)
                {
                    IO.writeLine("The string is null");
                }
            }
        }
        else
        {

            {
                /* FIX: Check for null and do not dereference the object if it is null */
                String myString = null;

                if (myString == null)
                {
                    IO.writeLine("The string is null");
                }
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
