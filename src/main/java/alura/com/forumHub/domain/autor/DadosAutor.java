package alura.com.forumHub.domain.autor;

public record DadosAutor(Long id, String nome, String email) {

    public DadosAutor(Autor autor){

        this(autor.getId(),
             autor.getNome(),
             autor.getEmail());
    }

}
