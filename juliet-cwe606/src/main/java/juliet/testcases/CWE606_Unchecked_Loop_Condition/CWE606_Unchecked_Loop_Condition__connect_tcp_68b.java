/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE606_Unchecked_Loop_Condition__connect_tcp_68b.java
Label Definition File: CWE606_Unchecked_Loop_Condition.label.xml
Template File: sources-sinks-68b.tmpl.java
*/
/*
 * @description
 * CWE: 606 Unchecked Input for Loop Condition
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: hardcoded int in string form
 * Sinks:
 *    GoodSink: validate loop variable
 *    BadSink : loop variable not validated
 * Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
 *
 * */

package juliet.testcases.CWE606_Unchecked_Loop_Condition;

import juliet.support.*;

import javax.servlet.http.*;

public class CWE606_Unchecked_Loop_Condition__connect_tcp_68b
{
    public void badSink() throws Throwable
    {
        String data = CWE606_Unchecked_Loop_Condition__connect_tcp_68a.data;

        int numberOfLoops;
        try
        {
            numberOfLoops = Integer.parseInt(data);
        }
        catch (NumberFormatException exceptNumberFormat)
        {
            IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
            numberOfLoops = 1;
        }

        for (int i=0; i < numberOfLoops; i++)
        {
            /* POTENTIAL FLAW: user supplied input used for loop counter test */
            IO.writeLine("hello world");
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink() throws Throwable
    {
        String data = CWE606_Unchecked_Loop_Condition__connect_tcp_68a.data;

        int numberOfLoops;
        try
        {
            numberOfLoops = Integer.parseInt(data);
        }
        catch (NumberFormatException exceptNumberFormat)
        {
            IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
            numberOfLoops = 1;
        }

        for (int i=0; i < numberOfLoops; i++)
        {
            /* POTENTIAL FLAW: user supplied input used for loop counter test */
            IO.writeLine("hello world");
        }

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink() throws Throwable
    {
        String data = CWE606_Unchecked_Loop_Condition__connect_tcp_68a.data;

        int numberOfLoops;
        try
        {
            numberOfLoops = Integer.parseInt(data);
        }
        catch (NumberFormatException exceptNumberFormat)
        {
            IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
            numberOfLoops = 1;
        }

        /* FIX: loop number thresholds validated */
        if (numberOfLoops >= 0 && numberOfLoops <= 5)
        {
            for (int i=0; i < numberOfLoops; i++)
            {
                IO.writeLine("hello world");
            }
        }

    }
}