package devteamcool;

import com.google.gwt.user.server.rpc.RPCRequest;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
public class ServiceImpl extends RemoteServiceServlet implements Service {
    private static final long serialVersionUID = -1340597828499573232L;

    @Override
    protected void onAfterRequestDeserialized(RPCRequest rpcRequest) {
      //Do something about it if you want to
    }

    @Override
    protected void doUnexpectedFailure(Throwable e) {
      //Log error if you want to
    }
}
