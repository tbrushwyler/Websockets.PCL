package websockets.DroidBridge;

/**
 * Created by Taylor on 5/24/16.
 */
public class BridgeProxy {
    public void RaiseOpened     (){    }
    public void RaiseClosed     (){    }
    public void RaiseMessage    (String message){    }
    public void RaiseLog        (String message){    }
    public void RaiseError      (String message){    }
}