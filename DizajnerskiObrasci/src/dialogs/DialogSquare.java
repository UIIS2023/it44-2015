package dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Point;
import geometry.Square;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

public class DialogSquare extends JDialog {

	private final JPanel pnlSquare = new JPanel();
	private JButton btnAccept;
	private JButton btnDecline;
	private JLabel lblSquare;
	private JLabel lblPoinUpLeft;
	private JLabel lblXCoordinate;
	private JLabel lblYCoordinate;
	private JButton btnEdgeColor;
	private JTextField txtSide;
	private JTextField txtXCoordinate;
	private JTextField txtYCoordinate;
	private JButton btnInsideColor;
	private Color edgeColorDlg;
	private Color insideColorDlg;

	private Square squareDialog;
	private boolean accept;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogSquare dialog = new DialogSquare();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogSquare() {
		setTitle("Nemanja Tepic IT44-2015");
		setModal(true);
		setBounds(100, 100, 404, 358);
		getContentPane().setLayout(new BorderLayout());
		pnlSquare.setBackground(new Color(255, 255, 102));
		pnlSquare.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		getContentPane().add(pnlSquare, BorderLayout.CENTER);
		{
			lblSquare = new JLabel("Square");
			lblSquare.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		lblPoinUpLeft = new JLabel("Point up left");
		lblPoinUpLeft.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblXCoordinate = new JLabel("X coordinate:");
		lblYCoordinate = new JLabel("Y coordinate:");

		txtXCoordinate = new JTextField();
		txtXCoordinate.setColumns(10);

		txtYCoordinate = new JTextField();
		txtYCoordinate.setColumns(10);

		JLabel lblSideLength = new JLabel("Side length:");
		lblSideLength.setFont(new Font("Tahoma", Font.PLAIN, 13));

		txtSide = new JTextField();
		txtSide.setColumns(10);

		JLabel lblEdgeColor = new JLabel("Edge color:");
		lblEdgeColor.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblInsideColor = new JLabel("Inside color:");
		lblInsideColor.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnEdgeColor = new JButton("");

		btnInsideColor = new JButton("");

		GroupLayout gl_pnlKvadrat = new GroupLayout(pnlSquare);
		gl_pnlKvadrat.setHorizontalGroup(
			gl_pnlKvadrat.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlKvadrat.createSequentialGroup()
					.addGap(77)
					.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_pnlKvadrat.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblXCoordinate)
							.addComponent(lblYCoordinate))
						.addComponent(lblSideLength, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_pnlKvadrat.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlKvadrat.createSequentialGroup()
									.addComponent(lblInsideColor, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(lblEdgeColor, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlKvadrat.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtSide, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(txtYCoordinate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(txtXCoordinate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
						.addGroup(gl_pnlKvadrat.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.LEADING)
								.addComponent(btnInsideColor, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(btnEdgeColor, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
					.addGap(117))
				.addGroup(Alignment.LEADING, gl_pnlKvadrat.createSequentialGroup()
					.addGap(131)
					.addComponent(lblPoinUpLeft, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_pnlKvadrat.createSequentialGroup()
					.addGap(148)
					.addComponent(lblSquare)
					.addContainerGap(178, Short.MAX_VALUE))
		);
		gl_pnlKvadrat.setVerticalGroup(
			gl_pnlKvadrat.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlKvadrat.createSequentialGroup()
					.addGap(5)
					.addComponent(lblSquare)
					.addGap(18)
					.addComponent(lblPoinUpLeft)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtXCoordinate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblXCoordinate))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtYCoordinate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYCoordinate))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSide, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSideLength))
					.addGap(24)
					.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEdgeColor)
						.addComponent(btnEdgeColor, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_pnlKvadrat.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblInsideColor)
						.addComponent(btnInsideColor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlSquare.setLayout(gl_pnlKvadrat);
		{
			JPanel pnlDugmici = new JPanel();
			pnlDugmici.setBackground(new Color(255, 255, 102));
			getContentPane().add(pnlDugmici, BorderLayout.SOUTH);
			{
				btnAccept = new JButton("Accept");

				btnAccept.setActionCommand("OK");
				getRootPane().setDefaultButton(btnAccept);
			}
			{
				btnDecline = new JButton("Decline");

				btnDecline.setActionCommand("Cancel");
			}
			GroupLayout gl_pnlDugmici = new GroupLayout(pnlDugmici);
			gl_pnlDugmici.setHorizontalGroup(
				gl_pnlDugmici.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_pnlDugmici.createSequentialGroup()
						.addContainerGap(224, Short.MAX_VALUE)
						.addComponent(btnAccept)
						.addGap(18)
						.addComponent(btnDecline)
						.addContainerGap())
			);
			gl_pnlDugmici.setVerticalGroup(
				gl_pnlDugmici.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_pnlDugmici.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_pnlDugmici.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnDecline)
							.addComponent(btnAccept))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			pnlDugmici.setLayout(gl_pnlDugmici);
			btnEdgeColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					edgeColorDlg = JColorChooser.showDialog(null, "Choose edge color", edgeColorDlg);
					if (edgeColorDlg != null) {
						btnEdgeColor.setBackground(edgeColorDlg);
					}
				}
			});
			btnInsideColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insideColorDlg = JColorChooser.showDialog(null, "Choose inside color",
							insideColorDlg);
					if (insideColorDlg != null) {
						btnInsideColor.setBackground(insideColorDlg);
					}
				}
			});
			btnAccept.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						squareDialog = new Square();
						Point upperLeft = new Point(Integer.parseInt(getTxtXCoordinate().getText()),
								Integer.parseInt(getTxtYCoordinate().getText()));
						squareDialog.setUpLeft(upperLeft);
						squareDialog.setPageLength(Integer.parseInt(getTxtSide().getText()));
						squareDialog.setBorderColor(btnEdgeColor.getBackground());
						squareDialog.setAreaColor(btnInsideColor.getBackground());
						setAccept(true);
						setVisible(false);

					} catch (Exception g) {
						JOptionPane.showMessageDialog(null, "You didn't input the number","Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
			});
			btnDecline.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					squareDialog = null;
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

	public JLabel getLblSquare() {
		return lblSquare;
	}

	public void setLblSquare(JLabel lblSquare) {
		this.lblSquare = lblSquare;
	}

	public JLabel getLblPoinUpLeft() {
		return lblPoinUpLeft;
	}

	public void setLblPoinUpLeft(JLabel lblPoinUpLeft) {
		this.lblPoinUpLeft = lblPoinUpLeft;
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

	public JButton getBtnEdgeColor() {
		return btnEdgeColor;
	}

	public void setBtnEdgeColor(JButton btnEdgeColor) {
		this.btnEdgeColor = btnEdgeColor;
	}

	public JTextField getTxtSide() {
		return txtSide;
	}

	public void setTxtSide(JTextField txtSide) {
		this.txtSide = txtSide;
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

	public JButton getBtnInsideColor() {
		return btnInsideColor;
	}

	public void setBtnInsideColor(JButton btnInsideColor) {
		this.btnInsideColor = btnInsideColor;
	}

	public Color getEdgeColorDlg() {
		return edgeColorDlg;
	}

	public void setEdgeColorDlg(Color edgeColorDlg) {
		this.edgeColorDlg = edgeColorDlg;
	}

	public Color getInsideColorDlg() {
		return insideColorDlg;
	}

	public void setInsideColorDlg(Color insideColorDlg) {
		this.insideColorDlg = insideColorDlg;
	}

	public Square getSquareDialog() {
		return squareDialog;
	}

	public void setSquareDialog(Square squareDialog) {
		this.squareDialog = squareDialog;
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public JPanel getPnlSquare() {
		return pnlSquare;
	}
	
}
