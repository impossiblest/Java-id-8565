package com.baidu.ee.msg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 消息动态代理类
 * @author mozhuoda
 *
 */
public class MsgProxy implements InvocationHandler {
	private static MsgProxy singleton;
	private MsgProxy(){}
	private Object target;//委托类
	/**
	 * 绑定委托对象<br>
	 * 并返回一个代理类
	 * @param target
	 * @return
	 */
	public Object bind(Object target){
		this.target = target;
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), 
				this.target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		//执行方法
		result = method.invoke(this.target, args);
		return result;
	}

	/**
	 * 获取动态代理类实例
	 * @return
	 */
	public static MsgProxy getInstance(){
		if(singleton==null){
			synchronized(MsgProxy.class){
				if(singleton==null){
					singleton = new MsgProxy();
				}
			}
		}
		return singleton;
	}
}
