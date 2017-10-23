package Principal;

public class Manhattan {
    //metodo para asignar heuristico a cuadrante inicio
    public int distanciaPuntos(Cuadrante.CuadranteInicioFin q, Cuadrante.CuadranteInicioFin p){
        //distancia resultante
        int d=0;
        
        //valores de las coordenadas
        int q1=q.getX();
        int p1=p.getX();
        int q2=q.getY();
        int p2=p.getY();
        
        //Según formula Daniel
        //valor absuluto op1
        int op1=q1-p1;
        if(op1<0)
            op1=op1*-1;
        
        //valor absoluto op2
        int op2=q2-p2;
        if(op2<0)
            op2=op2*-1;
        
        d=op1+op2;
        
        
        return d;
    }
    
    //metodo paraasignar heuristico a cuadrantes no seleccionados y punto final
    public int distanciaPuntos2(Cuadrante.CuadranteNoSeleccionado q, Cuadrante.CuadranteInicioFin p){
        //distancia resultante
        int d=0;
        
        //valores de las coordenadas
        int q1=q.getX();
        int p1=p.getX();
        int q2=q.getY();
        int p2=p.getY();
        
        //Según formula Daniel
        //valor absuluto op1
        int op1=q1-p1;
        if(op1<0)
            op1=op1*-1;
        
        //valor absoluto op2
        int op2=q2-p2;
        if(op2<0)
            op2=op2*-1;
        
        d=op1+op2;
        
        
        return d;
    }
    
    
}
