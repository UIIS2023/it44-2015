package dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import geometry.*;


public class DialogLine extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblStartX;
	private JLabel lblLine;
	private JTextField txtXCoordinateStartPoint;
	private JTextField txtYCoordinateStartPoint;
	private JTextField txtXCoordinateEndPoint;
	private JTextField txtYCoordinateEndPoint;
	private JButton btnAccept;
	private JButton btnDecline;
	private boolean accept = false;

	private Color colorDlg;

	private Line dlgLine;
	private JButton btnColorDlg;
	private Point pStart;
	private Point pEnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogLine dialog = new DialogLine();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogLine() {
		setTitle("Nemanja Tepic IT44-2015");
		getContentPane().setBackground(new Color(255, 255, 102));
		setModal(true);
		setMinimumSize(new Dimension(430, 340));
		setBounds(100, 100, 456, 380);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		{
			lblStartX = new JLabel("X coordinate:");
		}
		{
			lblLine = new JLabel("Line");
			lblLine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		setResizable(false);
		JLabel lblYkoordinata = new JLabel("Y coordinate:");

		JLabel lblXcoordinateEndPoint = new JLabel("X coordinate:");

		JLabel lblYcoordinateEndPoint = new JLabel("Y coordinate:");

		JLabel lblEdgeColor = new JLabel("Color:");
		lblEdgeColor.setFont(new Font("Tahoma", Font.PLAIN, 14));

		txtXCoordinateStartPoint = new JTextField();
		txtXCoordinateStartPoint.setColumns(10);

		txtYCoordinateStartPoint = new JTextField();
		txtYCoordinateStartPoint.setColumns(10);

		txtXCoordinateEndPoint = new JTextField();
		txtXCoordinateEndPoint.setColumns(10);

		txtYCoordinateEndPoint = new JTextField();
		txtYCoordinateEndPoint.setColumns(10);

		btnColorDlg = new JButton("");

		JLabel lblStartPoint = new JLabel("Start point");
		lblStartPoint.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));

		JLabel lblEndPoint = new JLabel("End point");
		lblEndPoint.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblStartX)
										.addComponent(lblYkoordinata))
									.addPreferredGap(ComponentPlacement.UNRELATED))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblEdgeColor, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(txtYCoordinateStartPoint, 0, 0, Short.MAX_VALUE)
									.addComponent(txtXCoordinateStartPoint, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
								.addComponent(btnColorDlg, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(42)
							.addComponent(lblStartPoint, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblXcoordinateEndPoint)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtXCoordinateEndPoint, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblYcoordinateEndPoint)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtYCoordinateEndPoint, 0, 0, Short.MAX_VALUE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(lblEndPoint, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addGap(67))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(187)
					.addComponent(lblLine)
					.addContainerGap(231, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(14)
					.addComponent(lblLine)
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStartPoint)
						.addComponent(lblEndPoint))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStartX, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblXcoordinateEndPoint)
						.addComponent(txtXCoordinateStartPoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtXCoordinateEndPoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYkoordinata)
						.addComponent(txtYCoordinateStartPoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYcoordinateEndPoint)
						.addComponent(txtYCoordinateEndPoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(39)
							.addComponent(btnColorDlg, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEdgeColor)
							.addGap(22))))
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
						.addContainerGap(276, Short.MAX_VALUE)
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
			btnColorDlg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					colorDlg = JColorChooser.showDialog(null, "Choose color", colorDlg);
					if (colorDlg != null) {
						btnColorDlg.setBackground(colorDlg);
					}
				}
			});
			buttonPane.setLayout(gl_buttonPane);
			btnAccept.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						dlgLine = new Line();
						pStart = new Point(Integer.parseInt(getTxtXCoordinateStartPoint().getText()),
								Integer.parseInt(getTxtYCoordinateStartPoint().getText()));
						pEnd = new Point(Integer.parseInt(getTxtXCoordinateEndPoint().getText()),
								Integer.parseInt(getTxtYCoordinateEndPoint().getText()));
						dlgLine.setpStart(pStart);
						dlgLine.setpEnd(pEnd);
						dlgLine.setBorderColor(btnColorDlg.getBackground());
						setAccept(true);
						setVisible(false);
					} catch (Exception g) {
						JOptionPane.showMessageDialog(null, "You didn't input the number","Warning",JOptionPane.WARNING_MESSAGE);
					}

				}
			});
			btnDecline.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dlgLine = null;
					setAccept(false);
					setVisible(false);
				}
			});
		}
	}

	public JLabel getLblStartX() {
		return lblStartX;
	}

	public void setLblStartX(JLabel lblStartX) {
		this.lblStartX = lblStartX;
	}

	public JLabel getLblLine() {
		return lblLine;
	}

	public void setLblLine(JLabel lblLine) {
		this.lblLine = lblLine;
	}

	public JTextField getTxtXCoordinateStartPoint() {
		return txtXCoordinateStartPoint;
	}

	public void setTxtXCoordinateStartPoint(JTextField txtXCoordinateStartPoint) {
		this.txtXCoordinateStartPoint = txtXCoordinateStartPoint;
	}

	public JTextField getTxtYCoordinateStartPoint() {
		return txtYCoordinateStartPoint;
	}

	public void setTxtYCoordinateStartPoint(JTextField txtYCoordinateStartPoint) {
		this.txtYCoordinateStartPoint = txtYCoordinateStartPoint;
	}

	public JTextField getTxtXCoordinateEndPoint() {
		return txtXCoordinateEndPoint;
	}

	public void setTxtXCoordinateEndPoint(JTextField txtXCoordinateEndPoint) {
		this.txtXCoordinateEndPoint = txtXCoordinateEndPoint;
	}

	public JTextField getTxtYCoordinateEndPoint() {
		return txtYCoordinateEndPoint;
	}

	public void setTxtYCoordinateEndPoint(JTextField txtYCoordinateEndPoint) {
		this.txtYCoordinateEndPoint = txtYCoordinateEndPoint;
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

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public Color getColorDlg() {
		return colorDlg;
	}

	public void setColorDlg(Color colorDlg) {
		this.colorDlg = colorDlg;
	}

	public Line getDlgLine() {
		return dlgLine;
	}

	public void setDlgLine(Line dlgLine) {
		this.dlgLine = dlgLine;
	}

	public JButton getBtnColorDlg() {
		return btnColorDlg;
	}

	public void setBtnColorDlg(JButton btnColorDlg) {
		this.btnColorDlg = btnColorDlg;
	}

	public Point getpStart() {
		return pStart;
	}

	public void setpStart(Point pStart) {
		this.pStart = pStart;
	}

	public Point getpEnd() {
		return pEnd;
	}

	public void setpEnd(Point pEnd) {
		this.pEnd = pEnd;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

}
