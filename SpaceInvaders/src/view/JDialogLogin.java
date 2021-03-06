/*
 * JDialogLogin.java
 *
 * Created on 17 November 2008, 13:45
 */
package view;

import javax.swing.BorderFactory;

/**
 *
 * @author  sruiz
 */
public class JDialogLogin extends javax.swing.JDialog {

  private boolean loginCancelled = false;
  /** Indicates a new user   */
  public static final int NEW = 1;
  /** indicates an existing user  */
  public static final int EXISTING = 2;

  /**
   * Display error message for a database error
   */
  public void displayDatabaseError() {
    jLabError.setText("A database error has occured. Try again later.");
    jLabError.setVisible(true);
  }

  /**
   * Display error message for a user already exists error
   */
  public void displayUserAlreadyExistsError() {
    jLabError.setText("Username already in use. Please try again.");
    jLabError.setVisible(true);

  }

  /**
   * Display error message for a user does not exist error
   */
  public void displayUserDoesNotExistError() {
    jLabError.setText("Username does not exist. Please try again.");
    jLabError.setVisible(true);
  }

  /**
   * Display error message for a wrong pqassword error
   */
  public void displayWrongPasswordError() {
    jLabError.setText("Illegal password. Please try again.");
    jLabError.setVisible(true);
  }

  /** Creates new form JDialogLogin
   * @param parent The parent Frame
   */
  public JDialogLogin(java.awt.Frame parent) {
    this(parent, true);
  }

  /** Creates new form JDialogLogin
   * @param parent The parent Frame
   * @param modal If true dialogue must be answered before continuing
   */
  private JDialogLogin(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();

    // login on enter
    this.rootPane.setDefaultButton(btnOK);

    // stop user closing window
    JDialogLogin.this.setDefaultCloseOperation(JDialogLogin.DO_NOTHING_ON_CLOSE);

    // default to returning player
    setLoginViewType(EXISTING);
  }

  /**
   * @return username
   */
  public String getUsername() {
    return txtUsername.getText();
  }

  /**
   * @return password
   */
  public String getPassword() {
    return new String(txtPassword1.getPassword());
  }

  /**
   * @return state of loginCancelled
   */
  public boolean isLoginCancelled() {
    return loginCancelled;
  }

  /**
   * Local error detection message for missing password
   */
  private void displayMissingPasswordError() {
    jLabError.setText("Please enter a password");
    jLabError.setVisible(true);
  }

