/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Project;
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
public class ProjectController {
    public void save(Project project) {
        String sql = "INSERT INTO project (name, "
          + "description, "
          + "createdAt, "
          + "updatedAt) VALUES (?, ?, ?, ?)";

        Connection con = null;

        PreparedStatement statement = null;

        try {

            con = ConnectionFactory.getConnection();

            statement = con.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));

            statement.execute();

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao criar projeto: " + ex.getMessage(), ex);

        } finally {

            ConnectionFactory.closeConnection(con, statement);

        }
    }

    public void update(Project project) {
        String sql = "UPDATE project SET name = ?, "
                + "description = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";

        Connection con = null;

        PreparedStatement statement = null;

        try {

            con = ConnectionFactory.getConnection();

            statement = con.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

            statement.execute();

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao atualizar o projeto: " + ex.getMessage(), ex);

        } finally {

            ConnectionFactory.closeConnection(con, statement);

        }
    }

    public void removeById(int projectId) {
      String sql = "DELETE FROM project WHERE id = ?";

      Connection con = null;

      PreparedStatement statement = null;

      try {

          con = ConnectionFactory.getConnection();

          statement = con.prepareStatement(sql);

          statement.setInt(1, projectId);

          statement.execute();

      } catch (SQLException ex) {

          throw new RuntimeException("Erro ao deletar a tarefa!" + ex.getMessage(), ex);

      } finally {

          ConnectionFactory.closeConnection(con, statement);

      }
    }

    public List<Project> getAll() {
        String sql = "SELECT * FROM project";

        Connection con = null;

        PreparedStatement statement = null;

        ResultSet result = null;

        List<Project> projects = new ArrayList<Project>();

        try {

            con = ConnectionFactory.getConnection();

            statement = con.prepareStatement(sql);

            result = statement.executeQuery();

            while (result.next()) {
                Project project = new Project();

                project.setId(result.getInt("id"));
                project.setName(result.getString("name"));
                project.setDescription(result.getString("description"));
                project.setCreatedAt(result.getDate("createdAt"));
                project.setUpdatedAt(result.getDate("updatedAt"));

                projects.add(project);
            }

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao listar todas as tarefas!" + ex.getMessage(), ex);

        } finally {

            ConnectionFactory.closeConnection(con, statement, result);

        }

        return projects;
    }
}
