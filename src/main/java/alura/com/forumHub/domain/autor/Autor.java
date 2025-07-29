package alura.com.forumHub.domain.autor;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "autor")
@Table(name= "autores")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    public Autor(DadosAutor dados){
        this.nome = dados.nome();
        this.email = dados.email();

    }
}
