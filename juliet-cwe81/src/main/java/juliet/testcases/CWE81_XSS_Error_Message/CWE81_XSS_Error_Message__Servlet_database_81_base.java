/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE81_XSS_Error_Message__Servlet_database_81_base.java
Label Definition File: CWE81_XSS_Error_Message__Servlet.label.xml
Template File: sources-sink-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 81 Cross Site Scripting (XSS) in Error Message
 * BadSource: database Read data from a database
 * GoodSource: A hardcoded string
 * Sinks: sendErrorServlet
 *    BadSink : XSS in sendError
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE81_XSS_Error_Message;

import juliet.support.*;

import javax.servlet.http.*;

public abstract class CWE81_XSS_Error_Message__Servlet_database_81_base
{
    public abstract void action(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable;
}