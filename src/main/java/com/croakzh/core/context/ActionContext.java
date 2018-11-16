package com.croakzh.core.context;

import com.jcraft.jsch.Session;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author croakzh
 */
public class ActionContext {

    /**
     * ssh2 连接
     */
    private static Map<String, Session> connections = new ConcurrentHashMap<>();

    /**
     * 增加连接
     *
     * @param host    主机ip
     * @param session session连接
     */
    public static void addConnection(String host, Session session) {
        connections.put(host, session);
    }

    /**
     * 删除连接
     *
     * @param host 主机ip
     */
    public static void removeConnection(String host) {
        if (connections.containsKey(host)) {
            connections.remove(host);
        }
    }

    /**
     * 获取所有的连接
     *
     * @return {@code Map<String, Session>}
     */
    public static Map<String, Session> getConnections() {
        return connections;
    }

}
