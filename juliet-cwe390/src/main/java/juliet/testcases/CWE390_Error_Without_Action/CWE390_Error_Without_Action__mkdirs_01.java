/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE390_Error_Without_Action__mkdirs_01.java
Label Definition File: CWE390_Error_Without_Action.label.xml
Template File: point-flaw-01.tmpl.java
*/
/*
* @description
* CWE: 390 Detection of Error Condition Without Action
* Sinks: mkdirs
*    GoodSink: Throw Exception if newDirectory cannot be created
*    BadSink : Do nothing if newDirectory cannot be created
* Flow Variant: 01 Baseline
*
* */

package juliet.testcases.CWE390_Error_Without_Action;

import juliet.support.*;

import java.io.File;

public class CWE390_Error_Without_Action__mkdirs_01 extends AbstractTestCase
{
    public void bad() throws Throwable
    {

        File newDirectory = null;

        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            /* running on Windows */
            newDirectory = new File("C:\\lvl_1\\lvl_2\\lvl_3\\");
        }
        else
        {
            /* running on non-Windows */
            newDirectory = new File("/home/user/lvl_1/lvl_2/lvl_3/");
        }

        if (!newDirectory.mkdirs())
        {
            /* FLAW: do nothing if newDirectory cannot be created */
        }

    }

    public void good() throws Throwable
    {
        good1();
    }

    private void good1() throws Throwable
    {

        File newDirectory = null;

        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            /* running on Windows */
            newDirectory = new File("C:\\lvl_1\\lvl_2\\lvl_3\\");
        }
        else
        {
            /* running on non-Windows */
            newDirectory = new File("/home/user/lvl_1/lvl_2/lvl_3/");
        }

        if (!newDirectory.mkdirs())
        {
            /* FIX: report the mkdirs failure and throw a new Exception */
            IO.writeLine("The directories could not be created");
            StringBuilder errorString = new StringBuilder();
            errorString.append("The directories (");
            errorString.append(newDirectory.getAbsolutePath());
            errorString.append(") could not be created: ");
            throw new Exception(errorString.toString());
        }

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

