
import javax.swing.JOptionPane;
import ws.org.*;
/**
 *
 * @author Claudionor
 */
public class ClienteWSPrincipal {
    
    public static void main(String[] args) {
        
        WSMultiplicacao_Service servico = new WSMultiplicacao_Service();
        WSMultiplicacao porta = servico.getWSMultiplicacaoPort();
        
        double resposta = porta.multiplicacao(30, 30);
        
        System.out.println("Resposta: " + resposta); 
        
        JOptionPane.showMessageDialog(null, resposta);
    }
    
}
