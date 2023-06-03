/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registros;

import java.util.List;
import java.util.ArrayList;
import peluqueriaCanina.logica.Mascota;

/**
 *
 * @author acesi
 */
public class registroMascotas {
    // Los atributos
    private List<Mascota> arrayMascotas = new ArrayList<Mascota> ();

    public registroMascotas(List<Mascota> arrayMascotas) {
        this.arrayMascotas = arrayMascotas;
    }

    public List<Mascota> getArrayMascotas() {
        return arrayMascotas;
    }

    public void setArrayMascotas(List<Mascota> arrayMascotas) {
        this.arrayMascotas = arrayMascotas;
    }
    
    
    
}
