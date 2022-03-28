/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author lgnra
 */

import Modelo.MDB;
import covidcasos.pkg19.Contagio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorContagios implements ActionListener{
    private Contagio _view;
    private MDB _model;
    
    public ControladorContagios(Contagio view, MDB model){
        this._model = model;
        this._view = view;
        this._view.btnAgregar.addActionListener(this);
        this._view.btnNuevo.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String leyenda = "";
        if(e.getSource() == _view.btnAgregar){
            leyenda = _model.registrarAlta("Contagios", "'" + _view.txtNombre.getText() + "'," 
            + _view.txtMatricula.getText() + ",'" + 
             _view.txtFechaDiagnostico.getText() + "'");
            System.out.print(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public void iniciar(){
        _view.setTitle("Control Casos Covid-19");
    }
    
    public void limpiar(){
        
    }
}
