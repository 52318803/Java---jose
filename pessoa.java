public class pessoa {
    private float peso;
    private float altura;
    private String sexo;


    //PESO
    public void setPeso(float valor_peso) {
        peso = valor_peso;                           //peso
    }
    public float getPeso(){
        return peso;
    }


    //ALTURA
    public void setAltura(float valor_altura) {
        altura = valor_altura;                       //altura
    }
    public float getAltura(){
        return altura;
    }


    //SEXO
    public void setSexo(String valor_sexo) {    
        sexo = valor_sexo;                           //sexo   
    }



    //CONTA DO PESO IDEAL
    public float getPeso_ideal(){
        if (sexo.contentEquals("M")){  
            peso = 72.7f * altura - 58f;        //masculino     

        } else {
            peso = 62.1f * altura - 44.7f;      //feminino
        }

        return peso;
    }


}