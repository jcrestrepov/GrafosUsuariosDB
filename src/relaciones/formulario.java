package relaciones;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;

public class formulario {

	private JFrame frame;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JTextField caja4;
	private JTextField caja5;
	private JTextField caja6;
	private JTextField textField_6;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario window = new formulario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 814, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 780, 489);
		frame.getContentPane().add(tabbedPane);
		
		JPanel caja7 = new JPanel();
		tabbedPane.addTab("ingreso de datos ", null, caja7, null);
		caja7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(82, 120, 45, 13);
		caja7.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("apellido");
		lblNewLabel_1.setBounds(82, 167, 45, 13);
		caja7.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("edad");
		lblNewLabel_2.setBounds(82, 220, 45, 13);
		caja7.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("telefono ");
		lblNewLabel_3.setBounds(82, 273, 78, 13);
		caja7.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("municipio");
		lblNewLabel_4.setBounds(82, 322, 78, 13);
		caja7.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("persona_id");
		lblNewLabel_5.setBounds(81, 75, 79, 13);
		caja7.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("relacionado con:");
		lblNewLabel_6.setBounds(82, 374, 125, 13);
		caja7.add(lblNewLabel_6);
		
		caja1 = new JTextField();
		caja1.setBounds(211, 72, 96, 19);
		caja7.add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setBounds(211, 117, 96, 19);
		caja7.add(caja2);
		caja2.setColumns(10);
		
		caja3 = new JTextField();
		caja3.setBounds(211, 164, 96, 19);
		caja7.add(caja3);
		caja3.setColumns(10);
		
		caja4 = new JTextField();
		caja4.setBounds(211, 217, 96, 19);
		caja7.add(caja4);
		caja4.setColumns(10);
		
		caja5 = new JTextField();
		caja5.setBounds(211, 270, 96, 19);
		caja7.add(caja5);
		caja5.setColumns(10);
		
		caja6 = new JTextField();
		caja6.setBounds(211, 319, 96, 19);
		caja7.add(caja6);
		caja6.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(211, 371, 96, 19);
		caja7.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/relaciones","root","");
				   
				    
					String persona_id=caja1.getText();
					String nombre=caja2.getText();
					String apellido=caja3.getText();
					String edad=caja4.getText();
					String telefono=caja5.getText();
					String municipio=caja6.getText();
					String relacionadocon=textField_6.getText();
					
					String query= "INSERT INTO personas(persona_id,nombre,apellido,edad,telefono,municipio,relacionadocon) values('"+persona_id+"','"+nombre+"','"+apellido+"','"+edad+"','"+telefono+"','"+municipio+"','"+relacionadocon+"')";
					PreparedStatement stmt = conexion.prepareStatement("INSERT INTO personas VALUES (?,?,?,?,?)");
							
					stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Informacion Agregada");
				    
				}catch(Exception e1) {
					
				}	
			}
		});
		btnNewButton.setBounds(501, 112, 85, 21);
		caja7.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/relaciones","root","");
				   
				    
					  
					String persona_id=caja1.getText();
					String nombre=caja2.getText();
					String apellido=caja3.getText();
					String edad=caja4.getText();
					String telefono=caja5.getText();
					String municipio=caja6.getText();
					String relacionadocon=textField_6.getText();
					
                    String query= "update personas set nombre='"+nombre+"',apellido='"+apellido+"',edad='"+edad+"',telefono='"+telefono+"',municipio='"+municipio+"',relacionadocon='"+relacionadocon+"' WHERE(persona_id='"+persona_id+"')"; //ejecute el query donde la variable cedula se encuentre/
					PreparedStatement stmt = conexion.prepareStatement("update personas");	//						
					stmt.executeUpdate(query);
					conexion.close();
					JOptionPane.showMessageDialog(null,"Usuario Modificado");
				    
				}catch(Exception e1) {
					
				}	
			}
		});
		btnNewButton_1.setBounds(501, 178, 113, 21);
		caja7.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("eliminar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/relaciones","root","");
				   
				    
					String persona_id=caja1.getText();
					
                    String query= "DELETE FROM personas WHERE(persona_id='"+persona_id+"')"; //ejecute el query donde la variable cedula se encuentre/
					PreparedStatement stmt = conexion.prepareStatement("DELETE *FROM personas");	//						
					stmt.executeUpdate(query);
					conexion.close();
					JOptionPane.showMessageDialog(null,"Usuario Eliminado");
				    
				}catch(Exception e1) {
					
				}	
			}
		});
		btnNewButton_3.setBounds(501, 249, 85, 21);
		caja7.add(btnNewButton_3);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("informacion", null, panel2, null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_2 = new JButton("cargar informacion");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/relaciones","root","");
				   
							 
					String query= "SELECT *FROM personas";
					PreparedStatement stmt = conexion.prepareStatement("SELECT *FROM personas");
							
					
					String[] dato=new String[7];
					ResultSet Result =stmt.executeQuery(query);
					DefaultTableModel model = new DefaultTableModel();
					model.addColumn("persona_id");
					model.addColumn("nombre");
					model.addColumn("apellido");
					model.addColumn("edad");
					model.addColumn("telefono");
					model.addColumn("municipio");
					model.addColumn("relacionadocon");
					
					table.setModel(model);
					
					while(Result.next()) {
						dato[0]=Result.getString(1);
						dato[1]=Result.getString(2);
						dato[2]=Result.getString(3);
						dato[3]=Result.getString(4);
						dato[4]=Result.getString(5);
						dato[5]=Result.getString(6);
						dato[6]=Result.getString(7);
						
						model.addRow(dato);
					}
					conexion.close();
					JOptionPane.showMessageDialog(null,"Cargados exitosamente");
				    
				}catch(Exception e1) {
					
				}		
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("buscar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/relaciones","root","");
				   
					String persona_id=textField.getText();
					
					String query= "SELECT *FROM personas WHERE(persona_id='"+persona_id+"')";
					PreparedStatement stmt = conexion.prepareStatement("SELECT *FROM personas");
							
					String[] dato=new String[7];
					ResultSet Result =stmt.executeQuery(query);
					DefaultTableModel model = new DefaultTableModel();
					model.addColumn("persona_id");
					model.addColumn("nombre");
					model.addColumn("apellido");
					model.addColumn("edad");
					model.addColumn("telefono");
					model.addColumn("municipio");
					model.addColumn("relacionadocon");
					
					table.setModel(model);
					
					while(Result.next()) {
						dato[0]=Result.getString(1);
						dato[1]=Result.getString(2);
						dato[2]=Result.getString(3);
						dato[3]=Result.getString(4);
						dato[4]=Result.getString(5);
						dato[5]=Result.getString(6);
						dato[6]=Result.getString(7);
						
						
						model.addRow(dato);
					
					}
					conexion.close();
					JOptionPane.showMessageDialog(null,"Busqueda completada");
				    
				}catch(Exception e1) {
					
				}	
			}
		});
		GroupLayout gl_panel2 = new GroupLayout(panel2);
		gl_panel2.setHorizontalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2.createSequentialGroup()
					.addGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel2.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 764, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel2.createSequentialGroup()
							.addGap(41)
							.addComponent(btnNewButton_2)
							.addGap(143)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(btnNewButton_4)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel2.setVerticalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		panel2.setLayout(gl_panel2);
	}
}
