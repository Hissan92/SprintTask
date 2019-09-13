package com.fetutex.retirement;


import java.util.*;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;


/***************************************************************************
 * ViewClass.java
 *
 * This program is used to finance and plan an individual's fetutex retirement.
 * This is the view and controller for this application.
 * 
 * @category Computer Science 368
 * @version 2.3
 ***************************************************************************/
public class ViewClass extends javax.swing.JApplet implements Observer {

	//autogenerated serialVersionUID
	private static final long serialVersionUID = -2531844655242885628L;

	// creates an instance of the model class to implement MVC
	private ModelClass theModel;


	/***************************************************************************
	 * Initializes the applet ViewClass
	 ***************************************************************************/
	public void init() {
		try {
			java.awt.EventQueue.invokeAndWait(new Runnable() {

				/***************************************************************
				 * Calls the run method to create the view of the applet.
				 ***************************************************************/
				public void run(){
					initComponents();
				}

			});

			ModelClass model = new ModelClass();
			theModel = model;
			theModel.addObserver(this);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		}
 @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">  
/***************************************************************************
 * This method is called from within the init() method to
 * initialize the form.
 * 
 * This code was autogenerated from NetBeans
 ***************************************************************************/
private void initComponents() {

	buttonGroup1 = new javax.swing.ButtonGroup();
	jTextField1 = new javax.swing.JTextField();
	jLabel1 = new javax.swing.JLabel();
	jLabel2 = new javax.swing.JLabel();
	jTextField3 = new javax.swing.JTextField();
	jLabel3 = new javax.swing.JLabel();
	jLabel4 = new javax.swing.JLabel();
	jTextField4 = new javax.swing.JTextField();
	jLabel5 = new javax.swing.JLabel();
	jButton1 = new javax.swing.JButton();
	jButton2 = new javax.swing.JButton();
	jTextField6 = new javax.swing.JTextField();
	jTextField7 = new javax.swing.JTextField();
	jTextField8 = new javax.swing.JTextField();
	jTextField9 = new javax.swing.JTextField();
	jTextField10 = new javax.swing.JTextField();
	jLabel6 = new javax.swing.JLabel();
	jLabel7 = new javax.swing.JLabel();
	jLabel8 = new javax.swing.JLabel();
	jLabel9 = new javax.swing.JLabel();
	jLabel10 = new javax.swing.JLabel();
	jLabel11 = new javax.swing.JLabel();
	jLabel12 = new javax.swing.JLabel();
	jComboBox1 = new javax.swing.JComboBox();
	jComboBox2 = new javax.swing.JComboBox();
	jButton3 = new javax.swing.JButton();
	jSpinner2 = new javax.swing.JSpinner();
	jLabel13 = new javax.swing.JLabel();
	jLabel14 = new javax.swing.JLabel();
	jComboBox3 = new javax.swing.JComboBox();
	jLabel15 = new javax.swing.JLabel();
	jTextField2 = new javax.swing.JTextField();
	jLabel16 = new javax.swing.JLabel();
	jLabel17 = new javax.swing.JLabel();
	jTextField11 = new javax.swing.JTextField();
	jTextField12 = new javax.swing.JTextField();
	jTextField13 = new javax.swing.JTextField();
	jFormattedTextField1 = new javax.swing.JFormattedTextField();
	jScrollBar1 = new javax.swing.JScrollBar();
	jRadioButton1 = new javax.swing.JRadioButton();
	jRadioButton2 = new javax.swing.JRadioButton();
	jLabel18 = new javax.swing.JLabel();
	jLabel19 = new javax.swing.JLabel();
	jLabel20 = new javax.swing.JLabel();
	
	setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	setStub(null);

	jTextField1.setToolTipText("Your first and last name.");
	jTextField1.setPreferredSize(new java.awt.Dimension(100, 20));

	jLabel1.setText("Name");

	jLabel2.setText("Birthdate (mm/dd/yyyy)");

	jTextField3.setToolTipText("Your current annual income.");
	jTextField3.setPreferredSize(new java.awt.Dimension(100, 20));

	jLabel3.setText("Annual Income");

	jLabel4.setText("Social Security Income");

	jTextField4.setEditable(false);
	jTextField4.setToolTipText("Income received annually from social security");
	jTextField4.setPreferredSize(new java.awt.Dimension(100, 20));

	jButton1.setText("Calculate");
	jButton1.setToolTipText("Performs the calculations needed to compute annual amount needed to reach your goal.");
	jButton1.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jButton1ActionPerformed(evt);
		}
	});

	jButton2.setText("Reset");
	jButton2.setToolTipText("Sets all fields to its default value");
	jButton2.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jButton2ActionPerformed(evt);
		}
	});
	jTextField6.setToolTipText("Income received annually from other sources (such as pension plans, earnings on assets, part-time job, etc.)");
	jTextField6.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			//jTextField6ActionPerformed(evt);
		}
	});

	jTextField7.setEditable(false);
	jTextField7.setToolTipText("This is how much you need to make up for each retirement year");

	jTextField8.setToolTipText("Total Savings to date (include money accumulated in a 401(k), IRA, or similar retirement plan)");
	jTextField8.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			//jTextField8ActionPerformed(evt);
		}
	});

	jTextField9.setEditable(false);
	jTextField9.setToolTipText("The total amount of savings needed when you retire.");

	jTextField10.setEditable(false);
	jTextField10.setToolTipText("Annual amount you'll need to save each year to earn the specified percentage of your income.");

	jLabel6.setText("Other (earnings on assets etc.)");

	jLabel7.setText("Annual Retirement funds needed");

	jLabel8.setText("Expected Retirement Age");

	jLabel9.setText("Life Expectancy");

	jLabel10.setText("Total Amount In Savings");

	jLabel11.setText("Total Savings Needed at Retirement");

	jLabel12.setText("ANNUAL AMOUNT NEEDED");

	jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "55-59", "60-64", "65-69", "70+" }));
	jComboBox1.setToolTipText("Age at which you expect to retire");

	jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Below Average", "Average", "Above Average" }));
	jComboBox2.setToolTipText("Life Expectancy:\n(The average male life expectancy is 89)\n(The average female life expectany is 92)");

	jButton3.setText("Print");
	jButton3.setToolTipText(" Brings up a read-only dialog showing a summary of the resulting plan in a printable form");
	jButton3.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jButton3ActionPerformed(evt);
		}
	});

	jSpinner2.setToolTipText("The percentage of your current annual income you would like to receive each year during retirement.");
	jSpinner2.setValue(70);

	jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18));
	jLabel13.setText("Retirement Planning Calculator");

	jLabel14.setText("Gender");

	jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

	jLabel15.setText("MONTHLY AMOUNT NEEDED");

	jTextField2.setEditable(false);
	jTextField2.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			//jTextField2ActionPerformed(evt);
		}
	});

	jLabel16.setText("Traditional Employer Pension");

	jLabel17.setText("Part-time Income");

	jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

	buttonGroup1.add(jRadioButton1);
	jRadioButton1.setActionCommand("jRadioButton1");
	jRadioButton1.setLabel("Expected annual income after retirement");
	jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jRadioButton1ActionPerformed(evt);
		}
	})
	jSpinner2.setToolTipText("The percentage of your current annual income you would like to receive each year during retirement.");
	jSpinner2.setValue(70);

	jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18));
	jLabel13.setText("Retirement Planning Calculator");

	jLabel14.setText("Gender");

	jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

	jLabel15.setText("MONTHLY AMOUNT NEEDED");

	jTextField2.setEditable(false);
	jTextField2.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			//jTextField2ActionPerformed(evt);
		}
	});

	jLabel16.setText("Traditional Employer Pension");

	jLabel17.setText("Part-time Income");

	jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

	buttonGroup1.add(jRadioButton1);
	jRadioButton1.setActionCommand("jRadioButton1");
	jRadioButton1.setLabel("Expected annual income after retirement");
	jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jRadioButton1ActionPerformed(evt);
		}
	});

	buttonGroup1.add(jRadioButton2);
	jRadioButton2.setSelected(true);
	jRadioButton2.setText("Percent of Annual Income Wanted for Retirement");
	jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
		public void mouseClicked(java.awt.event.MouseEvent evt) {
			//jRadioButton2MouseClicked(evt);
		}
	});
	jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jRadioButton2ActionPerformed(evt);
		}
	});

	jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14));
	jLabel18.setText("Basic Information");

	jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14));
	jLabel19.setText("Results");

	jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14));
	jLabel20.setText("Additional Information");


	
	

	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addGap(254, 254, 254)
					.addComponent(jLabel13)
					.addContainerGap(1064, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jLabel20)
							.addContainerGap(1435, Short.MAX_VALUE))
							.addGroup(layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(jLabel16)
									.addContainerGap(1455, Short.MAX_VALUE))
									.addGroup(layout.createSequentialGroup()
											.addContainerGap()
											.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
													.addGroup(layout.createSequentialGroup()
															.addComponent(jLabel8)
															.addContainerGap())
															.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																	.addGroup(layout.createSequentialGroup()
																			.addComponent(jRadioButton1)
																			.addContainerGap())
																			.addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																			.addGroup(layout.createSequentialGroup()
																					.addComponent(jLabel18)
																					.addContainerGap(1469, Short.MAX_VALUE))
																					.addGroup(layout.createSequentialGroup()
																							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																									.addGroup(layout.createSequentialGroup()
																											.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																													.addComponent(jRadioButton2)
																													.addComponent(jLabel5)
																													.addComponent(jLabel7)
																													.addComponent(jLabel6)
																													.addComponent(jLabel17)
																													.addGroup(layout.createSequentialGroup()
																															.addComponent(jLabel1)
																															.addGap(18, 18, 18)
																															.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
																															.addGap(6, 6, 6)
																															.addComponent(jLabel2))
																															.addComponent(jLabel3)
																															.addComponent(jLabel4))
																															.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																															.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
																																			.addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
																																			.addGap(468, 468, 468))
																																			.addGroup(layout.createSequentialGroup()
																																					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																																									.addComponent(jTextField11)
																																									.addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
																																									.addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
																																									.addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
																																									.addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
																																									.addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
																																									.addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
																																									.addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
																																									.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																																											.addComponent(jFormattedTextField1)
																																											.addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
																																											.addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING)
																																											.addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
																																											.addGap(75, 75, 75)
																																											.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																													.addComponent(jLabel14)
																																													.addComponent(jLabel9))
																																													.addGap(18, 18, 18)
																																													.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																															.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																															.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
																																															.addGap(690, 690, 690)))))
																																															.addGroup(layout.createSequentialGroup()
																																																	.addContainerGap()
																																																	.addComponent(jLabel10)
																																																	.addContainerGap(1475, Short.MAX_VALUE))
																																																	.addGroup(layout.createSequentialGroup()
																																																			.addContainerGap()
																																																			.addComponent(jLabel19)
																																																			.addContainerGap(1542, Short.MAX_VALUE))
																																																			.addGroup(layout.createSequentialGroup()
																																																					.addContainerGap()
																																																					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																																																							.addComponent(jButton1)
																																																							.addComponent(jLabel15)
																																																							.addComponent(jLabel12)
																																																							.addComponent(jLabel11))
																																																							.addGap(124, 124, 124)
																																																							.addComponent(jButton2)
