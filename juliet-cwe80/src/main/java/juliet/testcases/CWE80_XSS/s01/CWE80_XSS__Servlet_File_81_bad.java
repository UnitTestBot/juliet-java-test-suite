/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__Servlet_File_81_bad.java
Label Definition File: CWE80_XSS__Servlet.label.xml
Template File: sources-sink-81_bad.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: File Read data from file (named c:\data.txt)
 * GoodSource: A hardcoded string
 * Sinks:
 *    BadSink : Display of data in web page without any encoding or validation
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE80_XSS.s01;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE80_XSS__Servlet_File_81_bad extends CWE80_XSS__Servlet_File_81_base
{
    public void action(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            /* POTENTIAL FLAW: Display of data in web page without any encoding or validation */
            response.getWriter().println("<br>bad(): data = " + data);
        }

    }
}
