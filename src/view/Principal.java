package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.domain.Estado;
import model.service.MiniMax;

public class Principal extends javax.swing.JFrame {
	
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JCheckBox chkPodaAlfaBeta;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.ButtonGroup radioGrp;
    private javax.swing.JRadioButton radioGrpMax;
    private javax.swing.JRadioButton radioGrpMin;

    private Character quemJoga;    
    private MiniMax miniMax;

    public Principal() {
        initComponents();
    }
    
    private void initComponents() {
    	quemJoga = Estado.CHAR_MAX;
        radioGrp = new javax.swing.ButtonGroup();
        pnlBotoes = new javax.swing.JPanel();
        btn00 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        pnlOpcoes = new javax.swing.JPanel();
        chkPodaAlfaBeta = new javax.swing.JCheckBox();
        radioGrpMin = new javax.swing.JRadioButton();
        radioGrpMax = new javax.swing.JRadioButton();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha com MinMax");

        pnlBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn00.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn00.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn00.setText(" ");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn21.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn21.setText(" ");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn10.setText(" ");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn20.setText(" ");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn11.setText(" ");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn01.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn01.setText(" ");
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn12.setText(" ");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn22.setText(" ");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn02.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn02.setText(" ");
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotoesLayout.createSequentialGroup()
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBotoesLayout.createSequentialGroup()
                                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOpcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chkPodaAlfaBeta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkPodaAlfaBeta.setText("Aplicar poda AlfaBeta");

        radioGrp.add(radioGrpMin);
        radioGrpMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioGrpMin.setText("Jogador Min");
        radioGrpMin.setSelected(true);

        radioGrp.add(radioGrpMax);
        radioGrpMax.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioGrpMax.setText("Jogador Max");

        btnIniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIniciar.setText("INICIAR!!!!!");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPodaAlfaBeta)
                    .addGroup(pnlOpcoesLayout.createSequentialGroup()
                        .addComponent(radioGrpMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioGrpMax)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkPodaAlfaBeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioGrpMin)
                    .addComponent(radioGrpMax))
                .addGap(18, 18, 18)
                .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
    	if (btn00.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn00.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}
    }

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
    	if (btn01.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn01.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
        }
    }
    
    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
    	if (btn02.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn02.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}    	
    }

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
    	if (btn10.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn10.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}
    }

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
    	if (btn11.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn11.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}
    }

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
    	if (btn12.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn12.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}
    }

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
    	if (btn20.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn20.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}
    }

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
    	if (btn21.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn21.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}
    }

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
    	if (btn22.getText().equals(Estado.CHAR_VAZIO+"")) {
    		btn22.setText(quemJoga+"");
        	alteraQuemJoga();
    		if (!btnIniciar.isEnabled()) {
    			executaJogadaComputador();
    		}
    		veSeGanhou();
    	}
    }

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
    	boolean podaAlfaBeta = chkPodaAlfaBeta.isSelected();
    	boolean jogadorMin = radioGrpMin.isSelected();
    	radioGrpMin.setEnabled(false);
    	radioGrpMax.setEnabled(false);
    	chkPodaAlfaBeta.setEnabled(false);
    	btnIniciar.setEnabled(false);
    	miniMax = new MiniMax(podaAlfaBeta,jogadorMin);
    	if (jogadorMin) {
    		executaJogadaComputador();	
    	}    	    	
    }
    
    public void veSeGanhou() {
    	char[][] jogadaInicial = getJogada();
    	Estado noInicial = new Estado(jogadaInicial,quantosPreenchidos());
    	boolean acabou = false;
    	if (noInicial.isGanhou(Estado.CHAR_MAX)) {
    		JOptionPane.showMessageDialog(null,"MAX GANHOU!!!!");
    		acabou = true;
    	} else if (noInicial.isGanhou(Estado.CHAR_MIN)) {
    		JOptionPane.showMessageDialog(null,"MIN GANHOU!!!!");
    		acabou = true;
    	} else if (noInicial.isEncerrado()) {
    		JOptionPane.showMessageDialog(null,"EMPATOU!!!!");
    		acabou = true;
    	}
    	if (acabou) {
    		btn00.setText(" ");
        	btn01.setText(" ");
        	btn02.setText(" ");
        	btn10.setText(" ");
        	btn11.setText(" ");
        	btn12.setText(" ");
        	btn20.setText(" ");
        	btn21.setText(" ");
        	btn22.setText(" ");
        	quemJoga = Estado.CHAR_MAX;
        	radioGrpMax.setEnabled(true);
        	radioGrpMin.setEnabled(true);
        	chkPodaAlfaBeta.setEnabled(true);
        	btnIniciar.setEnabled(true);
    	}    	    	
    }

    private void executaJogadaComputador() {
    	try {
        	char[][] jogadaInicial = getJogada();
        	Estado noInicial = new Estado(jogadaInicial,quantosPreenchidos());
    		Estado estado = miniMax.executaAlgoritmoMiniMax(noInicial);
    		setJogada(estado.getJogada());
    		alteraQuemJoga();
    		JOptionPane.showMessageDialog(null,miniMax.getEstadosPercorridos()+" estados percorridos");
    	} catch(Exception e ) {
    		JOptionPane.showMessageDialog(null,"Erro "+e.getMessage());
    		e.printStackTrace();
    	}
	}

	private Integer quantosPreenchidos() {
		int quantos = 0;
		quantos += btn00.getText().equals(" ")?0:1;
		quantos += btn01.getText().equals(" ")?0:1;
		quantos += btn02.getText().equals(" ")?0:1;
		quantos += btn10.getText().equals(" ")?0:1;
		quantos += btn11.getText().equals(" ")?0:1;
		quantos += btn12.getText().equals(" ")?0:1;
		quantos += btn20.getText().equals(" ")?0:1;
		quantos += btn21.getText().equals(" ")?0:1;
		quantos += btn22.getText().equals(" ")?0:1;
		
		return quantos;
	}

	private void alteraQuemJoga() {
		if (quemJoga == Estado.CHAR_MAX) {
			quemJoga = Estado.CHAR_MIN;
		} else {
			quemJoga = Estado.CHAR_MAX;
		}		
	}

	private void setJogada(char[][] jogada) {
    	btn00.setText(jogada[0][0]+"");
    	btn01.setText(jogada[0][1]+"");
    	btn02.setText(jogada[0][2]+"");
    	btn10.setText(jogada[1][0]+"");
    	btn11.setText(jogada[1][1]+"");
    	btn12.setText(jogada[1][2]+"");
    	btn20.setText(jogada[2][0]+"");
    	btn21.setText(jogada[2][1]+"");
    	btn22.setText(jogada[2][2]+"");    			
	}

	private char[][] getJogada() {
    	char[][] jogadaInicial = new char[3][3];
    	jogadaInicial[0][0] = btn00.getText().charAt(0);
    	jogadaInicial[0][1] = btn01.getText().charAt(0);
    	jogadaInicial[0][2] = btn02.getText().charAt(0);
    	jogadaInicial[1][0] = btn10.getText().charAt(0);
    	jogadaInicial[1][1] = btn11.getText().charAt(0);
    	jogadaInicial[1][2] = btn12.getText().charAt(0);
    	jogadaInicial[2][0] = btn20.getText().charAt(0);
    	jogadaInicial[2][1] = btn21.getText().charAt(0);
    	jogadaInicial[2][2] = btn22.getText().charAt(0);	
    	return jogadaInicial;
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	Principal p = new Principal();
                p.setVisible(true);
                p.centralizarComponente();
            }
        });        
    }
    
    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

}
