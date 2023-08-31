/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_31.java
Label Definition File: CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet.label.xml
Template File: sources-sink-31.tmpl.java
*/
/*
 * @description
 * CWE: 566 Authorization Bypass through SQL primary
 * BadSource:  user id taken from url parameter
 * GoodSource: hardcoded user id
 * Sinks: writeConsole
 *    BadSink : user authorization not checked
 * Flow Variant: 31 Data flow: make a copy of data within the same method
 *
 * */

package juliet.testcases.CWE566_Authorization_Bypass_Through_SQL_Primary;

import juliet.support.*;

import javax.servlet.http.*;

import java.sql.*;

import java.util.logging.Level;

public class CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_31 extends AbstractTestCaseServlet
{
    /* uses badsource and badsink */
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String dataCopy;
        {
            String data;

            /* FLAW: Get the user ID from a URL parameter */
            data = request.getParameter("id");

            dataCopy = data;
        }
        {
            String data = dataCopy;

            Connection dBConnection = IO.getDBConnection();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            int id = 0;
            try
            {
                id = Integer.parseInt(data);
            }
            catch ( NumberFormatException nfx )
            {
                id = -1; /* Assuming this id does not exist */
            }

            try
            {
                preparedStatement = dBConnection.prepareStatement("select * from invoices where uid=?");
                preparedStatement.setInt(1, id);

                resultSet = preparedStatement.executeQuery();

                /* POTENTIAL FLAW: no check to see whether the user has privileges to view the data */
                IO.writeString("bad() - result requested: " + data +"\n");
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error executing query", exceptSql);
            }
            finally
            {
                try
                {
                    if (resultSet != null)
                    {
                        resultSet.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Could not close ResultSet", exceptSql);
                }

                try
                {
                    if (preparedStatement != null)
                    {
                        preparedStatement.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Could not close PreparedStatement", exceptSql);
                }

                try
                {
                    if (dBConnection != null)
                    {
                        dBConnection.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Could not close Connection", exceptSql);
                }
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

            /* FIX: Use a hardcoded user ID */
            data = "10";

            dataCopy = data;
        }
        {
            String data = dataCopy;

            Connection dBConnection = IO.getDBConnection();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            int id = 0;
            try
            {
                id = Integer.parseInt(data);
            }
            catch ( NumberFormatException nfx )
            {
                id = -1; /* Assuming this id does not exist */
            }

            try
            {
                preparedStatement = dBConnection.prepareStatement("select * from invoices where uid=?");
                preparedStatement.setInt(1, id);

                resultSet = preparedStatement.executeQuery();

                /* POTENTIAL FLAW: no check to see whether the user has privileges to view the data */
                IO.writeString("bad() - result requested: " + data +"\n");
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error executing query", exceptSql);
            }
            finally
            {
                try
                {
                    if (resultSet != null)
                    {
                        resultSet.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Could not close ResultSet", exceptSql);
                }

                try
                {
                    if (preparedStatement != null)
                    {
                        preparedStatement.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Could not close PreparedStatement", exceptSql);
                }

                try
                {
                    if (dBConnection != null)
                    {
                        dBConnection.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Could not close Connection", exceptSql);
                }
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