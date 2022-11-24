package CashRegisters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Connect {

    public Connection conn;
    public Statement stmt;
    public ResultSet rs;

    public Connect() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Emsi.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectDistinct(String columnName, String tableName) {

        String sql = "SELECT DISTINCT " + columnName + " FROM " + tableName;
        ArrayList<String> data = new ArrayList<>();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                data.add(rs.getString(columnName));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }

    public ArrayList<String> select(String[] columns, String tableName) {
        ArrayList<String> data = new ArrayList<>();

        String columnsString = String.join(", ", columns);
        String sql = "SELECT " + columnsString + " FROM " + tableName;

        System.out.println(sql);

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String row = "";

                for (String column : columns) {
                    row += rs.getString(column) + "---";
                }

                data.add(row);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return data;
    }

    public ArrayList<String> selectWhere(String[] columnsArray, String tableName, String whereColumn, String whereValue) {
        ArrayList data = new ArrayList<String>();

        String columns = String.join(", ", columnsArray);
        String sql = "SELECT " + columns + " FROM " + tableName + " WHERE " + whereColumn + " LIKE '%" + whereValue + "%'";

        try {
            System.out.println(sql);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String row = "";

                for (int i = 0; i < columnsArray.length; i++) {
                    row = row + rs.getString(columnsArray[i]) + "---";
                }

                row = row.substring(0, row.length() - 3);
                data.add(row);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }

    public void insert(String[] columnsArray, String tableName, String[] values) {
        String columnsString = String.join("', '", columnsArray);
        String valuesString = String.join("', '", values);

        String sql = "INSERT INTO " + tableName + "('" + columnsString + "') VALUES('" + valuesString + "')";
        System.out.println(sql);

        try {
            stmt = conn.createStatement();
            stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String[] columnsArray, String tableName, String[] valuesArray, String whereColumn, String whereValue) {
        String sql = "UPDATE " + tableName + " SET ";

        for (int i = 0; i < columnsArray.length; i++) {
            sql += columnsArray[i] + " = " + (valuesArray[i].equals("") ? null : "'" + valuesArray[i] + "'") + ", ";
        }

        sql = sql.substring(0, sql.length() - 2);
        sql += " WHERE " + whereColumn + " = " + whereValue;

        System.out.println(sql);

        try {
            stmt = conn.createStatement();
            stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(String column, int id, String tableName) {
        String sql = "DELETE FROM " + tableName + " WHERE " + column + " = " + id;

        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
