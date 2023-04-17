/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Task;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */

public class TaskController {
    public void save(Task task) {
        String sql = "INSERT INTO task (idProject, "
                + "name, "
                + "description, "
                + "notes, "
                + "status, "
                + "deadline, "
                + "createdAt, "
                + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection con = null;

        PreparedStatement statement = null;

        try {

            con = ConnectionFactory.getConnection();

            statement = con.prepareStatement(sql);

            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isStatus());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));

            statement.execute();

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao salvar a tarefa: " + ex.getMessage(), ex);

        } finally {

            ConnectionFactory.closeConnection(con, statement);

        }
    }

    public void update(Task task) {
        String sql = "UPDATE task SET idProject = ?, "
                + "name = ?, "
                + "description = ?, "
                + "notes = ?, "
                + "status = ?, "
                + "deadline = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";

        Connection con = null;

        PreparedStatement statement = null;

        try {

            con = ConnectionFactory.getConnection();

            statement = con.prepareStatement(sql);

            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isStatus());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());

            statement.execute();

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao atualizar a tarefa: " + ex.getMessage(), ex);

        } finally {

            ConnectionFactory.closeConnection(con, statement);

        }
    }

    public void removeById(int taskId) {
        String sql = "DELETE FROM task WHERE id = ?";

        Connection con = null;

        PreparedStatement statement = null;

        try {

            con = ConnectionFactory.getConnection();

            statement = con.prepareStatement(sql);

            statement.setInt(1, taskId);

            statement.execute();

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao deletar a tarefa!" + ex.getMessage(), ex);

        } finally {

            ConnectionFactory.closeConnection(con, statement);

        }
    }

    public List<Task> getAll(int projectId) {
        String sql = "SELECT * FROM task WHERE idProject = ?";

        Connection con = null;

        PreparedStatement statement = null;

        ResultSet result = null;

        List<Task> tasks = new ArrayList<Task>();

        try {

            con = ConnectionFactory.getConnection();

            statement = con.prepareStatement(sql);

            statement.setInt(1, projectId);

            result = statement.executeQuery();

            while (result.next()) {
                Task task = new Task();

                task.setId(result.getInt("id"));
                task.setIdProject(result.getInt("idProject"));
                task.setName(result.getString("name"));
                task.setDescription(result.getString("description"));
                task.setNotes(result.getString("notes"));
                task.setStatus(result.getBoolean("status"));
                task.setDeadline(result.getDate("deadline"));
                task.setCreatedAt(result.getDate("createdAt"));
                task.setUpdatedAt(result.getDate("updatedAt"));

                tasks.add(task);
            }

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao listar todas as tarefas!" + ex.getMessage(), ex);

        } finally {

            ConnectionFactory.closeConnection(con, statement, result);

        }

        return tasks;
    }
}