  /**
   * Local error detection message for non-matching password
   */
  private void displayPasswordReenterError() {
    jLabError.setText("Passwords don't match.");
    jLabError.setVisible(true);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgNewOrReturning = new javax.swing.ButtonGroup();
        pnlNewOrReturning = new javax.swing.JPanel();
        radReturningPlayer = new javax.swing.JRadioButton();
        radNewPlayer = new javax.swing.JRadioButton();
        pnlPlayerDetails = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JPasswordField();
        txtPassword2 = new javax.swing.JPasswordField();
        lblRepeatPassword = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jLabError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setModal(true);
        setResizable(false);

        pnlNewOrReturning.setBorder(javax.swing.BorderFactory.createTitledBorder("Hi. Are you a New or Returning Player?"));

        bgNewOrReturning.add(radReturningPlayer);
        radReturningPlayer.setSelected(true);
        radReturningPlayer.setText("Returning Player");
        radReturningPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radReturningPlayerActionPerformed(evt);
            }
        });

        bgNewOrReturning.add(radNewPlayer);
        radNewPlayer.setText("New Player");
        radNewPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNewPlayerActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlNewOrReturningLayout = new org.jdesktop.layout.GroupLayout(pnlNewOrReturning);
        pnlNewOrReturning.setLayout(pnlNewOrReturningLayout);
        pnlNewOrReturningLayout.setHorizontalGroup(
            pnlNewOrReturningLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlNewOrReturningLayout.createSequentialGroup()
                .addContainerGap()
                .add(radReturningPlayer)
                .add(18, 18, 18)
                .add(radNewPlayer)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNewOrReturningLayout.setVerticalGroup(
            pnlNewOrReturningLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlNewOrReturningLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlNewOrReturningLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(radReturningPlayer)
                    .add(radNewPlayer))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPlayerDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("New Player"));

        jLabel4.setText("Username:");

        jLabel5.setText("Password:");

        lblRepeatPassword.setText("Repeat Password:");

        org.jdesktop.layout.GroupLayout pnlPlayerDetailsLayout = new org.jdesktop.layout.GroupLayout(pnlPlayerDetails);
        pnlPlayerDetails.setLayout(pnlPlayerDetailsLayout);
        pnlPlayerDetailsLayout.setHorizontalGroup(
            pnlPlayerDetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPlayerDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlPlayerDetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtUsername, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(txtPassword1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .add(lblRepeatPassword)
                    .add(txtPassword2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPlayerDetailsLayout.setVerticalGroup(
            pnlPlayerDetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPlayerDetailsLayout.createSequentialGroup()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtPassword1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblRepeatPassword)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtPassword2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(73, 23));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.setPreferredSize(new java.awt.Dimension(73, 23));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabError.setForeground(new java.awt.Color(255, 0, 51));
        jLabError.setText("                                    WELCOME");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, pnlNewOrReturning, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(100, 100, 100)
                        .add(btnOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(7, 7, 7)
                        .add(btnCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, pnlPlayerDetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabError, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 274, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(pnlNewOrReturning, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlPlayerDetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jLabError, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  /**
   * Adjusts the dialogue controls that are visible according to the users
   * choice of new or existing player
   * @param playerType the type of player (NEW, EXIISTING)
   */
  private void setLoginViewType(int playerType) {
    if (playerType == NEW) {
      txtPassword2.setVisible(true);
      lblRepeatPassword.setVisible(true);
      pnlPlayerDetails.setBorder(BorderFactory.createTitledBorder("New Player"));
    } else {
      txtPassword2.setVisible(false);
      lblRepeatPassword.setVisible(false);
      pnlPlayerDetails.setBorder(BorderFactory.createTitledBorder("Returning Player"));
    }
    txtUsername.requestFocus();
  }

  /**
   *
   * @return The player type (NEW or EXISTING) according to the radio buttons
   */
  public int getPlayerType() {
    if (radNewPlayer.isSelected()) {
      return NEW;
    } else {
      return EXISTING;
    }
  }

  /**
   * Event handler for new player radio button
   * @param evt
   */
private void radNewPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNewPlayerActionPerformed
  setLoginViewType(NEW);
}//GEN-LAST:event_radNewPlayerActionPerformed

/**
   * Event handler for returning player radio button
   * @param evt
   */
private void radReturningPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radReturningPlayerActionPerformed
  setLoginViewType(EXISTING);
}//GEN-LAST:event_radReturningPlayerActionPerformed

/**
 * Event handler for button OK
 * @param evt
 */
private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
  if ((txtPassword1.getPassword().length == 0) || (txtUsername.getText().equals(""))) {
    displayMissingPasswordError();
    txtUsername.requestFocus();
  } else if (radNewPlayer.isSelected()) {
    String p1 = new String(txtPassword1.getPassword());
    String p2 = new String(txtPassword2.getPassword());
    if (!p1.equals(p2)) {
      displayPasswordReenterError();
      txtPassword1.requestFocus();
    } else {
      JDialogLogin.this.setVisible(false);
    }
  } else {
    JDialogLogin.this.setVisible(false);
  }
}//GEN-LAST:event_btnOKActionPerformed
/**
 * Event handler for button CANCEL
 * @param evt
 */
private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
  loginCancelled = true;
  JDialogLogin.this.setVisible(false);
}//GEN-LAST:event_btnCancelActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgNewOrReturning;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabError;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblRepeatPassword;
    private javax.swing.JPanel pnlNewOrReturning;
    private javax.swing.JPanel pnlPlayerDetails;
    private javax.swing.JRadioButton radNewPlayer;
    private javax.swing.JRadioButton radReturningPlayer;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
