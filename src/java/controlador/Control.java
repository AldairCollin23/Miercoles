/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.beans.*;
import java.io.Serializable;
import modelo.Datos;
import modelo.DatosCliente;


public class Control implements Serializable {
    
    Datos d=new Datos();
    DatosCliente datoscliente = new DatosCliente();
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public Control() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public int regProd(String a,String b,String c){
    
        return d.registraPro(a, b, c);
    }
    
    public int regCliente(String dni,String nom,String apepat,String apemat){
    
        return datoscliente.registraCliente(dni, nom, apepat, apemat);
    }
    
     public int eliminarCliente(String dni){
    
        return datoscliente.eliminar(dni);
    }
    
}
