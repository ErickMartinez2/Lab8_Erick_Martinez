/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_erick_martinez;

/**
 *
 * @author usuario
 */
public class Contacto {
    private String nombre;
    private int edad;
    private int numero;
    private String correo;
    private String direccion;
    private String genero;
    private int id;

    public Contacto() {
    }

    public Contacto(String nombre, int edad, int numero, String correo, String direccion, String genero, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
        this.correo = correo;
        this.direccion = direccion;
        this.genero = genero;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
