/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE23_Relative_Path_Traversal__File_41.java
Label Definition File: CWE23_Relative_Path_Traversal.label.xml
Template File: sources-sink-41.tmpl.java
*/
/*
 * @description
 * CWE: 23 Relative Path Traversal
 * BadSource: File Read data from file (named c:\data.txt)
 * GoodSource: A hardcoded string
 * BadSink: readFile no validation
 * Flow Variant: 41 Data flow: data passed as an argument from one method to another in the same class
 *
 * */

package juliet.testcases.CWE23_Relative_Path_Traversal;

import juliet.support.*;

import java.io.*;
import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

import java.util.logging.Level;


public class CWE23_Relative_Path_Traversal__File_41 extends AbstractTestCase
{
    private void badSink(String data ) throws Throwable
    {

        String root;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            /* running on Windows */
            root = "C:\\uploads\\";
        }
        else
        {
            /* running on non-Windows */
            root = "/home/user/uploads/";
        }

        if (data != null)
        {
            /* POTENTIAL FLAW: no validation of concatenated value */
            File file = new File(root + data);
            FileInputStream streamFileInputSink = null;
            InputStreamReader readerInputStreamSink = null;
            BufferedReader readerBufferdSink = null;
            if (file.exists() && file.isFile())
            {
                try
                {
                    streamFileInputSink = new FileInputStream(file);
                    readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                    readerBufferdSink = new BufferedReader(readerInputStreamSink);
                    IO.writeLine(readerBufferdSink.readLine());
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    /* Close stream reading objects */
                    try
                    {
                        if (readerBufferdSink != null)
                        {
                            readerBufferdSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStreamSink != null)
                        {
                            readerInputStreamSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

                    try
                    {
                        if (streamFileInputSink != null)
                        {
                            streamFileInputSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        }

    }

    public void bad() throws Throwable
    {
        String data;

        data = ""; /* Initialize data */
        {
            File file = new File("C:\\data.txt");
            FileInputStream streamFileInput = null;
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;

            try
            {
                /* read string from file into data */
                streamFileInput = new FileInputStream(file);
                readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);

                /* POTENTIAL FLAW: Read data from a file */
                /* This will be reading the first "line" of the file, which
                 * could be very long if there are little or no newlines in the file */
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            finally
            {
                /* Close stream reading objects */
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }

                try
                {
                    if (streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                }
            }
        }

        badSink(data  );
    }

    public void good() throws Throwable
    {
        goodG2B();
    }

    private void goodG2BSink(String data ) throws Throwable
    {

        String root;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            /* running on Windows */
            root = "C:\\uploads\\";
        }
        else
        {
            /* running on non-Windows */
            root = "/home/user/uploads/";
        }

        if (data != null)
        {
            /* POTENTIAL FLAW: no validation of concatenated value */
            File file = new File(root + data);
            FileInputStream streamFileInputSink = null;
            InputStreamReader readerInputStreamSink = null;
            BufferedReader readerBufferdSink = null;
            if (file.exists() && file.isFile())
            {
                try
                {
                    streamFileInputSink = new FileInputStream(file);
                    readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                    readerBufferdSink = new BufferedReader(readerInputStreamSink);
                    IO.writeLine(readerBufferdSink.readLine());
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    /* Close stream reading objects */
                    try
                    {
                        if (readerBufferdSink != null)
                        {
                            readerBufferdSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStreamSink != null)
                        {
                            readerInputStreamSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

                    try
                    {
                        if (streamFileInputSink != null)
                        {
                            streamFileInputSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        }

    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        String data;

        /* FIX: Use a hardcoded string */
        data = "foo";

        goodG2BSink(data  );
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
