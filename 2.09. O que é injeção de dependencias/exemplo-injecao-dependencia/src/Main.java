import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSms;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new Cliente("Joao", "Joao@gmail.com", "1122223333");
        Cliente maria = new Cliente("Maria", "maria@gmail.com", "1122224444");

        Notificador notificador = new NotificadorSms();

        AtivacaoClienteService ativacaoCliente =  new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}