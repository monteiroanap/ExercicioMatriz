package atividade;

public class AtividadeProposta {
    public static void main(String[] args){

        String cidade[] = new String[10];
        cidade[0] = "Londres";
        cidade[1] = "Ney York";
        cidade[2] = "Sao Paulo";
        cidade[3] = "Madrid";
        cidade[4] = "Buenos Aires";
        cidade[5] = "Lima";
        cidade[6] = "Lisboa";
        cidade[7] = "Tokio";
        cidade[8] = "Chile";
        cidade[9] = "Asuncion";

    int temperaturas [][] = new int [10][2];
        temperaturas [0][0] = -2;
        temperaturas [0][1] = 33;
        temperaturas [1][0] = -3;
        temperaturas [1][1] = 32;
        temperaturas [2][0] = -8;
        temperaturas [2][1] = 27;
        temperaturas [3][0] = 4;
        temperaturas [3][1] = 37;
        temperaturas [4][0] = 6;
        temperaturas [4][1] = 42;
        temperaturas [5][0] = 5;
        temperaturas [5][1] = 43;
        temperaturas [6][0] = 0;
        temperaturas [6][1] = 39;
        temperaturas [7][0] = -7;
        temperaturas [7][1] = 26;
        temperaturas [8][0] = -1;
        temperaturas [8][1] = 31;
        temperaturas [9][0] = -10;
        temperaturas [9][1] = 35;

        int cidadeMaiorTemperatura = 0;
        int cidadeMenorTemperatura = 0;


        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i][0] < temperaturas[cidadeMenorTemperatura][0]){
                cidadeMenorTemperatura = i;
            }
            if(temperaturas[i][1] > temperaturas[cidadeMaiorTemperatura][1]){
                cidadeMaiorTemperatura = i;
            }

        }
        System.out.println(cidade[cidadeMenorTemperatura] + " teve a temperatura minima de " + temperaturas[cidadeMenorTemperatura][0] + " graus");
        System.out.println(cidade[cidadeMaiorTemperatura] + " teve a temperatura maxima de  " + temperaturas[cidadeMaiorTemperatura][1] + " graus");

    }
}
