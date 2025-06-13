// swingpoo.Arquivo
package Telas; // Adjust package as needed

import Telas.EProfessor; // Assuming EProfessor is in this package
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

    public static void gerarArquivoTabela(String caminhoArquivo, ArrayList<EProfessor> listaProfessores) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            // Write header
            writer.write(String.format("%-10s %-30s %-15s %-15s %-10s %-20s %-15s %-20s%n",
                "ID Prof", "Nome", "CPF", "Dt Nasc", "Sexo", "Disciplina", "Turma", "Titularidade"));
            writer.write("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");

            // Write data
            for (EProfessor professor : listaProfessores) {
                writer.write(String.format("%-10s %-30s %-15s %-15s %-10s %-20s %-15s %-20s%n",
                    professor.getIdProfessor(),
                    professor.getNomeUsuario(),
                    professor.getCpfUsuario(),
                    professor.getDataNascUsuario(),
                    professor.getSexoUsuario(),
                    professor.getDisciplinaMinistrada(),
                    professor.getTurmaEnsinada(),
                    professor.getGrauTitularidade()));
            }
        }
    }
}