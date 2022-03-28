/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package covidcasos.pkg19;

/**
 *
 * @author DELL
 */ 
import covidcasos.pkg19.FrmAlumno;
import covidcasos.pkg19.FrmCasosCovid;
import Controladores.ControladorAlumnos;
import Controladores.ControladorCasosCovid;
import Modelo.MDB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import covidcasos.pkg19.FrmCasosCovid;
public class CovidCasos19 {
    private FrmCasosCovid _view;
    private FrmAlumno _view2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MDB objModelo = new MDB();
        FrmAlumno objAlumno = new FrmAlumno();
        FrmCasosCovid objCasosCovid = new FrmCasosCovid();
        
        ControladorAlumnos objControllerAlumnos;
        ControladorCasosCovid objControllerCasosCovid;
        
        objControllerCasosCovid = new ControladorCasosCovid(objCasosCovid);
        objControllerCasosCovid.iniciar();
        objCasosCovid.setVisible(true);
        
        //objControllerAlumnos = new ControladorAlumnos(objAlumno, objModelo);
        //objControllerAlumnos.iniciar();
        //objAlumno.setVisible(true);
    }
    
}
