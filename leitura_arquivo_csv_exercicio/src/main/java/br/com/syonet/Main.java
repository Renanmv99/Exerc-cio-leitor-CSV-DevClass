package br.com.syonet;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Filial> filiais = CSVReader.readCSV("arquivo_fornecido.csv");
        Filial maiorMedia = calcularMaiorMedia(filiais);
        if (maiorMedia != null) {
            System.out.println("Filial com a maior média de visitas: " + maiorMedia.getNome());
        } else {
            System.out.println("Nenhuma filial encontrada.");
        }
    }

    private static Filial calcularMaiorMedia(List<Filial> filiais) {
        Filial melhorFilial = null;
        double maiorMedia = 0;
        for (Filial filial : filiais) {
            double mediaMensal = filial.getVisitasMensais().stream().mapToInt(Integer::intValue).average().orElse(0);
            if (mediaMensal > maiorMedia) {
                maiorMedia = mediaMensal;
                melhorFilial = filial;
            }
        }
        return melhorFilial;
    }
}

