/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Cuadrante.CuadranteFinal;
import Cuadrante.CuadranteInicio;
import java.util.ArrayList;

/**
 *
 * @author IApp A*
 */
public class Proceso 
{
    static ArrayList<CuadranteInicio> lstCI=new ArrayList<CuadranteInicio>();
    static ArrayList<CuadranteFinal> lstCF=new ArrayList<CuadranteFinal>();
    
    public CuadranteInicio setCI(String btnName)
    {
        String coordenada=btnName.trim();
        String aux=coordenada.split("[\\(||//)]")[1].toString();
        int x=Integer.parseInt(aux.split(";")[0].toString());
        int y=Integer.parseInt(aux.split(";")[1].toString());
        CuadranteInicio ci=new CuadranteInicio(btnName, x, y);
        ci.setCoordenada(coordenada);
        ci.setX(x);
        ci.setY(y);
        return ci;
    }
    public CuadranteFinal setCF(String btnName)
    {
        String coordenada=btnName.trim();
        String aux=coordenada.split("[\\(||//)]")[1].toString();
        int x=Integer.parseInt(aux.split(";")[0].toString());
        int y=Integer.parseInt(aux.split(";")[1].toString());
        CuadranteFinal cf=new CuadranteFinal(btnName, x, y);
        cf.setCoordenada(coordenada);
        cf.setX(x);
        cf.setY(y);
        return cf;
    }
    public ArrayList<CuadranteInicio> setLstCI(CuadranteInicio ci)
    {
        lstCI.add(ci);
        return lstCI;
    }
    public ArrayList<CuadranteFinal> setLstCF(CuadranteFinal cf)
    {
        lstCF.add(cf);
        return lstCF;
    }
}
