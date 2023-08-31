/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE23_Relative_Path_Traversal__console_readLine_81_base.java
Label Definition File: CWE23_Relative_Path_Traversal.label.xml
Template File: sources-sink-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 23 Relative Path Traversal
 * BadSource: console_readLine Read data from the console using readLine()
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : no validation
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE23_Relative_Path_Traversal;

import juliet.support.*;

import java.io.*;
import javax.servlet.http.*;

public abstract class CWE23_Relative_Path_Traversal__console_readLine_81_base
{
    public abstract void action(String data ) throws Throwable;
}