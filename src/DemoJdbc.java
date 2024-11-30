import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
1. Import package
2. Load Driver
3. Register Driver
4. create connection
5. create statement
6. execute statement
7. close
         */


        int id = 1222;
        String name = "Dhoni";
        int marks= 122;
        String url = "jdbc:postgresql://localhost:7777/PostgressLearning";
        String uname="postgres";
        String pass = "805130@Bhai";

      //  String query = "INSERT INTO student VALUES (" + id + ", '" + name + "', " + marks + ")";

      String query = "INSERT INTO student VALUES(?,?,?)";


      /*
      load driver
       */
        Class.forName("org.postgresql.Driver");

        /*
        connection
         */


        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Connection Established");


        // to fetch data

       // Statement st = con.createStatement();

        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,marks);

        st.execute();
/*
read statement
 */
      //  ResultSet rs =  st.executeQuery(query);

   //    System.out.println(rs.next());

        /* fetching 1 data
        rs.next();

        String name = rs.getString("name");

       System.out.println(name);


         */
// print all the data

        // while (nkls   - - - -   Realtime)

        //
        /*
        while (rs.next())
        {
            System.out.print(rs.getInt(1) + "-");
            System.out.print(rs.getString(2) + "-");
            System.out.println(rs.getInt(3));
        }


         */


// insert Data

//       boolean status =  st.execute(query);
//       System.out.println(status);

// Update

      con.close();
        System.out.println("Connection Closed");








    }

}
