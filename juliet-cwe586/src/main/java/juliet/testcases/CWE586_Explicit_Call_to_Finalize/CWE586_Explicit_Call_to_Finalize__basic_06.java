/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE586_Explicit_Call_to_Finalize__basic_06.java
Label Definition File: CWE586_Explicit_Call_to_Finalize__basic.label.xml
Template File: point-flaw-06.tmpl.java
*/
/*
* @description
* CWE: 586 Explicit call to finalize()
* Sinks:
*    GoodSink: let garbage collection invoke finalize
*    BadSink : explictly calling finalize()
* Flow Variant: 06 Control flow: if(PRIVATE_STATIC_FINAL_FIVE==5) and if(PRIVATE_STATIC_FINAL_FIVE!=5)
*
* */

package juliet.testcases.CWE586_Explicit_Call_to_Finalize;

import juliet.support.*;

public class CWE586_Explicit_Call_to_Finalize__basic_06 extends AbstractTestCase
{
    /* The variable below is declared "final", so a tool should be able
     * to identify that reads of this will always give its initialized
     * value.
     */
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            CWE586_Explicit_Call_to_Finalize__basic_Helper badObj = new CWE586_Explicit_Call_to_Finalize__basic_Helper();
            try
            {
                badObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                /* cleanup */
                /* FLAW: avoid explicitly invoking the finalize method on an object */
                badObj.finalize();
            }
        }
    }

    /* good1() changes PRIVATE_STATIC_FINAL_FIVE==5 to PRIVATE_STATIC_FINAL_FIVE!=5 */
    private void good1() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            CWE586_Explicit_Call_to_Finalize__basic_Helper goodObj = new CWE586_Explicit_Call_to_Finalize__basic_Helper();

            try
            {
                goodObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                /* cleanup */
                /* FIX: set reference to null and garbage collector will eventually finalize the object */
                goodObj = null;
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            CWE586_Explicit_Call_to_Finalize__basic_Helper goodObj = new CWE586_Explicit_Call_to_Finalize__basic_Helper();
            try
            {
                goodObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                /* cleanup */
                /* FIX: set reference to null and garbage collector will eventually finalize the object */
                goodObj = null;
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