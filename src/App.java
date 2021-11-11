import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        Vendedores jose = new Vendedores();
        Clientes maria = new Clientes();
        Produtos tv = new Produtos();
        Vendas notebook = new Vendas();
        Estoque a = new Estoque();
        Fornecedores brastemp = new Fornecedores();
        Transportadora transdonatti = new Transportadora();

        jose.nome = "Jose Vinicius";
        jose.setor = "eletronicos";
        maria.cpf = "03447515031";
        maria.rg = "5127819745";
        tv.nomeProduto = "tv led LG";
        tv.descricao = "30 polegadas, smart com qualidade 4k";
        notebook.dataVenda = LocalDate.of(2021, 6, 8);
        notebook.valor = 1256.99;
        a.codProduto = 1235;
        a.quantidade = 13;
        brastemp.nomeEmpresa = "brastemp";
        brastemp.cnpj = "4561313466483";
        transdonatti.cnpj = "4532135356231";
        transdonatti.entregasConcluidas  = 135;


        System.out.println("funcionario -> "+jose.nome);
        System.out.println("descrição da tv -> "+tv.descricao);
        System.out.println("nome cliente -> "+maria.cpf);
        System.out.println("data da venda do notebook - > "+notebook.dataVenda);
        





    }
}
