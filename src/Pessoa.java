import java.util.List;
import java.util.Objects;

public class Pessoa {
    private Long id;
    private String nome;
    private Integer idade;
    private String sexo;

    public Pessoa(){}

    private Pessoa(Long id, String nome, Integer idade, String sexo){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    List<Pessoa> listOfPeople(){
        Pessoa pessoa1 = new Pessoa(1L, "Maria", 29, "Femenino");
        Pessoa pessoa2 = new Pessoa(2L, "Arney", 35, "Masculino");
        Pessoa pessoa3 = new Pessoa(3L, "Jaqueline", 17, "Femenino");
        Pessoa pessoa4 = new Pessoa(4L, "Ana", 39, "Femenino");
        Pessoa pessoa5 = new Pessoa(5L, "Maycon", 19, "Masculino");
        Pessoa pessoa6 = new Pessoa(6L, "Miriam", 22, "Femenino");
        Pessoa pessoa7 = new Pessoa(1L, "Mariana", 29, "Femenino");
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
