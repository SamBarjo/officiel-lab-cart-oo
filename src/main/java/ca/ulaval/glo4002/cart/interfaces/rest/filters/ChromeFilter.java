package ca.ulaval.glo4002.cart.interfaces.rest.filters;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class ChromeFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext request) {
        String userAgent = request.getHeaders().getFirst("User-Agent");
        if (userAgent.contains("Chrome")) {
            request.abortWith(Response.status(Response.Status.BAD_REQUEST).build());
        }
    }
}
