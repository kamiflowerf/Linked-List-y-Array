package MergeSort;

import MergeSort.Estudiante;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        List<Estudiante> estudiantes = genEstudiante(n);

        System.out.println("Estudiantes sin organizar: \n");

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).toString());
        }

        System.out.println("Estudiantes organizados: \n");

        Ordenador sorter = new Ordenador();
        estudiantes = sorter.ordenarMergeSort(estudiantes, false);

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).toString());
        }

    }

    public static List<Estudiante> genEstudiante(int n) {
        List<Estudiante> estudiantes = new ArrayList<>();
        int matricula = 10150000;
        double randIndice;
        for (int i = 0; i < n; i++) {
            randIndice = (Math.random() * 100);
            DecimalFormat df = new DecimalFormat("#.##");
            Estudiante est = new Estudiante(matricula + i+1, "Estudiante No." + (i+1), Double.parseDouble(df.format(randIndice)));
            estudiantes.add(est);
        }
        return estudiantes;
    }

    static class Ordenador{

        public List<Estudiante> ordenarMergeSort(List<Estudiante> listaSinOrdenar, boolean ascendente) {
            if (listaSinOrdenar.size() <= 1) {
                return listaSinOrdenar;
            }

            int medio = listaSinOrdenar.size() / 2;
            List<Estudiante> izquierda = new ArrayList<>(listaSinOrdenar.subList(0, medio));
            List<Estudiante> derecha = new ArrayList<>(listaSinOrdenar.subList(medio, listaSinOrdenar.size()));

            izquierda = ordenarMergeSort(izquierda, ascendente);
            derecha = ordenarMergeSort(derecha, ascendente);

            return merge(izquierda, derecha, ascendente);
        }

        private List<Estudiante> merge(List<Estudiante> izquierda, List<Estudiante> derecha, boolean ascendente) {
            List<Estudiante> resultado = new ArrayList<>();
            int i = 0, j = 0;

            while (i < izquierda.size() && j < derecha.size()) {
                if ((ascendente && izquierda.get(i).getIndiceAcademico() <= derecha.get(j).getIndiceAcademico()) ||
                        (!ascendente && izquierda.get(i).getIndiceAcademico() >= derecha.get(j).getIndiceAcademico())) {
                    resultado.add(izquierda.get(i));
                    i++;
                } else {
                    resultado.add(derecha.get(j));
                    j++;
                }
            }

            while (i < izquierda.size()) {
                resultado.add(izquierda.get(i));
                i++;
            }

            while (j < derecha.size()) {
                resultado.add(derecha.get(j));
                j++;
            }

            return resultado;
        }

    }
}