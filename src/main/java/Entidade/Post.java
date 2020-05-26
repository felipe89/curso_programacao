package Entidade;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

    private Date momentos;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentarios> comentarios = new ArrayList<>();

    public Post(java.util.Date parse, String traveling_to_new_zealand, String conteudo, int likes) {
    }

    public Post(Date momentos, String titulo, String conteudo, Integer likes) {
        this.momentos = momentos;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomentos() {
        return momentos;
    }

    public void setMomentos(Date momentos) {
        this.momentos = momentos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void addComment(Comentarios comment) {
        comentarios.add(comment);
    }

    public void removeComment(Comentarios comment) {
        comentarios.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(momentos) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comments:\n");
        for (Comentarios c : comentarios) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
