/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAMM.EntornosDD.Unitat4.calc;




/**
 *
 * @author umate20
 */
public class Calculadora {
   private float lastResult;
    private String lastOp;

    public float getLastResult(){
        return this.lastResult;
    }

    public String getLastOp(){
        return this.lastOp;
    }

    public float suma(float op1, float op2){
        float result = op1 + op2;
        this.lastResult=result;
        this.lastOp="Suma";

        return result;
    }

    public float resta(float op1, float op2){
        float result=op1-op2;
        this.lastResult=result;
        this.lastOp="Resta";

        return result;
    }

    public float multiplica(float op1,float op2){
        //Fem els càlculs
        float result=op1*op2;

        //Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Multiplica";

        //I finalment retornem els resultats
        return result;
    }

    public float divideix(float op1,float op2){
        //Fem els càlculs
        float result=op1/op2;

        //Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Divideix";
        
        //I finalment retornem els resultats
        return result;
    }
    
    public float majorque(float op1, float op2){
        //Fem els càlculs
        float result;
         if (op1>op2) {
		result=op1;
	    } 
        else {
	    result=op2;
	    }
        //Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="MajorQue";

        //I finalment retornem els resultats
        return result;
     }

}