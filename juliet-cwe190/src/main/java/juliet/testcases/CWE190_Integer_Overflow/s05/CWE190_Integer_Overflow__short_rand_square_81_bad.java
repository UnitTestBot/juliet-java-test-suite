/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__short_rand_square_81_bad.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-81_bad.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: rand Set data to result of rand()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: square
 *    GoodSink: Ensure there will not be an overflow before squaring data
 *    BadSink : Square data, which can lead to overflow
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE190_Integer_Overflow.s05;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__short_rand_square_81_bad extends CWE190_Integer_Overflow__short_rand_square_81_base
{
    public void action(short data ) throws Throwable
    {

        /* POTENTIAL FLAW: if (data*data) > Short.MAX_VALUE, this will overflow */
        short result = (short)(data * data);

        IO.writeLine("result: " + result);

    }
}