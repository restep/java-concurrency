package com.restep.ch05;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;

/**
 * @author restep
 * @date 2019/3/15
 */
public class Factorizer extends GenericServlet {
    private final Computable<BigInteger, BigInteger[]> c = arg -> factor(arg);

    private final Computable<BigInteger, BigInteger[]> cache = new Memoizer<>(c);

    @Override
    public void service(ServletRequest req, ServletResponse resp) {
        try {
            BigInteger i = extractFromRequest(req);
            encodeIntoResponse(resp, cache.compute(i));
        } catch (InterruptedException e) {
            encodeError(resp, "factorization interrupted");
        }
    }

    void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {

    }

    void encodeError(ServletResponse resp, String errorString) {

    }

    BigInteger extractFromRequest(ServletRequest req) {
        return new BigInteger("7");
    }

    BigInteger[] factor(BigInteger i) {
        return new BigInteger[]{i};
    }
}
