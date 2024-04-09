
package com.mycompany.projetoclasses;

import javax.swing.JOptionPane;
public class DiariodeNotas {
public static void main(String[] args) {
    
    String usuario = JOptionPane.showInputDialog("Digite 1 para aluno, 2 para professor");
   
    if (usuario.equals("2")) {
        Professor a2 = new Professor();
        a2.entrarProf();
    }  else if (usuario.equals("1")) {
        Aluno a1 = new Aluno();
        a1.Entrar_Aluno();
    }
    
    
    }
}

