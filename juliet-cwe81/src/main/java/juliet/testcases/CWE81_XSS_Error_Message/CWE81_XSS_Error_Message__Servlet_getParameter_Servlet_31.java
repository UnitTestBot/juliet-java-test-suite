/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_31.java
Label Definition File: CWE81_XSS_Error_Message__Servlet.label.xml
Template File: sources-sink-31.tmpl.java
*/
/*
 * @description
 * CWE: 81 Cross Site Scripting (XSS) in Error Message
 * BadSource: getParameter_Servlet Read data from a querystring using getParameter()
 * GoodSource: A hardcoded string
 * Sinks: sendErrorServlet
 *    BadSink : XSS in sendError
 * Flow Variant: 31 Data flow: make a copy of data within the same method
 *
 * */

package juliet.testcases.CWE81_XSS_Error_Message;

import juliet.support.*;

import javax.servlet.http.*;


public class CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_31 extends AbstractTestCaseServlet
{
    /* uses badsource and badsink */
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String dataCopy;
        {
            String data;

            /* POTENTIAL FLAW: Read data from a querystring using getParameter */
            data = request.getParameter("name");

            dataCopy = data;
        }
        {
            String data = dataCopy;

            if (data != null)
            {
                /* POTENTIAL FLAW: script code (e.g. id=<script>alert('xss')</script>) is sent to the client;
                * The built-in J2EE server automatically does some HTML entity encoding.
                * Therefore, to test this, change response.sendError to response.getWriter().println and remove the 404,
                */
                response.sendError(404, "<br>bad() - Parameter name has value " + data);
            }

        }
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String dataCopy;
        {
            String data;

            /* FIX: Use a hardcoded string */
            data = "foo";

            dataCopy = data;
        }
        {
            String data = dataCopy;

            if (data != null)
            {
                /* POTENTIAL FLAW: script code (e.g. id=<script>alert('xss')</script>) is sent to the client;
                * The built-in J2EE server automatically does some HTML entity encoding.
                * Therefore, to test this, change response.sendError to response.getWriter().println and remove the 404,
                */
                response.sendError(404, "<br>bad() - Parameter name has value " + data);
            }

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
