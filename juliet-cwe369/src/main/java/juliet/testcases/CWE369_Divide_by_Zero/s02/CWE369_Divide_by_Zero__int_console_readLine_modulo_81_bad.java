/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_console_readLine_modulo_81_bad.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-81_bad.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: console_readLine Read data from the console using readLine
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE369_Divide_by_Zero.s02;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE369_Divide_by_Zero__int_console_readLine_modulo_81_bad extends CWE369_Divide_by_Zero__int_console_readLine_modulo_81_base
{
    public void action(int data ) throws Throwable
    {

        /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
        result in an exception.  */
        IO.writeLine("100%" + data + " = " + (100 % data) + "\n");

    }
}
