import java.util.List;

public class ListPessoa {
   public void listaPessoas(){
       List<Pessoa> pessoas = new Pessoa().listOfPeople();
       System.out.println("-----------SEM DUPLICIDADE DE ID NA LISTA----------------");
       //Utilizando distinct não  vai permitir duplicidade. Obs.: Iquals e Hashcode gerado para distinguir ID
       pessoas.stream()
               .distinct()
               .filter(e -> e.getSexo().equalsIgnoreCase("Femenino"))
               .forEach(System.out::println);

       System.out.println("-----------COM DUPLICIDADE DE ID NA LISTA----------------");
       //Gera duplicidade
       pessoas.stream()
               .filter(e -> e.getSexo().equalsIgnoreCase("Femenino"))
               .forEach(System.out::println);
   }
}
