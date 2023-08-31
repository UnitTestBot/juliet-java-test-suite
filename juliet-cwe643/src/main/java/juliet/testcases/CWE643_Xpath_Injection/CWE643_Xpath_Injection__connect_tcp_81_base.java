/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE643_Xpath_Injection__connect_tcp_81_base.java
Label Definition File: CWE643_Xpath_Injection.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 643 Xpath Injection
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks:
 *    GoodSink: validate input through StringEscapeUtils
 *    BadSink : user input is used without validate
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE643_Xpath_Injection;

import juliet.support.*;

import javax.servlet.http.*;

public abstract class CWE643_Xpath_Injection__connect_tcp_81_base
{
    public abstract void action(String data ) throws Throwable;
}