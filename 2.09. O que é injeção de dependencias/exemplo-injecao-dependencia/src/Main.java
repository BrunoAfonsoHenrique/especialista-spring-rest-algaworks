import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSms;
import com.algaworks.di.service.AtivacaoClienteService;
import com.algaworks.di.service.EmissaoNotaFiscalService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new Cliente("Joao", "Joao@gmail.com", "1122223333");
        Cliente maria = new Cliente("Maria", "maria@gmail.com", "1122224444");

        Notificador notificador = new NotificadorSms();

        AtivacaoClienteService ativacaoCliente =  new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);

        Notificador notificadorDois = new NotificadorEmail();

        EmissaoNotaFiscalService emissao = new EmissaoNotaFiscalService(notificadorDois);
        emissao.emitir(joao, new Produto("Panela", BigDecimal.valueOf(50.0)));

        /**
         * Passo a passo para injetar dependencias e inverter o controle
         *
         * Criar um interface com um método abtsrato
         * Fazer as classes filhas herdarem da interface
         * Criar uma injecao no service Ex: private Notificador notificador
         * Criar um construtor
         * Criar uma instancia na minha classe main. (Ex: Notificador not = new  NotificadorEmail())
         * e dar um new mais especifico passando parametro
         */
    }
}