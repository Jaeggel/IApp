/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadrante;

/**
 *
 * @author Grupo Ipp A*
 */
public class Cuadrante 
{
    String coordenada;
    int x;
    int y;
    int costo =1 ;
    int heuristico=0;

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getHeuristico() {
        return heuristico;
    }

    public void setHeuristico(int heuristico) {
        this.heuristico = heuristico;
    }
    
    
}
