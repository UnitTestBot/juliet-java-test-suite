/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE606_Unchecked_Loop_Condition__getCookies_Servlet_81_goodB2G.java
Label Definition File: CWE606_Unchecked_Loop_Condition.label.xml
Template File: sources-sinks-81_goodB2G.tmpl.java
*/
/*
 * @description
 * CWE: 606 Unchecked Input for Loop Condition
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: hardcoded int in string form
 * Sinks:
 *    GoodSink: validate loop variable
 *    BadSink : loop variable not validated
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE606_Unchecked_Loop_Condition;

import juliet.support.*;

import javax.servlet.http.*;

public class CWE606_Unchecked_Loop_Condition__getCookies_Servlet_81_goodB2G extends CWE606_Unchecked_Loop_Condition__getCookies_Servlet_81_base
{
    public void action(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

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
