package projetfinal1;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthu
 */
public class speed_click_graphic extends javax.swing.JFrame {

    /**
     * Creates new form speed_click_graphic
     */
    Joueur lejoueur;   
    Grille grilleDeJeu = new Grille();
    static int second =0;
    static int millisecond =0;
    int a; 
    int b;
    int Compteur;
    Timer chronome =new Timer();
    
    
    public speed_click_graphic() {
        initComponents();
        ScoreJoueur.setText(""+Compteur);
        panno_infos.setVisible(false);

        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                Cellule_graphic cellGraph = new Cellule_graphic(grilleDeJeu.Cellules[i][j]);
                panno_grille.add(cellGraph);
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Cellule macellule = cellGraph.celluleAssociee;
                    if (macellule.presenceTaupe()==true){
                        EnleverTaupe(macellule);
                        Random r = new Random();
                        int ligne_taupe = r.nextInt(4);
                        int colonne_taupe = r.nextInt(4);
                        grilleDeJeu.placerTaupe(ligne_taupe, colonne_taupe);
                        panno_grille.repaint();
                    }else{
                           
                    }
                    }
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panno_grille = new javax.swing.JPanel();
        panno_partie = new javax.swing.JPanel();
        nom = new javax.swing.JLabel();
        nom_joueur = new javax.swing.JTextField();
        lancer_partie = new javax.swing.JButton();
        panno_infos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom_du_joueur = new javax.swing.JLabel();
        chrono_joueur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ScoreJoueur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panno_grille.setBackground(new java.awt.Color(0, 51, 255));
        panno_grille.setPreferredSize(new java.awt.Dimension(392, 370));
        panno_grille.setLayout(new java.awt.GridLayout(4, 4));
        getContentPane().add(panno_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 392, 268));

        panno_partie.setBackground(new java.awt.Color(51, 51, 0));
        panno_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom.setText("Nom Joueur:");
        panno_partie.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        nom_joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueurActionPerformed(evt);
            }
        });
        panno_partie.add(nom_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, 30));

        lancer_partie.setText("Démarrer Partie");
        lancer_partie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancer_partieActionPerformed(evt);
            }
        });
        panno_partie.add(lancer_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, 20));

        getContentPane().add(panno_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 260, 120));

        panno_infos.setBackground(new java.awt.Color(51, 51, 51));
        panno_infos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Infos partie:");
        panno_infos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Joueur:");
        panno_infos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compteur:");
        panno_infos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, -1));

        nom_du_joueur.setForeground(new java.awt.Color(255, 102, 255));
        nom_du_joueur.setText("nomdujoueur");
        panno_infos.add(nom_du_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 100, -1));

        chrono_joueur.setForeground(new java.awt.Color(255, 102, 255));
        chrono_joueur.setText("00");
        panno_infos.add(chrono_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, 10));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Temps:");
        panno_infos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, -1));

        ScoreJoueur.setBackground(new java.awt.Color(102, 0, 102));
        ScoreJoueur.setForeground(new java.awt.Color(255, 102, 255));
        ScoreJoueur.setText("jLabel5");
        panno_infos.add(ScoreJoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        getContentPane().add(panno_infos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 260, 120));

        setBounds(0, 0, 839, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void lancer_partieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancer_partieActionPerformed
        // TODO add your handling code here:
        
        panno_infos.setVisible(true);
        
        lancer_partie.setEnabled(false);
        initialiserPartie();
        boolean z=false;
        z=chronometre();
        
            
    
    }//GEN-LAST:event_lancer_partieActionPerformed

    private void nom_joueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueurActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(speed_click_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(speed_click_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(speed_click_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(speed_click_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new speed_click_graphic().setVisible(true);
            }
        });
    }

void initialiserPartie() {
    //Mise en place de la grille
    
    

    //Création du joueurs
    String nom_J = nom_joueur.getText();
    Joueur J = new Joueur(nom_J);
    
    
    
    lejoueur=J;
  
    nom_du_joueur.setText(nom_J);
    
    //Dans l'initialisation on place une taupe
    Random r = new Random();
    int ligne_taupe = r.nextInt(4);
    int colonne_taupe = r.nextInt(4);
    grilleDeJeu.placerTaupe(ligne_taupe, colonne_taupe);
    int a = ligne_taupe;
    int b=colonne_taupe; 
    panno_grille.repaint();
    

}
public boolean chronometre(){
    Timer chronome =new Timer();
        chronome.schedule(new TimerTask() {
            int time=20;
            @Override
            public void run() {
                chrono_joueur.setText(""+time);
                if (time==0){
                    FinPartie();
                    cancel();// stop le chrono au bout de 20 s
                }
                time--;
            }
        }, 1000, 1000);// delaire de 1s toute les secondes
        return true;
}
public void EnleverTaupe(Cellule macellule){
    if(macellule.presenceTaupe()==true){
        Compteur++;
        ScoreJoueur.setText(""+Compteur);
    }
    macellule.taupe=false;
    panno_grille.repaint();
}
public void FinPartie(){
    for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                grilleDeJeu.Cellules[i][j].taupe=false;
                panno_grille.repaint();
                
            }
    }
}

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ScoreJoueur;
    private javax.swing.JLabel chrono_joueur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lancer_partie;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nom_du_joueur;
    private javax.swing.JTextField nom_joueur;
    private javax.swing.JPanel panno_grille;
    private javax.swing.JPanel panno_infos;
    private javax.swing.JPanel panno_partie;
    // End of variables declaration//GEN-END:variables
}
