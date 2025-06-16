package src.main.abas;

import javax.swing.*;
import java.awt.*;


public class Padrao extends JPanel {
    private String titulo;
    
    // Construtor padrão
    public Padrao() {
        this("Título Padrão"); // Chama o outro construtor
    }
    
    // Novo construtor que recebe String
    public Padrao(String titulo) {
        this.titulo = titulo;
        configurarAba();
    }
    
    private void configurarAba() {
        setBackground(Color.decode("#f1f6f9"));
    }
}