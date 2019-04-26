package com.restep.ch02;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author restep
 * @date 2019/3/13
 */
public class CountingFactorizer extends GenericServlet {
    private final AtomicLong count = new AtomicLong(0);

    public long getCount() {
        return count.get();
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        count.incrementAndGet();
        encodeIntoResponse(resp, factors);
    }

    void encodeIntoResponse(ServletResponse res, BigInteger[] factors) {

    }

    BigInteger extractFromRequest(ServletRequest req) {
        return null;
    }

    BigInteger[] factor(BigInteger i) {
        return null;
    }
}
