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
import covidcasos.pkg19.FrmCasosCovid;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorCasosCovid{
    private FrmCasosCovid _view;
    
    public ControladorCasosCovid(FrmCasosCovid view){
        this._view = view;
    }
    
    public void iniciar(){
        _view.setTitle("Control Casos Covid-19");
    }
    
}
