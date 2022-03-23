package calculator2;
public class Logic {
    debugMessage dg = new debugMessage();
    
    public void load (){
        dg.msg("Clase lógica cargada!\n",1);
    }
    public double sum(String a,String b){
        return Double.parseDouble(a)+Double.parseDouble(b);
    }
    
    public double res (String a, String b){
        return Double.parseDouble(a)-Double.parseDouble(b);
    }
    
    public double mul (String a, String b){
        return Double.parseDouble(a)*Double.parseDouble(b);
    }
    
    public double div (String a, String b){
        return Double.parseDouble(a)/Double.parseDouble(b);
    }
    
    public String ultOp(char type,String Historial0,String Historial1){
        Logic op = new Logic();
        String resultado="0";
        switch(type){
            case 's':
                resultado=Double.toString(op.sum(Historial0, Historial1));
                break;
            case 'r':
                resultado=Double.toString(op.res(Historial0,Historial1));
                break;
            case 'm':
                resultado=Double.toString(op.mul(Historial0,Historial1));
                break;
            case 'd':
                resultado=Double.toString(op.div(Historial0,Historial1));
                break;
            default:
                    resultado= Historial0;
                break;
        }
        return resultado;
    }
}

