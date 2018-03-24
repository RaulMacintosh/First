import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CallbackClientInterface extends Remote {
	public int getTamanhoSala() throws RemoteException;
	public String getNome() throws RemoteException;
	public int getScore() throws RemoteException;
	public void defineTamanhoSala() throws RemoteException;
	public void mostrarPergunta() throws RemoteException;
	public void imprimirMensagem(String mensagem) throws RemoteException;
	public void responder() throws RemoteException;
}