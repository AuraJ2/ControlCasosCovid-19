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
import covidcasos.pkg19.FrmAlumno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorAlumnos implements ActionListener{
    private FrmAlumno _view;
    private MDB _model;
    
    public ControladorAlumnos(FrmAlumno view, MDB model){
        this._model = model;
        this._view = view;
        this._view.btnRegistrar.addActionListener(this);
        this._view.btnLimpiar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String leyenda = "";
        if(e.getSource() == _view.btnRegistrar){
            leyenda = _model.registrarAlta("alumnos","'" +  _view.txtNombre.getText() + "',"
            + _view.txtMatricula.getText() + ",'"
            + _view.txtTutor.getText() + "','"
            + (String) _view.cbxCarrera.getSelectedItem() + "',"
            + (String) _view.cbxCuatrimestre.getSelectedItem() + ",'"
            + (String) _view.cbxVacuna.getSelectedItem() + "','"
            + _view.txtFechaVacunacion.getText() + "','"
            + (String) _view.cbxCovid.getSelectedItem() + "','"
            + _view.txtFechaCovid.getText()+ "'");
            System.out.print(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public void iniciar(){
        _view.setTitle("Control Casos Covid-19");
    }
    
    public void limpiar(){
        _view.cbxVacuna.setSelectedItem(0);
        _view.txtFechaVacunacion.setText("0000/00/00");
        _view.cbxCovid.setSelectedItem(0);
        _view.txtFechaCovid.setText("0000/00/00");
        _view.cbxSintomas.setSelectedItem(0);
        _view.txtNombre.setText("");
        _view.cbxCuatrimestre.setSelectedItem(0);
        _view.txtTutor.setText("");
        _view.txtMatricula.setText("");
    }
}
