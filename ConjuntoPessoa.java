import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class ConjuntoPessoa {
    private ArrayList<Pessoa> lista;
	private Pessoa pessoa;
 public ConjuntoPessoa() {
	 this.lista = new ArrayList<Pessoa>();
	 
 }
 public void cadastrar(Pessoa novoCadastro) {
for (int i=0;i<lista.size();i++) 
{
if(lista.get(i).getCpf().equalsIgnoreCase(pessoa.getCpf())) {
throw new RuntimeException("CPF já foi cadastrafo");	
}	
else 
{
lista.add(pessoa);	
}	
}
}
 public void listaPessoas()
 {
if (lista.size() == 0)
{
throw new RuntimeException("Não esta cadastrado");
}
for (int i = 0;i<lista.size();i++) {
	
}
}
}
