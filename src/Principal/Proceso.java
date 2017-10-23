/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Cuadrante.CuadranteMuro;
import Cuadrante.CuadranteInicioFin;
import Cuadrante.CuadranteNoSeleccionado;
import java.util.ArrayList;

/**
 *
 * @author IApp A*
 */
public class Proceso 
{
    static ArrayList<CuadranteInicioFin> lstCIF=new ArrayList<CuadranteInicioFin>();
    static ArrayList<CuadranteMuro> lstCM=new ArrayList<CuadranteMuro>();
    static ArrayList<CuadranteNoSeleccionado> lstNS=new ArrayList<CuadranteNoSeleccionado>();
    
    public CuadranteInicioFin setCIF(String btnName)
    {
        String coordenada=btnName.trim();
        String aux=coordenada.split("[\\(||//)]")[1].toString();
        int x=Integer.parseInt(aux.split(";")[0].toString());
        int y=Integer.parseInt(aux.split(";")[1].toString());
        CuadranteInicioFin cif=new CuadranteInicioFin(btnName, x, y);
        cif.setCoordenada(coordenada);
        cif.setX(x);
        cif.setY(y);
        return cif;
    }
    public CuadranteMuro setCM(String btnName)
    {
        String coordenada=btnName.trim();
        String aux=coordenada.split("[\\(||//)]")[1].toString();
        int x=Integer.parseInt(aux.split(";")[0].toString());
        int y=Integer.parseInt(aux.split(";")[1].toString());
        CuadranteMuro cm=new CuadranteMuro(btnName, x, y);
        cm.setCoordenada(coordenada);
        cm.setX(x);
        cm.setY(y);
        return cm;
    }
    public CuadranteNoSeleccionado setNS(String item)
    {
        String coordenada=item.trim();
        String aux=coordenada.split("[\\(||//)]")[1].toString();
        int x=Integer.parseInt(aux.split(";")[0].toString());
        int y=Integer.parseInt(aux.split(";")[1].toString());
        CuadranteNoSeleccionado ns=new CuadranteNoSeleccionado(item, x, y);
        ns.setCoordenada(coordenada);
        ns.setX(x);
        ns.setY(y);
        return ns;
    }
    public ArrayList<CuadranteInicioFin> setLstCI(CuadranteInicioFin ci)
    {
        lstCIF.add(ci);
        /*Observar cuadrantes Inicio Fin
        System.out.println("ci: "+ci.getCoordenada());*/
        return lstCIF;
    }
    public ArrayList<CuadranteMuro> setLstCF(CuadranteMuro cm)
    {
        lstCM.add(cm);
        /*Observar cuadrantes de muros
        System.out.println("ci: "+cm.getCoordenada());*/
        return lstCM;
    }
    public ArrayList<CuadranteNoSeleccionado> setLstNS(CuadranteNoSeleccionado ns)
    {
        lstNS.add(ns);
        return lstNS;
    }
}
