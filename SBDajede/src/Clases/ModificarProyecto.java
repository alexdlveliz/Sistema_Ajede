package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hectortllo
 */
public class ModificarProyecto
{
    private Connection con = null;
    private Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;
    
    //Se hace la conexión a la base de datos
    public ModificarProyecto()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    public void tomarValoresTabla()
    {
        //Acá voy a tomar los valores que estén en la tabla. Como se va a seleccionar una fila, esos valores voy a tomar
        //Todavía no lo he hecho :v
        
    }
        
    //Este método iría dentro del botón "guardarCambios" iría en el panel de "editar proyecto" pero como todavía no está, lo dejé aquí
    public void modificarProyecto(int id, String nombre, String descripcion, boolean finalizado)
    {
        try {
            
            ps = con.prepareStatement("UPDATE proyecto SET nombreProyecto=?, "
                    + "descripcion=?, finalizado=? WHERE id=?");
            //Acá voy a jalar los datos que estén en los txtbox
            //nombre = txtNombre.getText();
            //descripcion = txtdescripcion.getText();
            //finalizado = cmbFinalizado.getSelectedItem();
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setBoolean(3, finalizado);
            ps.setInt(4, id);
            
            int res = ps.executeUpdate();
            if(res>0)
                JOptionPane.showMessageDialog(null, "Proyecto modificado");
            else
                JOptionPane.showMessageDialog(null, "Error al modificar proyecto");
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}