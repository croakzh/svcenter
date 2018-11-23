package com.croakzh;

import com.croakzh.core.entity.CpuInfo;
import com.croakzh.core.utils.ParseUtils;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * @author croakzh
 */
public class Main {

    private static ChannelExec channelExec;
    private static Session session;
    private static int timeout = 60000;

    public static void main(String[] args) {
        String line = "CPU family:            6";
        String[] splits = Pattern.compile(":\\s").split(line);
        System.out.println(splits.length);


//        books.forEach((k,v) -> {
//            v.mine = v.mine?"1":"2";
//        });
    }

    public static class Book {
        private String name;
        private Boolean mine;

        public Book(String name, Boolean mine) {
            this.name = name;
            this.mine = mine;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getMine() {
            return mine;
        }

        public void setMine(Boolean mine) {
            this.mine = mine;
        }
    }


    public static void test01() {
        CpuInfo cpuInfo = new CpuInfo();
        cpuInfo.setPerCpus(new ArrayList<CpuInfo.CpuDetailInfo>() {
            {
                add(new CpuInfo.CpuDetailInfo("", "", 1, 1L));
                add(new CpuInfo.CpuDetailInfo("", "", 2, 1L));
                add(new CpuInfo.CpuDetailInfo("", "", 3, 1L));
                add(new CpuInfo.CpuDetailInfo("", "", 4, 1L));
            }
        });
        System.out.println(cpuInfo.toString());
    }

    public static void test02() throws Exception {
        JSch jsch = new JSch();
        session = jsch.getSession("root", "47.99.37.210", 22);
        session.setPassword("Tc5Xa0Sk");
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config); // 为Session对象设置properties
        session.setTimeout(timeout); // 设置timeout时间
        session.connect(); // 通过Session建立链接

        channelExec = (ChannelExec) session.openChannel("exec");
        channelExec.setCommand("ls".getBytes());
        channelExec.setInputStream(null);
        channelExec.setErrStream(System.err);
        channelExec.connect();
        InputStream in = channelExec.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in, Charset.forName("UTF-8")));
        String buf = null;
        while ((buf = reader.readLine()) != null) {
            System.out.println(buf);
        }
        session.noMoreSessionChannels();
        reader.close();
        channelExec.disconnect();
    }

}
