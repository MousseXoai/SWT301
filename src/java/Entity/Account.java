/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Tosaka
 */
public class Account extends DBContext {

    String AccountID;
    String Username;
    String Pass;
    String IsAdmin;

    public Account() {
        connectDB();
    }

    public Account(String Username, String Pass) {
        this.Username = Username;
        this.Pass = Pass;
        connectDB();
    }

    public Account(String AccountID, String Username, String Pass, String IsAdmin) {
        this.AccountID = AccountID;
        this.Username = Username;
        this.Pass = Pass;
        this.IsAdmin = IsAdmin;
        connectDB();
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(String IsAdmin) {
        this.IsAdmin = IsAdmin;
    }
    Connection cnn;
    PreparedStatement stm;
    ResultSet rs;

    private void connectDB() {
        cnn = connection;
        if (cnn != null) {
            System.out.println("Connect success");
        } else {
            System.out.println("Connect fail");
        }
    }

}
