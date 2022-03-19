package calculator2;
public class Logic {
    debugMessage dg = new debugMessage();
    
    public void load (){
        dg.msg("Clase lógica cargada!\n",1);
    }
    public double sum(double res,String a){
        dg.msg("PREOPERACION\nVariable:\nres: "+Double.toString(res)+"\na: "+a);
        double resultado=res+Double.parseDouble(a);
        dg.msg("\nPOSTOPERACION\nVariable:\nres: "+Double.toString(res)+"\na: "+a+"\nResultado: "+Double.toString(resultado)+"\n");
        return resultado;
    }
    public String ultOp(char type,double result,String resultado){
        Logic op = new Logic();
        switch(type){
            case 's':
                resultado=Double.toString(op.sum(result, resultado));
                break;
            case 'r':
                break;
            case 'm':
                break;
            case 'd':
                break;
        }
        return resultado;
    }
    }

