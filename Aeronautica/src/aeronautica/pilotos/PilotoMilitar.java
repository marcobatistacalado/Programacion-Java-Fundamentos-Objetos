/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeronautica.pilotos;

/**
 *
 * @author JuanDMeGon
 */
public class PilotoMilitar extends Piloto{
    String ordenarSalida()
    {
        return this.comunicarse("Lanzarse del avión");
    }
}