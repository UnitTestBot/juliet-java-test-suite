/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__connect_tcp_67b.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-67b.tmpl.java
*/
/*
 * @description
 * CWE: 78 OS Command Injection
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks: exec
 *    BadSink : dynamic command execution with Runtime.getRuntime().exec()
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */

package juliet.testcases.CWE78_OS_Command_Injection;

import juliet.support.*;

import javax.servlet.http.*;

public class CWE78_OS_Command_Injection__connect_tcp_67b
{
    public void badSink(CWE78_OS_Command_Injection__connect_tcp_67a.Container dataContainer ) throws Throwable
    {
        String data = dataContainer.containerOne;

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            /* running on Windows */
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            /* running on non-Windows */
            osCommand = "/bin/ls ";
        }

        /* POTENTIAL FLAW: command injection */
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(CWE78_OS_Command_Injection__connect_tcp_67a.Container dataContainer ) throws Throwable
    {
        String data = dataContainer.containerOne;

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            /* running on Windows */
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            /* running on non-Windows */
            osCommand = "/bin/ls ";
        }

        /* POTENTIAL FLAW: command injection */
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }
}
