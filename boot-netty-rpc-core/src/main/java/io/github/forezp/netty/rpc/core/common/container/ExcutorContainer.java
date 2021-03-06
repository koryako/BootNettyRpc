package io.github.forezp.netty.rpc.core.common.container;

import io.github.forezp.netty.rpc.core.protocol.client.ResponseHandler;
import io.github.forezp.netty.rpc.core.loadbalance.LoadBalanceExcutor;
import io.github.forezp.netty.rpc.core.monitor.trace.Monitor;
import io.github.forezp.netty.rpc.core.protocol.server.RequestHandler;
import io.github.forezp.netty.rpc.core.protocol.client.IClientExcutor;
import io.github.forezp.netty.rpc.core.protocol.client.RequestInterceptor;
import io.github.forezp.netty.rpc.core.protocol.server.ServerExcutor;
import io.github.forezp.netty.rpc.core.registry.ClientDiscovery;


/**
 * ${DESCRIPTION}
 *
 * @author fangzhipeng
 * create 2018-05-25
 **/
public class ExcutorContainer {

    private IClientExcutor clientExcutor;
    private ServerExcutor serverExcutor;

    private RequestHandler serverRequestHandler;
    private RequestInterceptor requestInterceptor;
    private ResponseHandler responseHandler;

    private LoadBalanceExcutor loadBalanceExcutor;

    private ClientDiscovery clientDiscovery;

    private Monitor monitor;

    public IClientExcutor getClientExcutor() {
        return clientExcutor;
    }

    public void setClientExcutor(IClientExcutor clientExcutor) {
        this.clientExcutor = clientExcutor;
    }

    public ServerExcutor getServerExcutor() {
        return serverExcutor;
    }

    public void setServerExcutor(ServerExcutor serverExcutor) {
        this.serverExcutor = serverExcutor;
    }

    public RequestHandler getServerRequestHandler() {
        return serverRequestHandler;
    }

    public void setServerRequestHandler(RequestHandler serverRequestHandler) {
        this.serverRequestHandler = serverRequestHandler;
    }

    public RequestInterceptor getRequestInterceptor() {
        return requestInterceptor;
    }

    public void setRequestInterceptor(RequestInterceptor requestInterceptor) {
        this.requestInterceptor = requestInterceptor;
    }

    public ResponseHandler getResponseHandler() {
        return responseHandler;
    }

    public void setResponseHandler(ResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
    }

    public LoadBalanceExcutor getLoadBalanceExcutor() {
        return loadBalanceExcutor;
    }

    public void setLoadBalanceExcutor(LoadBalanceExcutor loadBalanceExcutor) {
        this.loadBalanceExcutor = loadBalanceExcutor;
    }

    public ClientDiscovery getClientDiscovery() {
        return clientDiscovery;
    }

    public void setClientDiscovery(ClientDiscovery clientDiscovery) {
        this.clientDiscovery = clientDiscovery;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
