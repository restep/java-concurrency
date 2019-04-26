package com.restep.ch02;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.math.BigInteger;

/**
 * 无状态的对象永远是线程安全的
 * @author restep
 * @date 2019/3/13
 */
public class StatelessFactorizer extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        BigInteger i = extractFromRequest(request);
        BigInteger[] factors = factor(i);
        encodeIntoResponse(response, factors);
    }

    void encodeIntoResponse(ServletResponse response, BigInteger[] factors) {

    }

    BigInteger extractFromRequest(ServletRequest request) {
        return new BigInteger("7");
    }

    BigInteger[] factor(BigInteger i) {
        return new BigInteger[]{i};
    }
}
