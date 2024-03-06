package dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import geometry.Point;

public class DialogPoint extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtXCoordinate;
	private JTextField txtYCoordinate;
	private JLabel lblPoint;
	private JLabel lblXCoordinate;
	private JLabel lblYCoordinate;
	private JLabel lblColor;
	private JButton btnColor;
	private JButton btnAccept;
	private JButton btnDecline;

	private Point dlgPoint;
	private boolean accept;

	private int x;
	private int y;

	private Color color;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogPoint dialog = new DialogPoint();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogPoint() {
		setTitle("Nemanja Tepic IT44-2015");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 347, 267);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblPoint = new JLabel("Point");
			lblPoint.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		{
			lblXCoordinate = new JLabel("X coordinate :");
			lblXCoordinate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		{
			txtYCoordinate = new JTextField();
			txtYCoordinate.setColumns(10);
		}
		{
			lblYCoordinate = new JLabel("Y coordinate :");
			lblYCoordinate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		{
			txtXCoordinate = new JTextField();
			txtXCoordinate.setColumns(10);
		}
		{
			lblColor = new JLabel("Color: ");
			lblColor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		{
			btnColor = new JButton("");
			btnColor.setPreferredSize(new Dimension(33, 6));

		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblPoint, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblXCoordinate)
								.addGap(18)
								.addComponent(txtYCoordinate, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblYCoordinate)
								.addComponent(lblColor, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnColor, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
								.addComponent(txtXCoordinate))))
					.addGap(99))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lblPoint)
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtYCoordinate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblXCoordinate))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYCoordinate)
						.addComponent(txtXCoordinate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblColor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(62))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnColor, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
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
						.addContainerGap(167, Short.MAX_VALUE)
						.addComponent(btnAccept)
						.addGap(18)
						.addComponent(btnDecline)
						.addContainerGap())
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(7)
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnDecline)
							.addComponent(btnAccept))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			buttonPane.setLayout(gl_buttonPane);
			btnColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					color = JColorChooser.showDialog(null, "Choose color", color);
					if (color != null) {
						btnColor.setBackground(color);
					}
				}
			});
			btnAccept.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						dlgPoint = new Point();
						dlgPoint.setX(Integer.parseInt(getTxtXCoordinate().getText()));
						dlgPoint.setY(Integer.parseInt(getTxtYCoordinate().getText()));
						dlgPoint.setBorderColor(btnColor.getBackground());
						setAccept(true);
						setVisible(false);
					} catch (Exception g) {
						JOptionPane.showMessageDialog(null, "You didn't input the number","Warning",JOptionPane.WARNING_MESSAGE);
						;
					}
				}
			});
			btnDecline.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dlgPoint = null;
					setAccept(false);
					setVisible(false);
				}
			});
		}
	}

	public JTextField getTxtXCoordinate() {
		return txtXCoordinate;
	}

	public void setTxtXCoordinate(JTextField txtXCoordinate) {
		this.txtXCoordinate = txtXCoordinate;
	}

	public JTextField getTxtYCoordinate() {
		return txtYCoordinate;
	}

	public void setTxtYCoordinate(JTextField txtYCoordinate) {
		this.txtYCoordinate = txtYCoordinate;
	}

	public JLabel getLblPoint() {
		return lblPoint;
	}

	public void setLblPoint(JLabel lblPoint) {
		this.lblPoint = lblPoint;
	}

	public JLabel getLblXCoordinate() {
		return lblXCoordinate;
	}

	public void setLblXCoordinate(JLabel lblXCoordinate) {
		this.lblXCoordinate = lblXCoordinate;
	}

	public JLabel getLblYCoordinate() {
		return lblYCoordinate;
	}

	public void setLblYCoordinate(JLabel lblYCoordinate) {
		this.lblYCoordinate = lblYCoordinate;
	}

	public JLabel getLblColor() {
		return lblColor;
	}

	public void setLblColor(JLabel lblColor) {
		this.lblColor = lblColor;
	}

	public JButton getBtnColor() {
		return btnColor;
	}

	public void setBtnColor(JButton btnColor) {
		this.btnColor = btnColor;
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

	public Point getDlgPoint() {
		return dlgPoint;
	}

	public void setDlgPoint(Point dlgPoint) {
		this.dlgPoint = dlgPoint;
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

}
