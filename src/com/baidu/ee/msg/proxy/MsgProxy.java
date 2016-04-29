package com.baidu.ee.msg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��Ϣ��̬������
 * @author mozhuoda
 *
 */
public class MsgProxy implements InvocationHandler {
	private static MsgProxy singleton;
	private MsgProxy(){}
	private Object target;//ί����
	/**
	 * ��ί�ж���<br>
	 * ������һ��������
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
		//ִ�з���
		result = method.invoke(this.target, args);
		return result;
	}

	/**
	 * ��ȡ��̬������ʵ��
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
