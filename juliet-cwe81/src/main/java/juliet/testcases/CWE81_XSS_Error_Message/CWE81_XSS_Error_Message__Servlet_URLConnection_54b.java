/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE81_XSS_Error_Message__Servlet_URLConnection_54b.java
Label Definition File: CWE81_XSS_Error_Message__Servlet.label.xml
Template File: sources-sink-54b.tmpl.java
*/
/*
 * @description
 * CWE: 81 Cross Site Scripting (XSS) in Error Message
 * BadSource: URLConnection Read data from a web server with URLConnection
 * GoodSource: A hardcoded string
 * Sinks: sendErrorServlet
 *    BadSink : XSS in sendError
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE81_XSS_Error_Message;

import juliet.support.*;

import javax.servlet.http.*;

public class CWE81_XSS_Error_Message__Servlet_URLConnection_54b
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE81_XSS_Error_Message__Servlet_URLConnection_54c()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE81_XSS_Error_Message__Servlet_URLConnection_54c()).goodG2BSink(data , request, response);
    }
}