package forms;

import exception.DocumentException;
import exception.PrivateKeyException;
import service.GenerateSignatureImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;

/**
 * @author Gabriel Santos
 */
public class App extends JFrame {

    private final GenerateSignatureImpl generateSignatureImpl;
    private final Clipboard clip;

    public App() {
        initComponents();
        this.generateSignatureImpl = new GenerateSignatureImpl();
        this.clip = Toolkit.getDefaultToolkit().getSystemClipboard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputKey = new javax.swing.JTextField();
        btnCopy = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        byGabriel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        msgInstrucao = new javax.swing.JLabel();
        msgResultado = new javax.swing.JLabel();
        msgStatusDocument = new javax.swing.JLabel();
        signatureResult = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        inputDocument = new javax.swing.JTextField();
        msgStatusKey = new javax.swing.JLabel();
        msgInstrucao1 = new javax.swing.JLabel();
        byGabriel1 = new javax.swing.JLabel();
        msgStatusCopy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 600));

        inputKey.setBackground(new java.awt.Color(255, 255, 255));
        inputKey.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputKey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputKey.setText("PrivateKey value");
        inputKey.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        inputKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyActionPerformed(evt);
            }
        });

        btnCopy.setBackground(new java.awt.Color(51, 153, 255));
        btnCopy.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCopy.setForeground(new java.awt.Color(255, 255, 255));
        btnCopy.setText("COPY");
        btnCopy.setBorder(null);
        btnCopy.setBorderPainted(false);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(102, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Gerador de assinatura");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        byGabriel.setBackground(new java.awt.Color(0, 0, 0));
        byGabriel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        byGabriel.setForeground(new java.awt.Color(102, 102, 102));
        byGabriel.setText("by Gabriel Santos Gomes");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        msgInstrucao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msgInstrucao.setForeground(new java.awt.Color(102, 102, 102));
        msgInstrucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgInstrucao.setText("Insira o número de documento:");
        msgInstrucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        msgResultado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msgResultado.setForeground(new java.awt.Color(102, 102, 102));
        msgResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgResultado.setText("Resultado:");
        msgResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        msgStatusDocument.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msgStatusDocument.setForeground(new java.awt.Color(102, 102, 102));
        msgStatusDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgStatusDocument.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        signatureResult.setBackground(new java.awt.Color(255, 255, 255));
        signatureResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signatureResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signatureResult.setText("Signature result");
        signatureResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        signatureResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signatureResultActionPerformed(evt);
            }
        });

        btnGenerate.setBackground(new java.awt.Color(51, 153, 255));
        btnGenerate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnGenerate.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerate.setText("Gerar Assinatura");
        btnGenerate.setBorder(null);
        btnGenerate.setBorderPainted(false);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        inputDocument.setBackground(new java.awt.Color(255, 255, 255));
        inputDocument.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputDocument.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputDocument.setText("Ex: 12345678945");
        inputDocument.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        inputDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDocumentActionPerformed(evt);
            }
        });

        msgStatusKey.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msgStatusKey.setForeground(new java.awt.Color(102, 102, 102));
        msgStatusKey.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgStatusKey.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        msgInstrucao1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msgInstrucao1.setForeground(new java.awt.Color(102, 102, 102));
        msgInstrucao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgInstrucao1.setText("(Opcional) Insira um valor de chave privada alternativo:");
        msgInstrucao1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        byGabriel1.setBackground(new java.awt.Color(0, 0, 0));
        byGabriel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        byGabriel1.setForeground(new java.awt.Color(102, 102, 102));
        byGabriel1.setText("v1.0.0");

        msgStatusCopy.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msgStatusCopy.setForeground(new java.awt.Color(102, 102, 102));
        msgStatusCopy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgStatusCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msgResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(msgInstrucao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(msgStatusDocument, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(msgStatusKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(msgStatusCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDocument, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputKey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(signatureResult, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(byGabriel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(byGabriel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msgInstrucao1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(msgInstrucao)
                .addGap(18, 18, 18)
                .addComponent(inputDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgStatusDocument)
                .addGap(18, 18, 18)
                .addComponent(msgInstrucao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputKey, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgStatusKey)
                .addGap(43, 43, 43)
                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(msgResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signatureResult, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgStatusCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(byGabriel)
                    .addComponent(byGabriel1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputKeyActionPerformed(ActionEvent evt) {

    }

    private void signatureResultActionPerformed(ActionEvent evt) {

    }

    private void inputDocumentActionPerformed(ActionEvent evt) {

    }

    private void btnCopyActionPerformed(ActionEvent evt) {
//        String content = signatureResult.getSelectedText();
//        StringSelection clipString = new StringSelection(content);
//        clip.setContents(clipString, clipString);
//        this.msgStatusCopy.setText("Copied!");
        // TODO: implementar função de copiar
    }

    private void btnGenerateActionPerformed(ActionEvent evt) {
        try {
            this.cleanInputs();
            String document = generateSignatureImpl.generateSignature(inputDocument.getText(), inputKey.getText());
            this.signatureResult.setText(document);
        } catch (DocumentException ex) {
            this.msgStatusDocument.setText("Documento inválido!");
        } catch (PrivateKeyException ex) {
            this.msgStatusKey.setText("Erro ao gerar chave. Por favor inserir um novo valor.");
        } catch(IllegalArgumentException ex){
            this.msgStatusKey.setText("Erro ao gerar chave. Por favor inserir um novo valor.");
        }
    }

    private void cleanInputs() {
        if (inputDocument.getText().contains("Ex: 12345678945")) {
            inputDocument.setText("");
        }
        if (inputKey.getText().contains("PrivateKey value")) {
            inputKey.setText("");
        }
        if (signatureResult.getText().contains("Signature result") || signatureResult.getText().trim().length() > 0) {
            signatureResult.setText("");
        }
        if(msgStatusCopy.getText().contains("Copied!")){
            msgStatusCopy.setText("");
        }
        if(msgStatusDocument.getText().length() > 0){
            msgStatusDocument.setText("");
        }
        if(msgStatusKey.getText().length() > 0){
            msgStatusKey.setText("");
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JLabel byGabriel;
    private javax.swing.JLabel byGabriel1;
    private javax.swing.JTextField inputDocument;
    private javax.swing.JTextField inputKey;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel msgInstrucao;
    private javax.swing.JLabel msgInstrucao1;
    private javax.swing.JLabel msgResultado;
    private javax.swing.JLabel msgStatusCopy;
    private javax.swing.JLabel msgStatusDocument;
    private javax.swing.JLabel msgStatusKey;
    private javax.swing.JTextField signatureResult;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
