package dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mvc.Frame;
import geometry.Circle;
import geometry.Point;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TrayIcon.MessageType;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogCircle extends JDialog {

	private Frame frame;
	private final JPanel contentPanel = new JPanel();
	private JButton btnAccept;
	private JButton btnDecline;
	private JTextField txtXCenter;
	private JTextField txtYCenter;

	private Color borderColorDialog;
	private Color areaColorDialog;
	private JButton btnInsideColor;
	private JButton btnEdgeColor;
	private Circle circle;
	private boolean accept;
	private JTextField txtRadius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogCircle dialog = new DialogCircle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogCircle() {
		setModal(true);
		setTitle("Nemanja Tepic IT44-2015");
		setBounds(100, 100, 450, 352);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JLabel lblCircle = new JLabel("Circle");
		lblCircle.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblXCoordinate = new JLabel("X coordinate:");
		lblXCoordinate.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblYCoordinate = new JLabel("Y coordinate:");
		lblYCoordinate.setFont(new Font("Tahoma", Font.PLAIN, 13));

		txtXCenter = new JTextField();
		txtXCenter.setColumns(10);

		txtYCenter = new JTextField();
		txtYCenter.setColumns(10);

		JLabel lblEdgeColor = new JLabel("Edge color:");
		lblEdgeColor.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnEdgeColor = new JButton("");

		JLabel lblInsideColor = new JLabel("Inside color:");
		lblInsideColor.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnInsideColor = new JButton("");

		txtRadius = new JTextField();
		txtRadius.setColumns(10);

		JLabel lblRadius = new JLabel("Radius:");
		lblRadius.setFont(new Font("Tahoma", Font.PLAIN, 13));

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(lblCircle)
							.addGap(186))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(84)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRadius)
								.addComponent(lblXCoordinate)
								.addComponent(lblYCoordinate)
								.addComponent(lblEdgeColor)
								.addComponent(lblInsideColor))
							.addGap(44)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnEdgeColor, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
								.addComponent(txtXCenter, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
								.addComponent(txtRadius, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
								.addComponent(txtYCenter, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
								.addComponent(btnInsideColor, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
							.addGap(122))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblCircle)
					.addGap(31)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtXCenter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblXCoordinate))
					.addGap(9)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtYCenter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYCoordinate))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtRadius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRadius))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEdgeColor)
						.addComponent(btnEdgeColor, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnInsideColor, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblInsideColor))
					.addGap(31))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 102));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnAccept = new JButton("Accept");

				btnAccept.setActionCommand("OK");
				getRootPane().setDefaultButton(btnAccept);
			}
			{
				btnDecline = new JButton("Decline");

				btnDecline.setActionCommand("Cancel");
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_buttonPane.createSequentialGroup()
						.addContainerGap(258, Short.MAX_VALUE)
						.addComponent(btnAccept)
						.addGap(18)
						.addComponent(btnDecline)
						.addContainerGap())
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnDecline)
							.addComponent(btnAccept))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			buttonPane.setLayout(gl_buttonPane);
			btnEdgeColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					borderColorDialog = JColorChooser.showDialog(null, "Edge color",borderColorDialog);
					if(borderColorDialog!=null) {
						btnEdgeColor.setBackground(borderColorDialog);
					}
				}
			});
			btnInsideColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					areaColorDialog = JColorChooser.showDialog(null, "Inside color", areaColorDialog);
					if(areaColorDialog!=null) {
						btnInsideColor.setBackground(areaColorDialog);
					}
				}
			});
			btnAccept.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					circle = new Circle();
					Point center = new Point(
							Integer.parseInt(getTxtXCenter().getText()),
							Integer.parseInt(getTxtYCenter().getText()));
					circle.setCenter(center);
					circle.setR(Integer.parseInt(getTxtRadius().getText()));
					circle.setBorderColor(getBtnEdgeColor().getBackground());
					circle.setAreaColor(getBtnInsideColor().getBackground());
					setVisible(false);
					setAccept(true);
					}catch(Exception exc) {
						JOptionPane.showMessageDialog(null, "You didn't input the number","Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
			});
			btnDecline.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					circle = null;
					setAccept(false);
				}
			});
		}
	}

	public JButton getBtnAccept() {
		return btnAccept;
	}

	public void setBtnAccept(JButton btnAccept) {
		this.btnAccept = btnAccept;
	}

	public JButton getBtnDecline() {
		return btnDecline;
	}

	public void setBtnDecline(JButton btnDecline) {
		this.btnDecline = btnDecline;
	}

	public JTextField getTxtXCenter() {
		return txtXCenter;
	}

	public void setTxtXCenter(JTextField txtXCenter) {
		this.txtXCenter = txtXCenter;
	}

	public JTextField getTxtYCenter() {
		return txtYCenter;
	}

	public void setTxtYCenter(JTextField txtYCenter) {
		this.txtYCenter = txtYCenter;
	}

	public JButton getBtnInsideColor() {
		return btnInsideColor;
	}

	public void setBtnInsideColor(JButton btnInsideColor) {
		this.btnInsideColor = btnInsideColor;
	}

	public JButton getBtnEdgeColor() {
		return btnEdgeColor;
	}

	public void setBtnEdgeColor(JButton btnEdgeColor) {
		this.btnEdgeColor = btnEdgeColor;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public JTextField getTxtRadius() {
		return txtRadius;
	}

	public void setTxtRadius(JTextField txtRadius) {
		this.txtRadius = txtRadius;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public Color getBorderColorDialog() {
		return borderColorDialog;
	}

	public void setBorderColorDialog(Color borderColorDialog) {
		this.borderColorDialog = borderColorDialog;
	}

	public Color getAreaColorDialog() {
		return areaColorDialog;
	}

	public void setAreaColorDialog(Color areaColorDialog) {
		this.areaColorDialog = areaColorDialog;
	}
	
}
