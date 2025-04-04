package com.mybatisinterceptorstudy.interceptor;

import ch.qos.logback.core.util.StringUtil;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.logging.log4j.util.Strings;

import java.util.Properties;

@Intercepts({
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
})
public class MyBatisLogInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        String method = invocation.getMethod().getName();

        Object[] args = invocation.getArgs();
        Object param = args[1];

        if ("update".equals(method)) {
            return invocation.proceed();
        } else if ("query".equals(method)) {
            MappedStatement ms = (MappedStatement) args[0];
            System.out.println(String.format("수행된 Query ID : %s", ms.getId()));
        }

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Interceptor.super.plugin(target);
    }

    @Override
    public void setProperties(Properties properties) {
        Interceptor.super.setProperties(properties);
    }
}
