import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        // ordem aleatoria
        Set<Series> series = new HashSet<>(){{
            add(new Series("Game of thrones", "ficção", 60));
            add(new Series("Dark", "drama", 60));
            add(new Series("SPN", "ficção", 60));
        }};
        System.out.println(series);
        // ordem de insercao
        Set<Series> series2 = new LinkedHashSet<>(){{
            add(new Series("Game of thrones", "ficção", 60));
            add(new Series("Dark", "drama", 60));
            add(new Series("SPN", "terror", 25));
        }};
        System.out.println(series2);

        // ordem natural por tempoEpisodio
        Set<Series> series3 = new TreeSet<>(series2);
        System.out.println("Lista ordenada: \n"+series3);
    }
}

class Series implements Comparable<Series> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(nome, series.nome) && Objects.equals(genero, series.genero) && Objects.equals(tempoEpisodio, series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }


    @Override
    public int compareTo(Series s) {
        int t = Integer.compare(this.getTempoEpisodio(), s.getTempoEpisodio());
        if(t != 0) {
            return t;
        }
        return this.getGenero().compareToIgnoreCase(s.getGenero());
    }
}
