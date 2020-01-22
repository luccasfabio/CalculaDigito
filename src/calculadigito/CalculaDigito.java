/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadigito;

/**
 *
 * @author luccaskammer
 */
public class CalculaDigito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        {
            int x = 0;
            int peso = 2;
            int variavel = 0;
            int contador = 0;
            int resto = 0;
            String inscricaoMunicipal = "1964341";

            int tamanhoString = inscricaoMunicipal.length();
            int posicao = tamanhoString;

            while (x <= tamanhoString - 1) {
                variavel = Integer.parseInt(inscricaoMunicipal.substring(posicao - 1, posicao));

                contador = contador + (variavel * peso);
                peso++;
                posicao--;
                variavel--;

                if (peso > 9) {
                    peso = 2;
                }

                x++;

            }

            resto = contador % 11;

            if (11 - resto == 11) {
                System.out.println("0");
            } else if (11 - resto == 10) {
                System.out.println("1");
            } else {
                System.out.println(11 - resto);
            }
        }

    }
}
