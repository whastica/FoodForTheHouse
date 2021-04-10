/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unicauca.foodforthehouse.server.access;

import co.unicauca.foodforthehouse.commons.domain.Cliente;
import co.unicauca.foodforthehouse.commons.infra.Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClienteRepositoryImpMysql implements IClienteRepository{
    private Connection conn;

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return Lista de usuarios
     */
    @Override
    public List<Cliente> listarClientes() {

        List<Cliente> users = new ArrayList<>();
        try {

            String sql = "SELECT id_user, first_name, last_name, address, mobile, email, rol, pws FROM user";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Cliente newUser = new Cliente();
//                newUser.setId(Integer.toString(rs.getInt("id_user")));
//                newUser.setFirstName(rs.getString("first_name"));
//                newUser.setLastName(rs.getString("last_name"));
//                newUser.setAddress(rs.getString("address"));
//                newUser.setMobile(rs.getString("mobile"));
//                newUser.setEmail(rs.getString("email"));
//                newUser.setRol(rs.getString("rol"));
//                newUser.setPws(rs.getString("pws"));

                users.add(newUser);
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    /**
     * Busca un usuario de la base de datos
     *
     * @param id Identificador del usuario
     * @return Objeto de tipo usuario
     */
    @Override
    public Cliente encontrarCliente(int id) {
        Cliente user = null;
        try {

            String sql = "SELECT id_user, first_name, last_name, address, mobile, email, rol, pws FROM user where id_user=" + id;
            this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                user = new Cliente();
//                user.setIdCliente(Integer.toString(rs.getInt("id_user")));
//                user.setNombre(rs.getString("first_name"));
//                user.setCarrera(Integer.toString(rs.getInt("id_user")));
//                user.setAddress(rs.getString("address"));
//                user.setMobile(rs.getString("mobile"));
//                user.setEmail(rs.getString("email"));
//                user.setRol(rs.getString("rol"));
//                user.setPws(rs.getString("pws"));
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, "Error al buscar el usuario en la base de datos", ex);
        }
        return user;
    }

    /**
     * Busca un usuario de la base de datos
     *
     * @param email email del usuario
     * @return Objeto de tipo usuario
     */
    @Override
    public void encontrarPorEmail(String email) {
        Cliente user = null;
        try {

            String sql = "SELECT id_user, first_name, last_name, address, mobile, email, rol, pws FROM user where email= '" + email + "'";
            this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                user = new Cliente();
//                user.setId(Integer.toString(rs.getInt("id_user")));
//                user.setFirstName(rs.getString("first_name"));
//                user.setLastName(rs.getString("last_name"));
//                user.setAddress(rs.getString("address"));
//                user.setMobile(rs.getString("mobile"));
//                user.setEmail(rs.getString("email"));
//                user.setRol(rs.getString("rol"));
//                user.setPws(rs.getString("pws"));
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, "Error al buscar el usuario en la base de datos", ex);
        }
    }

    /**
     * Crea un usuario y lo guarda en la base de datos
     *
     * @param newUser Objeto de tipo User a guardar
     * @return True si puedo crear, false de lo contrario
     */
    @Override
    public void crear(Cliente nuevoCliente) {
        String sql = "";
        try {
            this.connect();

            sql = "INSERT INTO user (first_name, last_name, address, mobile, email, rol, pws ) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1,nuevoCliente.getFirstName());
//            pstmt.setString(2, nuevoCliente.getLastName());
//            pstmt.setString(3,nuevoCliente.getAddress());
//            pstmt.setString(4, nuevoCliente.getMobile());
//            pstmt.setString(5, nuevoCliente.getEmail());
//            pstmt.setString(6, nuevoCliente.getRol());
//            pstmt.setString(7, nuevoCliente.getPws());
            pstmt.executeUpdate();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, "Error en el insert into: " + sql, ex);
        }
    }

    /**
     * Actualiza un usuario en la base de datos
     *
     * @param newUser Objeto de tipo User a actualizar
     * @return True si pudo actualizar, false de lo contrario
     */
    @Override
    public boolean actualizar(Cliente nuevoCliente) {
        try {
            this.connect();

            String sql = "UPDATE user "
                    + "SET first_name = ?, "
                    + "last_name = ?, "
                    + "address = ?, "
                    + "mobile = ?, "
                    + "email = ?, "
                    + "rol = ?, "
                    + "pws = ? "
                    + "WHERE id_user = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nuevoCliente.getFirstName());
            pstmt.setString(2, nuevoCliente.getLastName());
            pstmt.setString(3, nuevoCliente.getAddress());
            pstmt.setString(4, nuevoCliente.getMobile());
            pstmt.setString(5, nuevoCliente.getEmail());
            pstmt.setString(6, nuevoCliente.getRol());
            pstmt.setString(7, nuevoCliente.getPws());
            pstmt.setInt(8, Integer.parseInt(nuevoCliente.getId()));
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, "Error al actualizar el usuario", ex);
        }
        return false;
    }

    /**
     * Elimina un usuario de la base de datos
     *
     * @param email Email del usuario a eliminar
     * @return True si pudo eliminar, false de lo contrario
     */
    @Override
    public boolean borrar(String email) {
        try {
            this.connect();

            String sql = "DELETE FROM user "
                    + "WHERE email = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, "Error al eliminar el usuario", ex);
        }
        return false;
    }

    /**
     * Conecta a la bd
     */
    public void connect() {
        try {
            //Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            Utilities ut = new Utilities();
            conn = DriverManager.getConnection(ut.getUrl(), ut.getUsername(), ut.getPwd());
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Desconecta de la base de datos
     */
    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteRepositoryImpMysql.class.getName()).log(Level.SEVERE, "Error al cerrar conexión de la base de datos", ex);
        }
    }
}