.  Sometimes you need to work with multiple databases (for example, one for basic usage and another for archiving).we will see how to make Spring Boot multiple databases configuration.																																																							.addGap(106, 106, 106)
																																																							.addComponent(jButton3)
																																																							.addContainerGap(1073, Short.MAX_VALUE))
	);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel18)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2)
								.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel14))
								.addGap(16, 16, 16)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(12, 12, 12)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jRadioButton2))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jRadioButton1)
																.addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(39, 39, 39)
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(jLabel20)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGap(12, 12, 12)
																				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel17)
																						.addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																								.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																								.addGap(18, 18, 18)
																								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(jLabel7))
																										.addGap(18, 18, 18)
																										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(jLabel8)
																												.addComponent(jLabel9)
																												.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(jLabel10)
																														.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGap(39, 39, 39)
																														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																																.addGroup(layout.createSequentialGroup()
																																		.addComponent(jLabel19)
																																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(jLabel11))
																																		.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addGap(18, 18, 18)
																																		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																				.addComponent(jLabel12)
																																				.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																																						.addGap(18, 18, 18)
																																						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																								.addGroup(layout.createSequentialGroup()
																																										.addComponent(jButton1)
																																										.addGap(436, 436, 436)
																																										.addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
																																										.addGroup(layout.createSequentialGroup()
																																												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																														.addComponent(jButton2)
																																														.addComponent(jButton3))
																																														.addContainerGap())))
		);





	