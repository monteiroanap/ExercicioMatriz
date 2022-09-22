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
        temperaturas [1][0] = -3;
        temperaturas [2][0] = -8;
        temperaturas [3][0] = 4;
        temperaturas [4][0] = 6;
        temperaturas [5][0] = 5;
        temperaturas [6][0] = 0;
        temperaturas [7][0] = -7;
        temperaturas [8][0] = -1;
        temperaturas [9][0] = -10;

        temperaturas [0][0] = 33;
        temperaturas [1][1] = 32;
        temperaturas [2][1] = 27;
        temperaturas [3][1] = 37;
        temperaturas [4][1] = 42;
        temperaturas [5][1] = 43;
        temperaturas [6][1] = 39;
        temperaturas [7][1] = 26;
        temperaturas [8][1] = 31;
        temperaturas [9][1] = 35;

        int maiorTemperatura = temperaturas[0][0];
        int menorTemperatura = temperaturas[0][0];
        String cidadeMaiorTemperatura = cidade[0];
        String cidadeMenorTemperatura = cidade[0];

        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 2; j++) {
                if(menorTemperatura > temperaturas[i][j] ){
                    menorTemperatura = temperaturas[i][j];
                    cidadeMenorTemperatura = cidade[i];
                }
                if(maiorTemperatura < temperaturas[i][j]){
                    maiorTemperatura = temperaturas[i][j];
                    cidadeMaiorTemperatura = cidade[i];
                }
            }
        }
        System.out.println(cidadeMenorTemperatura + " com " + menorTemperatura + " graus");
        System.out.println(cidadeMaiorTemperatura + " com " + maiorTemperatura + " graus");














    }
}
