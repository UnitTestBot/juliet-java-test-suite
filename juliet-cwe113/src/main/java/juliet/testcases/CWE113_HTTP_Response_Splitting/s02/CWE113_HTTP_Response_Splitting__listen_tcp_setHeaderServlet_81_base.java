/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE113_HTTP_Response_Splitting__listen_tcp_setHeaderServlet_81_base.java
Label Definition File: CWE113_HTTP_Response_Splitting.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 113 HTTP Response Splitting
 * BadSource: listen_tcp Read data using a listening tcp connection
 * GoodSource: A hardcoded string
 * Sinks: setHeaderServlet
 *    GoodSink: URLEncode input
 *    BadSink : querystring to setHeader()
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE113_HTTP_Response_Splitting.s02;
import juliet.support.*;

import javax.servlet.http.*;

public abstract class CWE113_HTTP_Response_Splitting__listen_tcp_setHeaderServlet_81_base
{
    public abstract void action(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable;
}