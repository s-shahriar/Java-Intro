package JDBC;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws Exception {
        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/demo"; // JDBC URL of the PostgresSQL database
        String uname = "postgres"; // Username for database
        String pass = "1234"; // Password for database

        // Establish connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");

        // Step 1: Read operation - Retrieve specific record (student_id=1)
        String sqlSelect = "SELECT * FROM student WHERE student_id = ?";
        PreparedStatement select = con.prepareStatement(sqlSelect); // Prepare the SELECT statement
        select.setInt(1, 1); // Replace ? with student_id=1
        ResultSet rs1 = select.executeQuery(); // ResultSet: Stores the result of the executed query

        if (rs1.next()) { // Move to the first row of the result set
            System.out.println("READ SINGLE - Student Details:");
            System.out.println("ID: " + rs1.getInt("student_id") + ", First Name: " + rs1.getString("first_name") + ", Last Name: " + rs1.getString("last_name") + ", Age: " + rs1.getInt("age") + ", Marks: " + rs1.getInt("marks"));
        }

        // Step 2: Read operation - Retrieve all records
        String sqlReadAll = "SELECT * FROM student";
        PreparedStatement readAll = con.prepareStatement(sqlReadAll); // Prepare the SELECT statement to fetch all records
        ResultSet rs2 = readAll.executeQuery(); // ResultSet: Stores all rows returned by the query

        System.out.println("\n READ - All Students:");
        while (rs2.next()) { // Iterate through each row in the result set
            System.out.println("ID: " + rs2.getInt("student_id") + ", First Name: " + rs2.getString("first_name") + ", Last Name: " + rs2.getString("last_name") + ", Age: " + rs2.getInt("age") + ", Marks: " + rs2.getInt("marks"));
        }

        // Step 3: Update operation - Update first_name for a specific student_id
        String sqlUpdate = "UPDATE student SET first_name = ? WHERE student_id = ?";
        PreparedStatement update = con.prepareStatement(sqlUpdate); // Prepare the UPDATE statement
        update.setString(1, "UpdatedName"); // Replace ? with the new first name
        update.setInt(2, 1); // Replace ? with student_id=1
        int rowsUpdated = update.executeUpdate(); // Execute the update query
        System.out.println("\nRows updated: " + rowsUpdated); // will print 1

        // Step 4: Create operation - Insert a new record
        String sqlInsert = "INSERT INTO student (student_id, first_name, last_name, age, marks) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement insert = con.prepareStatement(sqlInsert); // Prepare the INSERT statement
        insert.setInt(1, 5); // Set student_id
        insert.setString(2, "NewStudent"); // Set first_name
        insert.setString(3, "LastName"); // Set last_name
        insert.setInt(4, 21); // Set age
        insert.setInt(5, 88); // Set marks
        int rowsInserted = insert.executeUpdate(); // Execute the insert query
        System.out.println("Rows inserted: " + rowsInserted); // will print 1

        // Step 5: Delete operation - Delete a record
        String sqlDelete = "DELETE FROM student WHERE student_id = ?";
        PreparedStatement delete = con.prepareStatement(sqlDelete); // Prepare the DELETE statement
        delete.setInt(1, 5); // Replace ? with student_id=5
        int rowsDeleted = delete.executeUpdate(); // Execute the delete query
        System.out.println("Rows deleted: " + rowsDeleted); // will print 1

        // Close connection
        con.close(); // Always close the connection to release resources
        System.out.println("Connection Closed");
    }
}
