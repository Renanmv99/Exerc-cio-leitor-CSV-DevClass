package br.com.syonet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Filial> readCSV(String filePath) {
        List<Filial> filiais = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
            
                try {
                    Integer.parseInt(values[4]);
                } catch (NumberFormatException e) {
                    continue;
                }

                if (values.length >= 18) {
                    Filial filial = new Filial();
                    filial.setNome(values[0]);
                    filial.setEndereco(values[1]);
                    filial.setCidade(values[2]);
                    filial.setCodigoPostal(values[3]);

                    List<Integer> visitas = new ArrayList<>();
                    for (int i = 4; i < 16; i++) {
                        visitas.add(Integer.parseInt(values[i]));
                    }
                    filial.setVisitasMensais(visitas);
                    filial.setVisitasAnuais(Integer.parseInt(values[16]));
                    filial.setGeolocalizacao(values[17]);
                    filiais.add(filial);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filiais;
    }
}
