package com.mycompany.projetoclasses;

import javax.swing.JOptionPane;

public class Aluno {

    public void Entrar_Aluno() {

        
       
                String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Bem vindo Aluno " + nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        String Curso = JOptionPane.showInputDialog("Digite seu curso: ");
        String Campus = JOptionPane.showInputDialog("Digite seu campus: ");
        String RA = JOptionPane.showInputDialog("Digite seu RA: ");
        String Email = JOptionPane.showInputDialog("Digite seu E-mail: ");
        String Telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
        
         JOptionPane.showMessageDialog(null, "Cadastro Aluno " + nome  );
         JOptionPane.showMessageDialog(null, "Idade: " +idade);
         JOptionPane.showMessageDialog(null, "Curso: " +Curso);
         JOptionPane.showMessageDialog(null, "Campus: " +Campus);
         JOptionPane.showMessageDialog(null, "RA: " +RA);
         JOptionPane.showMessageDialog(null, "Email: " +Email);
         JOptionPane.showMessageDialog(null, "Telefone: " +Telefone);
         

    }
}
